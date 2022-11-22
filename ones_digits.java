// get seperate digits 
// 123 -> 12, 3
// 12 -> 1, 2
// 1 -> 1

System.out.println(123 % 10); // 3 
System.out.println(123 / 10); // 12 

int n = 123;
int ones = n % 10;
int rest = n / 10;
System.out.println(n + " -> " + rest + ", " + ones); // 123 -> 12, 3


// 2022-11-22
public class Main {
  public static void main(String[] args) {
      int n = 12345;
      // n = 121 // Palindrome

      int r = 0;
      int result = 0;

      while(n > 0) {
          r = n % 10;
          result = result * 10 + r;
          n = n / 10;
      }

      System.out.println(result); // 54321
  }
}
