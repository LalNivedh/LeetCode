class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int high = arr.length-1;
        int mid =0;
        if(arr.length == 1)
        {
            return;
        }
        while(mid <= high)
        {
            switch(arr[mid])
            {
                case 0:
                {
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    int temp = arr[high];
                    arr[high] =arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
                default:
                {
                    return ;
                }

            }
        }
            
    }
}