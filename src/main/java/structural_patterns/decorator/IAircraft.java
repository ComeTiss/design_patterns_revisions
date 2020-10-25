package structural_patterns.decorator;

public interface IAircraft {

    float BASE_WEIGHT = 100;

    void fly();

    void land();

    float getWeight();
}
