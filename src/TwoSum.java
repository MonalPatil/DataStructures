import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the 
two numbers such that they add up to a specific target.*/


public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(target-nums[i])){
                return new int[] { map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
    throw new IllegalArgumentException("No two elements with given sum");
    }

}
