public class TestGuesser {

public static void main(String[] args) {

  Guesser g1 = new Guesser(0, 199);
  System.out.println(g1.toString());


  try {
    Guesser g2 = new Guesser(400, 30);
    System.err.println("Test failed, no exception thrown");
  } catch (IllegalArgumentException i){
  System.out.println("Test successful");
}

  try {
  Guesser g2 = new Guesser(0, 0);
  System.err.println("Test failed, no exception thrown");
  } catch (IllegalArgumentException i){
    System.out.println("Test successful");
}

}

}
