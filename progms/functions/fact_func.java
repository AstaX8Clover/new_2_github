import java.util.*;

public class fact_func {
    public static int factorial(int a){
        int fac= a;
        for(int i=a;i>=2;i--){
        fac=fac*(i-1);
        }
        return fac;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("factorial is : "+factorial(a));
    }
}
