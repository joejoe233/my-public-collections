import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // 1.brute-force，Time complexity: O(n^2), space complexityO(1)
        // int len = nums.length;
        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;

        //we may trade space for time by hashTable or balanced binary search tree.In this case, use former 
        int len = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>(len-1); //Record the looped data，`key` is the value of array, `value`is the index of array
        hashMap.put(nums[0],0);
        for (int i=1;i<len;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{i,hashMap.get(target-nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return null;

    }

}
