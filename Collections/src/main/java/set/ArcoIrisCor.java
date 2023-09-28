package set;

import java.util.Comparator;

public class ArcoIrisCor implements Comparator<ArcoIris> {
    @Override
    public int compare(ArcoIris a1, ArcoIris a2) {
        return a1.getCor().compareTo(a2.getCor());
    }
}
