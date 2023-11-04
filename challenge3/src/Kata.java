/*Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
 */


public class Kata {
  public static int[] digitize(long n) {
    
    String x = String.valueOf(n);
    int[] array = new int[x.length()];
    
    
    for(int i=0; i < x.length();i++){
      array[i] = Character.getNumericValue(x.charAt(x.length() - 1 - i)); //The method Character.getNumericValue() converts a numeric character into its equivalent numerical value.
      }
    return array;
    }
    
  }
 



