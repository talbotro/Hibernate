/**
 * Created by robbie on 2/25/2017.
 */
public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Shem", "TheCoolGuy", 10);

        emp1.setLastName("Scott");
        emp1.setFirstName("Michael");
        emp1.setId(7);
        emp2.setId(123);

        System.out.println(emp1);
        System.out.println(emp2);

    }

}
