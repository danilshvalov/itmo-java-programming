public class Director extends Employee {
    Director(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public String display() {
        return String.format(
            "Director %s %s with salary %.2f",
            getFirstName(),
            getLastName(),
            getSalary()
        );
    }
}
