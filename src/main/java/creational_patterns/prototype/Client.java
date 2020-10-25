package creational_patterns.prototype;


import creational_patterns.builder.Director;
import creational_patterns.builder.F16builder;

public class Client {

    public static void main(String args[]) {
       IAircraftPrototype prototype = new F16();

       IAircraftPrototype f16_A = prototype.clone();
       f16_A.setEngine("engine A");
       f16_A.fly();

       IAircraftPrototype f16_B = prototype.clone();
       f16_B.setEngine("engine B");
        f16_B.fly();
    }
}
