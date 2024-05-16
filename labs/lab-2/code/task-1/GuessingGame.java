public class GuessingGame {
  public static void main(String[] args) {
    if (args.length == 0 || args[0] == "help") {
      System.out.println("Enter argument n where 1 <= n <= 5");
      return;
    }

    int guess = Integer.parseInt(args[0]);
    if (guess < 1 || guess > 5) {
      System.out.println("Argument n must be 1 <= n <= 5");
      return;
    }

    int randomNum = (int)(Math.random() * 5 + 1);
    if (guess == randomNum) {
      System.out.println("You are right!");
    } else {
      System.out.println("Hidden number was " + randomNum + ". Try again");
    }
  }
};
