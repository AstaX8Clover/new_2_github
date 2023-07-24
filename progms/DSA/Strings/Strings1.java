import java.util.*;
public class Strings1 {
    public static void main(String[] args) {
        // String name ="Tony";
    String fname = "Tony stark";
        //even sentence and para can be inserted
        //Taking string input
    //     Scanner sc= new  Scanner(System.in);
    //     String name = sc.nextLine();
    // System.out.print(name);
/// Concatenation str3=str1+str2 ; # basically do string ko jodna!
        //charAt
        for(int i  =0;i<fname.length();i++){
            System.out.println(fname.charAt(i));
        }
    }
}
//compare two string if they are equal
//if(str1.compareTo(str2))
//str 1 > str 2 : +ve value
//str 1 == str 2 : 0
//str 1 < str 2 : -ve value
//hello and wello me w bada to str2>str1 **
//hello cello me hello badi string h :)
// str1 == str2 isliye use nhi krte kyuki 
//kabhi kabhi fail hojata h in contest ..
//eg. if(new String("Tony")==new String("Tony"))
//java ke andar string object hoti h normal 
//primitive type memory me alag trha se store honge
//more info  in string builder**
//substring func ek beginning index lega 
//and ek ending index lega and beech ka part return krdega
//int to str and str to int i e parsing
//string are immutable
