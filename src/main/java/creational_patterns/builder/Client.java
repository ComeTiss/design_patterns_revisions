package creational_patterns.builder;


public class Client {

    public static void main(String args[]) {
        F16builder f16builder = new F16builder();
        Director director = new Director(f16builder);
        director.construct(false);
        System.out.println(f16builder.getF16().getCockpit());
    }
}
