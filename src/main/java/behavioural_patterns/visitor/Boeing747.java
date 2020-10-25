package behavioural_patterns.visitor;

public class Boeing747 implements IAirplane {
    public void accept(IAirplaneVisitor visitor) {
        visitor.visitBoeing747(this);
    }
}
