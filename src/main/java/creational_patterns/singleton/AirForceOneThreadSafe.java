package creational_patterns.singleton;

public class AirForceOneThreadSafe {

    private static AirForceOneThreadSafe airForceOne;

    private AirForceOneThreadSafe() {}

    public void fly() {
        System.out.println("AirForceOne is flying with Multi threads --!!--");
    }

    public static AirForceOneThreadSafe getInstance() {
        if (airForceOne == null) {
            synchronized (AirForceOneThreadSafe.class) {
                if (airForceOne == null) {
                    airForceOne = new AirForceOneThreadSafe();
                }
            }
        }

        return airForceOne;
    }
}
