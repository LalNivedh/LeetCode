class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<=nums.length-2; i++)
       {
           for(int k=i+1; k>0; k--)
           {
               if(nums[k] < nums[k-1])
               {
                    int temp = nums[k-1];
					nums[k-1] = nums[k];
					nums[k] = temp;
               }
           }
       } 
       for(int j=0; j<nums.length; j++)
       {
           int element = nums[j];
           int count =0;
           if(j==0)
           {
               for(int l=0; l<nums.length; l++)
                   {
                       if(nums[l] == element)
                       {
                           count++;
                       }
                   }
               if(count > nums.length/3)
               {
                   list.add(element);
                   count=0;
               }
           }
           else
           {
               //boolean ans = true;
               if(element == nums[j-1])
               {
                  continue;
               }
               
               else
               {
                   
                   for(int b=0; b<nums.length; b++)
                   {
                       if(nums[b] == element)
                       {
                           count++;
                       }
                   }
               if(count > nums.length/3)
               {
                   list.add(element);
                   count=0;
               }

               }
           }
       }
       return list;
    }
}