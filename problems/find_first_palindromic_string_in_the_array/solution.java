class Solution {
    public String firstPalindrome(String[] arr) {
        String ans ="";
        //String str="";
        for(int i=0; i< arr.length;i++)
        {
            String str = arr[i];
            int start =0;
            int end =str.length()-1;
            boolean lal = true;
            while(start <= end)
            {
                if(str.charAt(start) == str.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                {
                    lal = false;
                    break;
                }
            }
            if(lal)
            {
                ans = str;
                break;
            }
            
        }
        return ans;
    }
}