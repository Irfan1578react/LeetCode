/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(1==n){
            return 1;
        }
        int start=1;
        int end=n;
        int mid;
        while(start<=end){
             mid=start+(end-start)/2;
             if(isBadVersion(mid)==false &&isBadVersion(mid+1)==true ){
                return mid+1;
             }
             else if(isBadVersion(mid)==false){
                start=mid+1;

             }
             else{
                end=mid-1;
             }

        }
        return 1;
        
    }
}