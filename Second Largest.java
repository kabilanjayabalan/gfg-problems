class Solution {
    public int getSecondLargest(int[] arr) {
        int first=-1,second=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(second<arr[i]&&arr[i]!=first)
            {
                second=arr[i];
            }
        }
        return second;
    }
}
