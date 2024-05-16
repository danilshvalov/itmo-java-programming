import java.util.List;


public class Manager extends Employee {
    List<Employee> subordinates;

    Manager(String firstName, String lastName, double salary, List<Employee> subordinates) {
        super(firstName, lastName, salary);
        this.subordinates = subordinates;
    }

    public List<Employee> getSubordinates() {
      return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
      this.subordinates = subordinates;
    }

    @Override
    public String display() {
        StringBuilder subordinatesInfo = new StringBuilder();
        for (Employee e : getSubordinates()) {
            subordinatesInfo.append("\n");
            subordinatesInfo.append(e.display());
        }
        return String.format(
            "Manager %s %s with salary %.2f and subordinates:%s",
            getFirstName(),
            getLastName(),
            getSalary(),
            subordinatesInfo
        );
    }
}
