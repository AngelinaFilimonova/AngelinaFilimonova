package Map.Salary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        TreeMap<SurnameAndSalary, Double> surnames = new TreeMap<>();
        try {
            while ((!"end".equals(input = br.readLine()))) {
                String[] parts = input.split(" +");
                SurnameAndSalary salary = new SurnameAndSalary(parts[0], Double.parseDouble(parts[1]));
                Double salaries = salary.getSalary();
                if (surnames.containsKey(salary)) {
                    salaries += surnames.get(salary);
                }
                surnames.put(salary, salaries);
            }
        } catch (Exception e) {
        }
        Set<Map.Entry<SurnameAndSalary, Double>> pairs = surnames.entrySet();
        Iterator<Map.Entry<SurnameAndSalary, Double>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Map.Entry<SurnameAndSalary, Double> pair = iterator.next();
            System.out.printf("%s %.2f%n", pair.getKey().getSurname(), pair.getValue());
        }
    }
}
