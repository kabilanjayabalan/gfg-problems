class Solution:
	def pushZerosToEnd(self, arr):
    	# code here
    	k=0;
    	for i in range(0,len(arr)):
    	    if arr[i]!=0:
    	        arr[k]=arr[i];
    	        k+=1
        while k<len(arr):
            arr[k]=0
            k+=1
        return arr
