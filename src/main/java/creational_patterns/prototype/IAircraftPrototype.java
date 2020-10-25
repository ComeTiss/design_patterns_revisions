package creational_patterns.prototype;

public interface IAircraftPrototype {

    void fly();

    IAircraftPrototype clone();

    void setEngine(String engineType);
}
