import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DesignANumberContainerSystem {

    static HashMap<Integer, Integer> map;
    HashMap<Integer, TreeSet<Integer>> valueIdxs;

    public DesignANumberContainerSystem() {
        map = new HashMap<>();
        valueIdxs = new HashMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {
            int num = map.get(index);
            valueIdxs.get(num).remove(index);
        }
        map.put(index, number);
        valueIdxs.computeIfAbsent(number, k -> new TreeSet<Integer>()).add(index);
    }

    public int find(int number) {
        return valueIdxs.get(number) == null || valueIdxs.get(number).isEmpty() ? -1 : valueIdxs.get(number).first() ;
    }
}
