package creational_patterns.singleton;


/** Only work for single Thread system, else:
 * --> Look AirForceOneThreadSafe */

public class AirForceOne {

    private static AirForceOne airForceOne;

    private AirForceOne() {}

    public void fly() {
        System.out.println("AirForceOne is flying --!!--");
    }

    public static AirForceOne getInstance() {
        if (airForceOne == null) {
            airForceOne = new AirForceOne();
        }

        return airForceOne;
    }
}
