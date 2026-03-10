import java.util.Arrays;

public class twosumwithbinaray {
    

            public static  int[] twoSum(int[] nums, int target) 
            {
               int start = 0 ;
               int end = nums.length-1 ;
               while (start <end) {

                  int sum  = nums[start]+nums[end];
                  if (sum > target) {
                    end -- ;

                    
                  }
                  else if (sum <target) {
                    start ++;
                    
                  }
                  else 
                  {
                    return new int [] {nums[start] , nums[end]};
                  }
        


                
               }
               return new int[] {} ;
            }

            public static void main(String[] args)
            {
                 int[] arr = {1,2,3,4,5,6,7};
                 int target = 5 ;
                 int[] result = twoSum(arr, target);
                 System.out.println(Arrays.toString(result));

            }


    
}
