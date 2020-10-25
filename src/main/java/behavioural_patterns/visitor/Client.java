package behavioural_patterns.visitor;


import java.util.Iterator;

public class Client {

    public static void main(String args[]) {
        Airforce airforce = new Airforce();
        airforce.planes.add(new F16());
        airforce.planes.add(new Boeing747());

        Iterator<IAirplane> iterator = airforce.getIterator();
        IAirplaneVisitor metricAirplaneVisitor = new MetricAirplaneVisitor();

        while(iterator.hasNext()) {
            iterator.next().accept(metricAirplaneVisitor);
        }
        metricAirplaneVisitor.printAccumulatedValues();
    }
}
