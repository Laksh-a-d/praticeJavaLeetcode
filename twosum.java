import java.util.Arrays;

public class twosum
{
    public static void main (String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5 ;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));

    }


        public static  int[] twoSum(int[] nums, int target) 
        {


            //int [] arr ;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    int sum = nums[i] +nums[j];
                    
                        if (sum == target) {
                            return new int[]{nums[i] , nums[j]};
                            
                        }
                        
                    }
                    
                }
                
            

            return new int[] {} ;
        }

}
