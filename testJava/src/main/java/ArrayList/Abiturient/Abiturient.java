package ArrayList.Abiturient;

import lombok.Getter;


public class Abiturient implements Comparable<Abiturient> {

    private String surname;
    private String name;
    @Getter
    private int firstMarker;
    @Getter
    private int secondMarker;
    @Getter
    private int thirdMarker;

   public Abiturient(String surname, String name, int firstMarker, int secondMarker,int thirdMarker){
       this.surname = surname;
       this.name = name;
       this.firstMarker = firstMarker;
       this.secondMarker = secondMarker;
       this.thirdMarker = thirdMarker;
   }

    public Abiturient() {
    }

    public double averageMarks() {
        return (firstMarker + secondMarker + thirdMarker)/3.;
    }

    public String getTitle() {
        return surname;
    }

    @Override
    public String toString() {
        return  surname + ";" + name + ";" + firstMarker + ";" + secondMarker + ";" + thirdMarker + ";" + String.format("%.1f",averageMarks());
    }

    public int compareTo(Abiturient o) {
        int surnameCompare = surname.compareTo(o.surname);
        if (surnameCompare != 0) {
            return surnameCompare;
        }
        return name.compareTo(o.name);
    }
}
