import java.util.Iterator;

/**
 * 간단한 연결 리스트 구현
 */
public class SimpleLinkedList<T> {
    private Node head;
    private int size;

    // 노드를 나타내는 내부 클래스
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // 반복자를 구현하는 내부 클래스
    public class ListIterator implements Iterator<T> {
        private Node current;
        private Node previous;

        public ListIterator() {
            current = head;
            previous = null;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            T data = current.data;
            previous = current;
            current = current.next;
            return data;
        }

        // 현재 요소 삭제
        public void remove() {
            if (previous == null) {
                head = current.next;
                current = head;
            } else {
                previous.next = current.next;
                current = current.next;
            }
            size--;
        }

        // 현재 위치에 삽입
        public void insert(T data) {
            Node newNode = new Node(data);
            if (previous == null) {
                newNode.next = head;
                head = newNode;
            } else {
                newNode.next = current;
                previous.next = newNode;
            }
            previous = newNode;
            size++;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public ListIterator iterator() {
        return new ListIterator();
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

// 테스트
class ListTest {
    public static void main(String[] args) {
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        list.add("첫번째");
        list.add("두번째");
        list.add("세번째");

        System.out.println("초기 리스트: " + list);

        SimpleLinkedList<String>.ListIterator it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println("요소: " + item);
            if (item.equals("두번째")) {
                it.insert("새로운");
            }
        }

        System.out.println("수정된 리스트: " + list);
    }
}