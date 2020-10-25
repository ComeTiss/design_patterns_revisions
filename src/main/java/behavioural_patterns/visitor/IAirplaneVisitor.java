package behavioural_patterns.visitor;

public interface IAirplaneVisitor {

    void visitF16(F16 f16);

    void visitBoeing747(Boeing747 boeing747);

    void printAccumulatedValues();
}
