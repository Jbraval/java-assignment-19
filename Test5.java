import java.util.*;
import java.util.Scanner;
public class Test5{
        static int level = -1;
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the binary number n: ");
                int n = scn.nextInt();
                System.out.println(binary_to_gray(n, 0));
        }
        public static int binary_to_gray(int n, int i) {
                int a, b;
                int result = 0;
                if (n != 0) {
                        
                        a = n % 10;
                        n = n / 10;
                        
                        b = n % 10;
                        if ((a & ~b) == 1 || (~a & b) == 1) {
                                result = (int)(result + Math.pow(10, i));
                        }
                        return binary_to_gray(n, ++i) + result;
                }
                return 0;
        }
}
