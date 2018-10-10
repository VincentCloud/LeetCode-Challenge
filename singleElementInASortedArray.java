public class singleElementInASortedArray {
    public int singleNonDuplicate(int[] nums){
        int index=indexOfsingle(nums,0,nums.length-1);
        return nums[index];
    }

    public int indexOfsingle(int[] nums,int begin,int end){
        int mid = (nums.length-1)/2;
        if(nums.length==3){
            if(nums[mid]==nums[mid-1]){
                return nums[2];
            }else{
                return nums[0];
            }
        }else if(nums[mid+1]!=nums[mid]&&nums[mid-1]!=nums[mid]){
            return nums[mid];
        }else{
            if(nums[mid-1]==nums[mid]&&(mid-1)%2!=0){
                return indexOfsingle(nums ,0,mid-2);
            }else if(nums[mid-1]==nums[mid]&&(mid-1)%2==0){
                return indexOfsingle(nums,mid+1,nums.length-1);
            }else if(nums[mid-1]!=nums[mid]){
                if(mid%2==0){
                    return indexOfsingle(nums, mid+2,nums.length-1);
                }else{
                    return indexOfsingle(nums,0,mid-1);
                }
            }
        }
        return mid;
    }

}
