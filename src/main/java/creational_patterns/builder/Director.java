package creational_patterns.builder;

public class Director {

    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder builder) {
        this.aircraftBuilder = builder;
    }

    public void construct(boolean isPassenger) {
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildEngine();

        if (isPassenger) {
            aircraftBuilder.buildBathrooms();
        }
    }
}
