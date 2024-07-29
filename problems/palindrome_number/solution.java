class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int start=0;
        int last=y.length()-1;
        while(start <= last)
        {
            if(y.charAt(start) == y.charAt(last))
            {
                start++;
                last--;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
}