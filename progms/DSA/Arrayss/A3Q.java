import java.util.*;
public class A3Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc. nextInt();
        int c = sc. nextInt();
        //input array
        int [][] array = new int [r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        //finding x and printing i ,j corresponding to it
        int x =sc.nextInt();
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
            
            if(array[i][j]==x){
                System.out.println(i+" "+j);
            }else{
                System.out.println("Number not found");
            }
            }
        }
    }
}
