import java.util.Scanner;

public class sum_of_digits_ofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;

        }
        System.out.println(sum);
    }
}
