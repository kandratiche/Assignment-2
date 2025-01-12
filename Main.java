import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Name1", "Sur1", "Manager", 27045.78);
        Employee e2 = new Employee("Name2", "Sur2", "Developer", 50000.00);

        Student s1 = new Student("SName1", "SSur1", 2.5);
        Student s2 = new Student("SName2", "SSur2", 3.2);

        ArrayList<Person> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(s1);
        list.add(s2);
        Collections.sort(list);
        for (Payable payable : list) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }

    }
}