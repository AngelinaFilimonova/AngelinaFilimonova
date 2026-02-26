package ArrayList.Commodity;


public class Commodity implements Comparable<Commodity>{
    private String name;
    private  int price;
    private  String countryProduce;

    public Commodity(String name, int price, String countryProduce) {
        this.name = name;
        this.price = price;
        this.countryProduce = countryProduce;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  name + ";" + price + ";" + countryProduce;
    }

    public int compareTo(Commodity o) {
        int nameCompare = name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return nameCompare;
    }
}
