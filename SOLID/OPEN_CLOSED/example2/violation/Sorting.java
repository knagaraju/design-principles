package SOLID.OPEN_CLOSED.example2.violation;

import java.util.Collection;

public interface Sorting {
    void sortStrings(Collection<String> input);
    void sortNumbers(Collection<Number> input);
}