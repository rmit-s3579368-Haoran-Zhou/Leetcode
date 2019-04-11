class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        float ans=0;
        int[] nums=combine(nums1,nums2);

        ans=findmid(nums);
        
        return ans;
    }
    
    public int[] combine(int[] a,int[] b){
        int m = a.length;
        int n = b.length;
        int[] all = new int[m+n];
        for(int i=0;i<m;i++)
          all[i]=a[i];
        for(int j=m;j<m+n;j++)
            all[j]=b[j-m];
        Arrays.sort(all);
        return all;
    }
    
    public float findmid(int[] nums){
        for(int i=0;i<nums.length;i++){
            int mid=nums.length/2;
            if(mid==0){
                float fff=nums[0];
                return fff;
            }
            else if(mid==(float)nums.length/2){
                float f=(float)(nums[mid-1]+nums[mid])/2;
                return f;
            }
            else{
                float ff=nums[mid];
                return ff;
            }
                
        }  
           return 0; 
        }
        
    }
    
    
