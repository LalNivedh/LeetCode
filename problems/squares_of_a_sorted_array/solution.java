class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

            for(int i=0; i<nums.length; i++)
            {
                ans[i] = nums[i] * nums[i];
            }

        for(int j=0; j<ans.length-1; j++)
        {
            for(int k =j+1; k>0; k--)
            {
                if(ans[k] <= ans[k-1])
                {
                    int temp = ans[k-1];
                    ans[k-1] = ans[k];
                    ans[k] = temp;
                }
            }
        }
        return ans;
    }
}