package ArrayList;

import java.util.ArrayList;

public class MyFirstArrayList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        list.add(0, 2.0);
        list.size();
        list.remove(0);
        list.remove(list.size()-1);
        list.contains(4.0);
    }
}
