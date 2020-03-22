import java.util.Arrays;

/**
 * 
 * @author mpatil
 * Given an unsorted array nums, 
 * reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * 
 * Input: nums = [3,5,2,1,6,4]
 * Output: One possible answer is [3,5,1,6,2,4]
 *
 */
public class WiggleSort_I {
	 public void swap(int[] arr,int i, int j){
	        int temp = arr[i];
	        arr[i]= arr[j];
	        arr[j]= temp;
	    }
	    
	    public void wiggleSort(int[] nums) {
	        Arrays.sort(nums);
	        
	        for(int i=1;i<nums.length-1;i=i+2){
	            swap(nums,i,i+1);
	        }
	        
	        //return nums;
	    }

}
