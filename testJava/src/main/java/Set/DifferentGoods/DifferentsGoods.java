package Set.DifferentGoods;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DifferentsGoods implements Comparable<DifferentsGoods> {
    private String title;
    private String countryProduce;
    private int cost;

    @Override
    public String toString() {
        return title + ";" + cost;
    }

    public int compareTo(DifferentsGoods o) {
        int nameCompare = title.compareTo(o.title);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(cost, o.cost);
    }
}
