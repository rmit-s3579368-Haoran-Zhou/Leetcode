class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        ArrayList<Integer> as = new ArrayList();
        for(int i=0;i<l1;i++)
            for(int j=0;j<l2;j++)
                if(nums1[i]==nums2[j]){
                    as.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
        int[] result=ListToArray(as);
        return result;
    }
    
    public int[] ListToArray(ArrayList<Integer> a){
        int[] res = new int[a.size()];
        for(int i=0;i<a.size();i++)
            res[i]=a.get(i);
        return res;
    }
    
}