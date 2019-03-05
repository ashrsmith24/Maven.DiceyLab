
import java.util.List;
import java.util.TreeMap;

public class Bins {
    TreeMap<Integer, Integer> bins = new TreeMap<Integer, Integer>();

    public Bins() {
        createBins();
    }

    public void createBins() {
        for (int i = 1; i <= 6; i++) {
            bins.put(i, 0);
        }
    }

    public void store(Integer tossNum) {
        int currentValue = bins.get(tossNum);
        int increasedValue = currentValue + 1;
        bins.put(tossNum, increasedValue);
    }

    public Integer getNumberOfTosses(Integer valueTossed) {
        return bins.get(valueTossed);
    }

    public int size() {
        return bins.size();
    }
}
