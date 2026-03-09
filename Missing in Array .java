import java.util.*;
class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int n=arr[arr.length-1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;
        
    }
}
