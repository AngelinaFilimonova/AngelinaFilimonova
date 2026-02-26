package ArrayList.Abiturient;

public class MainArray {
    public static void main(String[] args) {
        AbiturientCollection list = new AbiturientCollection();
        list.readAbiturients();
        list.printSort();
        System.out.println();
        list.printDesc();
    }
}
