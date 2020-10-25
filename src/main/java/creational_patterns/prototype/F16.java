package creational_patterns.prototype;

public class F16 implements IAircraftPrototype {

    private String engine;

    public void fly() {
        String engineStr = engine != null ? engine : "no engine";
        System.out.println("F16 is flying with " + engineStr);
    }

    public IAircraftPrototype clone() {
        return new F16();
    }

    public void setEngine(String engineType) {
        this.engine = engineType;
    }
}
