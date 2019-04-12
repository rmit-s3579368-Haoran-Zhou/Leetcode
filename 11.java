class Solution {
    public int maxArea(int[] height) {
     int i=0,j=height.length-1;
        int ans=0;
        while(i<j){
        int h=min(height[i],height[j]);
         ans=getMax(ans,h*(j-i));   
        if( height[i]>height[j]) 
             j--;
         else
            i++;
                       
        }
        
        return ans;
        
    }
    
    
    
    public int getMax(int a,int b){        
     return a>b? a:b;
    }
    
    
    public int min(int a,int b){
        int min=0;
        if(a>b)
            min=b;
        else
            min=a;
        return min;
    }
}