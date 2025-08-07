public class GenericDynamicArray<T> {
    private Object[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public GenericDynamicArray() {
        items = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // TODO: 요소 추가 메서드를 작성하세요
    // 메서드명: add, 매개변수: T item
    // ensureCapacity() 호출 후 요소를 배열 끝에 추가
    public void add(T item) {
        ensureCapacity();
        items[size++] = item;
    }


    // TODO: 특정 위치에 요소 삽입 메서드를 작성하세요
    // 메서드명: insert, 매개변수: int index, T item
    // 인덱스가 범위를 벗어나면 IndexOutOfBoundsException 던지기
    // ensureCapacity() 호출 후 요소들을 뒤로 이동시키고 삽입
    public void insert(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
        size++;
    }


    // TODO: 요소 가져오기 메서드를 작성하세요
    // 메서드명: get, 매개변수: int index
    // 인덱스 검사 후 해당 요소를 T 타입으로 캐스팅하여 반환
    public T get(int index) {
        checkIndex(index);
        return (T) items[index];
    }


    // TODO: 요소 설정 메서드를 작성하세요
    // 메서드명: set, 매개변수: int index, T item
    // 인덱스 검사 후 해당 위치의 요소를 교체
    public void set(int index, T item) {
        checkIndex(index);
        items[index] = item;
    }


    // TODO: 요소 제거 메서드를 작성하세요
    // 메서드명: remove, 매개변수: int index
    // 인덱스 검사 후 해당 요소 제거하고 뒤의 요소들을 앞으로 이동
    // 배열이 1/4 미만으로 사용되면 resize(items.length / 2) 호출
    // 제거된 요소를 T 타입으로 반환
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) items[index];
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        items[--size] = null;
        if (size > 0 && size < items.length / 4) {
            resize(items.length / 2);
        }
        return removed;
    }


    // TODO: 크기 반환, 비어있는지 확인, 모든 요소 제거 메서드들을 작성하세요
    // 메서드명: size(), isEmpty(), clear()
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    // TODO: 용량 확보 메서드를 작성하세요
    // 메서드명: ensureCapacity
    // size가 items.length와 같으면 resize(items.length * 2) 호출
    private void ensureCapacity() {
        if (size == items.length) {
            resize(items.length * 2);
        }
    }


    // TODO: 크기 조정 메서드를 작성하세요
    // 메서드명: resize, 매개변수: int newCapacity
    // 새 배열을 생성하고 기존 요소들을 복사
    // "배열 크기 조정: X" 메시지 출력
    private void resize(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[i];
        }
        items = newArray;
        System.out.println("배열 크기 조정: " + newCapacity);
    }


    // TODO: 인덱스 검사 메서드를 작성하세요
    // 메서드명: checkIndex, 매개변수: int index
    // 범위를 벗어나면 IndexOutOfBoundsException 던지기
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }


    // TODO: toString 메서드를 작성하세요
    // 빈 배열이면 "[]" 반환
    // 그렇지 않으면 "[요소1, 요소2, ...]" 형태로 반환
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(items[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }




    // 테스트
    public static void main(String[] args) {
        // 문자열 동적 배열
        GenericDynamicArray<String> strings = new GenericDynamicArray<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        System.out.println("문자열 배열: " + strings);

        strings.insert(1, "Beautiful");
        System.out.println("삽입 후: " + strings);

        strings.remove(2);
        System.out.println("제거 후: " + strings);

        // 정수 동적 배열
        GenericDynamicArray<Integer> numbers = new GenericDynamicArray<>();

        for (int i = 1; i <= 15; i++) {
            numbers.add(i * i);  // 제곱수 추가
        }
        System.out.println("\n정수 배열: " + numbers);

        System.out.println("5번째 요소: " + numbers.get(4));
        numbers.set(4, 999);
        System.out.println("수정 후: " + numbers);
    }
}