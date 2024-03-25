class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        int i=0;
		while(i < arr.length)
		{
			int correct = arr[i] - 1;
			if(arr[correct] != arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}
			else
			{
				i++;
			}
		}
        for(int j=0; j<arr.length;j++)
        {
            if(j+1 != arr[j])
            {
                list.add(arr[j]);
            }
        }
        return list;
    }
}