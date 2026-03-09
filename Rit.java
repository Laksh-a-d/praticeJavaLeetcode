public class Rit{
    public static void main(String[] args)
    {
        System.out.println("ritesh");
        int [] nums =  {1,2,3};
        System.out.println(combine(nums));


    }
     public void nextPermutation(int[] nums) {
       

    



        
    }
    public static int combine (int[] nums)
    {
        int result = 0 ;
        for (int i = 0; i < nums.length; i++) {
            result = result*10+nums[i];
            
        }
        return result ;

    }
    public static void swap(int [] nums, int i)
    {
        int temp  = nums[i];
        nums[i]= nums[i+1];
        nums[i+1] = temp;

    }
}
