public class printing_multipleof3 {

    public static void main(String[] args) {
        int n=100;
        int i=1;
        while (i<=n) {
            int store=i;
            i++;
            if(store%3!=0){
                System.out.println(store);
            }
            
        }
        
    }
}