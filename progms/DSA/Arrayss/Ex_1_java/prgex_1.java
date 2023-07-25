// Write a function to print 
//the sum of all odd numbers from 1 to n.
// import java.util.*;
// public class prgex_1{
//     public static int odsum(int n){
//         int sum=0;
//         for(int i =1;i<=n;i++){
//             if(i%2==1){
//                 sum=sum+i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         int n= s.nextInt();
//         System.out.println(odsum(n));
//     }
// }
//
//
//
//
//Write an infinite loop using do while condition
// public class prgex_1{
//     public static void main(String[] args) {
//         do{
//             System.out.println("a");
//         }while(1>0);
//     }
// }
//
//
//
//
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
// import java.util.*;
// public class prgex_1{
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         int n = s.nextInt();
//         int p =0;
//         int ne =0;
//         int z =0;
        
//         for(int i =1;i<=n;i++){
//             int k = s.nextInt();
//         if(k>0){
//             p=p+1;
//         }else if(k<0){
//             ne=ne+1;
//         }else{
//             z=z+1;
//         }
        
        
//         }
//         System.out.println("negative"+ne+" "+"positive"+p+" "+"zeros"+z);

//     }
// }
//
//
//
//
//
//
//Write a function that calculates the Greatest Common Divisor of 2 numbers
//
//
///
//
// import java.util.*;
// public class prgex_1{
//     public static int power(int a , int b){
//         int answer=a;
//         for(int i =b;i>0;i--){
//             answer=a*a;
//         }
//         return answer;
//     }
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int a =s.nextInt();
//         int b=s.nextInt();
//         System.out.println(power(a, b));
//     }
// }
//fibonacci series
import java.util.*;
public class prgex_1 {
    public static int fibonacci(int n){
        int a =0;
        int b=1;
        int s =0;
        for(int i =1;i<=n;i++){
            
            int k =a+b;
            int v =s+k;
            

            
            
        }
        return s;
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    System.out.println(fibonacci(n));
    
}
    
}