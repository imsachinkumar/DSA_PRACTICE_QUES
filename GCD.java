public class GCD {
    public static void main(String[] args) {
        int dividend=60;
        int divisor=25;

        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;

        }
        System.out.println(divisor);
    }
}
