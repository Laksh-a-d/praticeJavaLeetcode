import java.util.Arrays;
import java.util.HashMap;

public class twosumhashmap {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int  target = 7 ;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        
         
    }
    public static  int[] twoSum(int[] nums, int target) 
        {
            HashMap<Integer ,Integer> map  = new HashMap<>();
            for(int i  = 0  ; i<= nums.length -1 ; i++)
            {
                int compiment = target - nums[i];
                if (map.containsKey(compiment)) {
                    return new int[] {map.get(compiment) , i};
                     
                }
                map.put(nums[i], i);
                
            }
            return  new int[] {} ;

        }
    
}
