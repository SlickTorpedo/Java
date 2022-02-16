import java.util.*;
import java.lang.*;

class PrimeDirective {
  
  // Add your methods here:
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    val = 0;
    System.out.println("Hi!");
    while (val < numbers.size()) {
      System.out.println(isPrime(numbers.get(val)));
      val++;
    }

  }  

  public static int isPrime() {

    if (int <= 1) {
      return false;
    } else if (int == 2) {
      return true;
    } else if (int % 2 == 0) {
      return false;
    } else {
      for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
  }

}
