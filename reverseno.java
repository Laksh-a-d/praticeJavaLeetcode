public class reverseno {

    public static void main(String[] args)
    {
        int n = 456789 ;
        System.out.println(rev(n));

    }
    public static int rev(int n )
    {
        int sum = 0;
        if (n==0) {
            return -1;
            
        }
        while (n!= 0) {
        int reverse = n%10;
        sum = sum*10 +reverse ;
        n= n/10;
      
            
        }
        return sum ;
        
    }
    
}
