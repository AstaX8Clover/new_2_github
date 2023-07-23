import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int song = sc.nextInt();
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;
        int s6 = 0;
        int s7 = 0;
        int s8 = 0;
        int s9 = 0;
        for(int i =1;i<=song;i++){
         int name = sc.nextInt();
         if(name == 1){
            s1=s1+1;
         }else if(name == 2){
            s2=s2+1 ;
         }else if(name == 3){
            s3=s3+1 ;
         }else if(name == 4){
            s4=s4+1 ;
         }else if(name == 5){
            s5=s5+1 ;
         }else if(name == 6){
            s6=s6+1 ;
         }else if(name == 7){
            s7=s7+1 ;
         }else if(name == 8){
            s8=s8+1 ;
         }else if(name == 9){
            s9=s9+1 ;
         }
        

        }
        for(int j = 1;j<=1;j++){
            System.out.println(s1+""+s2+""+s3+""+s4+""+s5+""+s6+""+s7+""+s8+""+s9);
        }


    }
    
}
