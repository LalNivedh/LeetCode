class Solution {
    public int countSubstrings(String s) {
        int count =s.length();
        for(int start =0; start<s.length()-1;start++)
        {
            for(int end =start+1; end<s.length();end++)
            {
             boolean ans = ispalendrome(s,start,end);
              if(ans)
              {
                  count++;
              }

            }
            
        }
        return count;
        
    }
     public boolean ispalendrome(String s,int start,int end)
     {
         boolean ans =true;
         while(start <= end)
         {
             if(s.charAt(start) == s.charAt(end))
             {
                 start++;
                 end--;
             }
             else
             {
                 ans =false;
                 break;
             }
         }
         if(ans)
         {
             return true;
         }
         return false;
     }
}