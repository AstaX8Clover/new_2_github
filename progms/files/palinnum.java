import java.util.*;
public class palinnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int n = t;
        if(n<25){
            for (int i = 1; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
               System.out.print(" "); 
            }
            for(int j = i;j>0;j--){
                System.out.print(j);
            }
            for(int j =1;j<=n;j++){
                if(j>1 && j<=i){
                    System.out.print(j);
                }
            }
           
            System.out.println();
            
        }
    }else{
        System.out.println("Type a number less than 25");
    }

    }
}
//
//
//
//
//
//
///
///
//
//
//
//
//
//
//
//
