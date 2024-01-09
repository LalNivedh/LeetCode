class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int element = nums[i] - 1;
            if (nums[i] != nums[element]) {
                int temp = nums[i];
                nums[i] = nums[element];
                nums[element] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                arr1.add(j+1);
            }
        }
        return arr1;
    }
}