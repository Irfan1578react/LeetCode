class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int arr[]=new int[nums1.length+nums2.length];
        int var=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[var++]=nums1[i];
                i++;
            }
            else{
                arr[var++]=nums2[j];
                j++;
            }
        }
        while(i<nums1.length){
            arr[var++]=nums1[i];
            i++;
        }
        
        while(j<nums2.length){
            arr[var++]=nums2[j];
            j++;
        }
        int f=0;
        int e=arr.length-1;
        int mid=(f+e)/2;
        if(arr.length%2!=0){
            return (double)arr[mid];

        }
        else{
            return (double)(arr[mid]+arr[mid+1])/2;
        }
               }
    }
