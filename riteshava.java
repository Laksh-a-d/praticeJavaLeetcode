public class riteshava {
    public static void main (String[] args)
    {

    
        //System.out.println("ritesh ");
        int [] arr = {1,2,3,4,5,6,7,8};
        int ans = maxinum(arr);
        System.out.println(ans);
    }
    static public  int  maxinum(int [] arr )
    {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max) {
                max = arr[i];
                
            }
            
        }
        return max;
    }
    
    


    
}
