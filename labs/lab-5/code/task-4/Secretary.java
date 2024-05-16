public class Secretary extends Employee {
    private Employee chief;

    Secretary(String firstName, String lastName, double salary, Employee chief) {
        super(firstName, lastName, salary);
        this.chief = chief;
    }

    public Employee getChief() {
      return chief;
    }

    public void setChief(Employee chief) {
      this.chief = chief;
    }

    @Override
    public String display() {
        return String.format(
            "Secretary %s %s with salary %.2f and chief:\n%s",
            getFirstName(),
            getLastName(),
            getSalary(),
            getChief().display()
        );
    }
}
