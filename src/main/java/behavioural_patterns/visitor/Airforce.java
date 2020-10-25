package behavioural_patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce {

    List<IAirplane> planes = new ArrayList<IAirplane>();

    Iterator<IAirplane> getIterator() {
        return this.planes.iterator();
    }
}
