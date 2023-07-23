import java.util.*;

    public static void main(String[] args) {
        //array
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();//number of songs
        int Playlist[]= new int[nums];
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;
        int s6 = 0;
        int s7 = 0;
        int s8 = 0;
        int s9 = 0;
        
        for (int i=0;i<nums;i++){
            Playlist[i]=sc.nextInt();
            if(Playlist[i] == 1){
            s1=s1+1;
        }else if(Playlist[i] == 2){
            s2=s2+1 ;
        }else if(Playlist[i] == 3){
            s3=s3+1 ;
        }else if(Playlist[i] == 4){
            s4=s4+1 ;
        }else if(Playlist[i] == 5){
            s5=s5+1 ;
        }else if(Playlist[i] == 6){
            s6=s6+1 ;
        }else if(Playlist[i] == 7){
            s7=s7+1 ;
        }else if(Playlist[i] == 8){
            s8=s8+1 ;
        }else if(Playlist[i] == 9){
            s9=s9+1 ;
        }     
        }
        System.out.println("playlist songs ");
        for (int i =0;i<nums;i++){
            
            System.out.print(Playlist[i]+" ");
            System.out.println();
            
        }
        for(int i =1;i<=9;i++){
        
            
        }
        
        
    
    }
    
}
