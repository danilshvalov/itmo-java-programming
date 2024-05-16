class Greeting {
    public void greet() {
        System.out.println("Hello");
    }
}

public class TotalGreeting {
    public static void main (String[] args) {
        Greeting hello = new Greeting();
        hello.greet();
    }
}
