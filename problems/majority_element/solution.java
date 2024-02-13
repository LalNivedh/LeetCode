class Solution {
    public int majorityElement(int[] arr) {
        int count=0;
        int a=0;
        int element =0;
        int ans=0;
        for(int i=0; i< arr.length; i++)
        {
            element =arr[i];
            for(int j=0; j< arr.length; j++)
            {
                if(element == arr[j])
                {
                    count++;
                }
            }
            if(count > a)
            {
                a=count;
                ans = element;
            }
            count=0;
        }
        return ans;

    }
}