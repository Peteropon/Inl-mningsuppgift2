import java.util.Scanner;
public class GuessingGame {

  public static void main(String[] args) {
    int z = Integer.parseInt(args[0]);
    int o = Integer.parseInt(args[1]);
    Guesser guesser = new Guesser(z, o);
    guesser.start();
  }

}
