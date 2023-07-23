public class rhmbus {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 4;
        int m =7;
        for (int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                int sum =i+j;
                if(sum>=5 && sum<=8 ){
                    System.out.print("* ");
            
                    
                }   
                else{
                        System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}
    

