import java.util.*;

public class factorial {
    public static int factorialCalculate(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = factorialCalculate(a);
    }
    
}
