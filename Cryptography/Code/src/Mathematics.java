import java.util.Random;

public class Mathematics {

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

}
