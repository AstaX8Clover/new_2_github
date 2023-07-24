import java.util.*;
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        //2D ARRAY
        int[][] numbers = new int[row][cols];
        for(int i = 0;i<=row-1;i++){
            for(int j = 0;j<=cols-1;j++){
                numbers[i][j] = sc.nextInt();

            }
        }
        //output in form of matrix
        for(int i = 0 ;i<row;i++){
            for (int j =0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }        
        System.out.println();
    }
}