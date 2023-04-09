import java.util.*;
import java.util.Scanner;
public class Test2{
        static int level = -1;
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the numbers: ");
                int x = scn.nextInt();
                int y = scn.nextInt();
                System.out.println(product(x,y));
        }
        public static int product(int x, int y) {
                
                if (x < y)
                        return product(y, x);
                      
                else if (y != 0)
                        return (x + product(x, y - 1));
                       
                else
                        return 0;
        }
}
