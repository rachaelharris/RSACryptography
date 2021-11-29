import java.lang.Math;
import java.util.ArrayList;

public class Encryption {
  // The information that the encryption algorithm uses
  private ArrayList<Character> array;
  private int[] multipliers;
  private int number;

  // The Strings of the different versions of the password
  private String password;
  private String encrypted;
  private String decrypted;

  /**
   * Initialize a password in the PasswordChecker class.
   *
   * @author Michael Ceccarelli
   */
  public Encryption(String password) {
    this.password = password;
    this.array = new ArrayList<Character>();
    this.multipliers = new int[password.length()];
    this.number = (int)(Math.random() * 4 + 2);

    for (int i = 0; i < password.length(); i += 1) {
      multipliers[i] = (int)(Math.random() * 980 + 1);
    }

    this.encrypted = this.encrypt();
    this.decrypted = this.decrypt();
  }

  /**
   * Encrypt the String.
   *
   * @author Michael Ceccarelli
   */
  public String encrypt() {
    for (int i = 0; i < password.length() * number; i += 1) {
      if (i % number == 0) {
        array.add((Character)((char)((int)(password.charAt(i / number))
            + multipliers[i / number])));
      } else {
        array.add((Character)((char)((int)(Math.random() * 1023))));
      }
    }

    String str = "";

    for (int i = 0; i < array.size(); i += 1) {
      str += (char)(array.get(i));
    }

    return str;
  }

  /**
   * Decrypt the String.
   *
   * @author Michael Ceccarelli
   */
  public String decrypt() {
    String str = "";

    for (int i = 0; i < array.size(); i += 1) {
      if (i % number == 0) {
        str += (char)((int)(array.get(i)) - multipliers[i / number]);
      }
    }

    return str;
  }

  /**
  * Return the encrypted version of the String.
  *
  * @author Michael Ceccarelli
  */
  public String getEncrypted() {
    return encrypted;
  }

  /**
  * Return the decrypted version of the String.
  *
  * @author Michael Ceccarelli
  */
  public String getDecrypted() {
    return decrypted;
  }
}
