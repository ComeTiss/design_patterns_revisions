package creational_patterns.builder;

public class Boeing747builder extends AircraftBuilder {

    private Boing747 boing747;

    @Override
    public void buildEngine() {
        boing747.setEngine("engine");
    }

    @Override
    public void buildWings() {
        boing747.setWings("wings");
    }

    @Override
    public void buildCockpit() {
        this.boing747 = new Boing747();
        boing747.setCockpit("cockpit");
    }

    @Override
    public void buildBathrooms() {
        boing747.setBathroom("bathroom");
    }

    public Boing747 getBoing747() {
        return boing747;
    }
}
