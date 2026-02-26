package Map.Salary;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SurnameAndSalary implements Comparable<SurnameAndSalary>{
    private final String surname;
    private final Double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurnameAndSalary that = (SurnameAndSalary) o;
        return surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return surname.hashCode();
    }

    @Override
    public String toString() {
        return surname + " " + salary;
    }

    public int compareTo(SurnameAndSalary o) {
        return this.surname.compareTo(o.surname);
    }
}
