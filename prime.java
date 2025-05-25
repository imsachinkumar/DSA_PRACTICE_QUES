// import java.util.Scanner;

// public class prime {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int count=0;

//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//         if(count==0) {
//             System.out.println("Prime3");
//         }else{
//             System.out.println("Not prime");
//         }
    
//     }
    
// }

import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int cnt=0;

        for(int i=2;i<n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt>0){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
