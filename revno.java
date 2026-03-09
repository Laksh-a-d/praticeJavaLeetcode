public class revno { 
    public static void main(String[] args) {
        System.out.println(planidrom(121));
        
    }
    static int sum = 0 ;
    static void rev (int n)
    {
        if (n ==0) {
            return;
            
        }
        int rem = n%10 ;
         sum = sum*10+rem;
        System.out.println(sum);
        rev(n/10);
    }
    public static int rev2 (int n )
    {
        int  digit = (int) (Math.log10(n))+1;
        return helper(n, digit);

        
    }
    public static int helper(int n , int digit)
    {
        if (n%10==n) {
            return  n ;
        }
        int rem = n%10 ;
        return rem* (int )(Math.pow(10, digit-1)) +helper(n/ 10, digit-1);
    }
    public static boolean planidrom(int n )
    {
        return n == rev2(n);
    }
    
    
}
