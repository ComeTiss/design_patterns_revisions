package behavioural_patterns.visitor;

public class MetricAirplaneVisitor implements IAirplaneVisitor {

    public void visitF16(F16 f16) {
        System.out.println("log F16 metrics");
    }

    public void visitBoeing747(Boeing747 boeing747) {
        System.out.println("log Boeing747 metrics");
    }

    public void printAccumulatedValues() {
        System.out.println("printAccumulatedValues");
    }
}
