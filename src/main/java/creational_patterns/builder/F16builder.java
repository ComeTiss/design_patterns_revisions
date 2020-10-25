package creational_patterns.builder;

public class F16builder extends AircraftBuilder {

    private F16 f16;

    @Override
    public void buildEngine() {
        f16.setEngine("engine");
    }

    @Override
    public void buildWings() {
        f16.setWings("wings");
    }

    @Override
    public void buildCockpit() {
        f16 = new F16();
        f16.setCockpit("cockpit");
    }

    public F16 getF16() {
        return f16;
    }
}
