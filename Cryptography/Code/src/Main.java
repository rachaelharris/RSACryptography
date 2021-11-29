import java.util.*;
import java.lang.*;

public class Main {
  public static char[] library = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
  'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
  'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
  ',', '.', '!', '?', ' '};

  public static int successiveSquaring(int a, int k, int n) {
    int highestPower = 0;
    for (int i = 0; i < 20; i += 1) {
      if (powerOf(2, i) > k) {
        highestPower = i;
      }
    }

    int[] array = new int[highestPower];
    boolean[] decide = new boolean[highestPower];

    for (int i = highestPower - 1; i >= 0; i -= 1) {
      if (powerOf(2, i) <= k) {
        k -= powerOf(2, i);
        decide[i] = true;
      } else {
        decide[i] = false;
      }
    }

    array[0] = a;
    for (int i = 1; i < array.length; i += 1) {
      array[i] = powerOf(array[i - 1], 2) % n;
    }

    int total = 1;
    for (int i = 0; i < decide.length; i += 1) {
      if (decide[i]) {
        total *= array[i];
        total %= n;
      }
    }

    return total;
  }

  public static int powerOf(int base, int power) {
    int total = 1;

    for (int i = 0; i < power; i += 1) {
      total *= base;
    }

    return total;
  }

  public static int gcd(int a, int b) throws Exception {
    if (a == 0 || b == 0) {
      System.out.println("GCD 0 Error! A: " + a + " B: " + b);
      return 37707;
    }

    int r = a;
    int x = 0;

    while (r != 0) {
      try {
        x = a / b;
        r = a % b;
      } catch (Exception e) {
        if (b > 0) {
          return b;
        } else {
          return -b;
        }
      }

      if (r == 0) {
        if (b > 0) {
          return b;
        } else {
          return -b;
        }
      } else {
        a = b;
        b = r;
      }
    }

    if (b > 0) {
      return b;
    } else {
      return -b;
    }
  }

  public static int euclideanAlgorithm(int a, int b) throws Exception {
    int r = a;
    int x = 0;

    while (r != 0) {
      try {
        x = a / b;
        r = a % b;
      } catch (Exception e) {
        return b;
      }

      System.out.println(a + " = " + b + " * " + x + " + " + r);

      if (r == 0) {
        return b;
      } else {
        a = b;
        b = r;
      }

    }

    return b;
  }

  public static int extEuclideanAlgorithm(int a, int b, int m) {
    int x = 0;
    int y = 0;

    for (int i = -1000; i < 1000; i += 1) {
      for (int j = -1000; j < 1000; j += 1) {
        if (i * a + j * b == 1) {
          x = i;
          y = j;
          break;
        }
      }
    }

    return x;
  }

  public static int primeNumberGenerator() {
    int[] array = {11, 13, 17, 19, 23, 29};

    Random generator = new Random();

    return array[generator.nextInt(array.length)];
  }

  public static void main(String[] args) throws Exception {
    ArrayList<Character> input  = new ArrayList<Character>();
    ArrayList<Character> output = new ArrayList<Character>();

    Scanner scan = new Scanner(System.in);

    String message = new String("Initial");

    Random rand = new Random();

    int count = 0;

    int p = 0;
    int q = 0;
    int e = 0;
    int m = 0;
    int d = 0;
    int N = 0;
    int M = 0;
    int T = 0;
    int F = 0;

    while (!message.isEmpty()) {
      System.out.println("\n\n");

      if (count % 2 == 0) {
        System.out.println("Alice is sending a message to Bob.");
      } else {
        System.out.println("Bob is sending a message to Alice.");
      }

      // Getting our prime numbers and products.
//      p = Mathematics.primeNumberGenerator();
      p = primeNumberGenerator();
//      q = Mathematics.primeNumberGenerator();

      do {
        q = primeNumberGenerator();
      } while (p == q);

      N = p * q;
      //N = 289;
      M = (p - 1) * (q - 1);

      // Setting our exponent appropriately.
      e = rand.nextInt(10) + 2;
//      while (Mathematics.gcd(e, M) != 1) {
      while (gcd(e, M) != 1) {
        e += 1;
      }

      // The product and exponent are published.
      if (count % 2 == 0) {
        System.out.println("Bob: N = " + N + " e = " + e);
      } else {
        System.out.println("Alice: N = " + N + " e = " + e);
      }

      System.out.println();

      // Getting the message from either individual.
      if (count % 2 == 0) {
        System.out.print("Alice: ");
      } else {
        System.out.print("Bob: ");
      }
      message = scan.nextLine();

      if (message.isEmpty()) {
        break;
      }

      System.out.println();

      // Building our input array from the message.
      for (int i = 0; i < message.length(); i += 1) {
        input.add(message.charAt(i));
      }

      // Encrypting each character from the input array.
      for (int i = 0; i < input.size(); i += 1) {

        for (int j = 0; j < library.length; j += 1) {
          if (input.get(i).equals(library[j])) {
            m = j + 10;
          }
        }

        // Encrypting the message.
//        T = Mathematics.successiveSquaring(m, e, N);
        T = successiveSquaring(m, e, N);

        // Transmitting the message.
        if (count % 2 == 0) {
          System.out.println("Alice: T = " + T);
        } else {
          System.out.println("Bob: T = " + T);
        }

        // Decrypting the message.
//        d = Mathematics.extEuclideanAlgorithm(e, M, 1);
        d = extEuclideanAlgorithm(e, M, 1);
//        F = Mathematics.successiveSquaring(T, d, N);
        F = successiveSquaring(T, d, N);

        // Add the appropriate character from the library.
        output.add(library[F - 10]);
      }

      System.out.println();

      // Giving the name of the recipient.
      if (count % 2 != 0) {
        System.out.print("Alice: ");
      } else {
        System.out.print("Bob: ");
      }

      // Printing out the decrypted message.
      for (int j = 0; j < output.size(); j += 1) {
        System.out.print(output.get(j));
      }
      System.out.println();

      // Clear arrays for next message.
      input.clear();
      output.clear();

      // Incrementing count for next person.
      count += 1;
    }

  }

}
