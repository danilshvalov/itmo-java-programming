public class Engineer extends Employee {
    private int qualification;

    Engineer(String firstName, String lastName, double salary, int qualification) {
        super(firstName, lastName, salary);
        this.qualification = qualification;
    }

    public int getQualification() {
      return qualification;
    }

    public void setQualification(int qualification) {
      this.qualification = qualification;
    }

    @Override
    public String display() {
        return String.format(
            "Engineer %s %s with salary %.2f and qualification %d",
            getFirstName(),
            getLastName(),
            getSalary(),
            getQualification()
        );
    }
}
