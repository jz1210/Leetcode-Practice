/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/ 
//We can use sort method first to sort array from small number to big number and compare them with loop to find if their is duplicate or not.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length-1; i++){
            if(nums[i] == ums[i+1]) 
                return true;
        }
        return false;
    }
}

//Brute force: just compare everything with two loop
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}

//Other solution: Hash Set and Hash Map
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for (int num : nums) {
            if (check.contains(num))
                return true;
            check.add(num);
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] check) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for (int num : nums) {
            if (check.containsKey(num) && check.get(num) >= 1)
                return true;
            check.put(num, check.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}