// 날 수 있는 동물
public interface FlyingAnimal extends Animal, Movable {
    void fly();
    void land();
    int getAltitude();
}
