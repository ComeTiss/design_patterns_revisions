package behavioural_patterns.visitor;

public interface IAirplane {

    void accept(IAirplaneVisitor visitor);
}
