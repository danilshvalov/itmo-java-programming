import java.util.ArrayList;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "Ivanov", 10);
        Engineer engineer = new Engineer("Petr", "Petrov", 20, 1);
        
        List<Employee> subordinates = new ArrayList<>();
        subordinates.add(employee);
        subordinates.add(engineer);

        Manager manager = new Manager("Svetlana", "Tamarova", 30, subordinates);
        Director director = new Director("Bogdan", "Ibragimov", 100);
        Secretary secretary = new Secretary("Elena", "Skorohodova", 20, director);

        System.out.println(employee.display());
        System.out.println();

        System.out.println(engineer.display());
        System.out.println();

        System.out.println(manager.display());
        System.out.println();

        System.out.println(secretary.display());
        System.out.println();

        System.out.println(director.display());
        System.out.println();
    }
}
