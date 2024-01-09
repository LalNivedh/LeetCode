class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i < n)
        {
            int element = arr[i];
            if(arr[i] < n && element != i)
            {
                int temp = arr[i];
                arr[i] = arr[element];
                arr[element] = temp; 
            }
            else
            {
                i++;
            }
        }
        for(int j=0; j<n; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }return n;
    }
}