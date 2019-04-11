class Solution {
    public String predictPartyVictory(String s) {
        int nr=0;
        int nd=0;
        int br=0;
        int bd=0;
        boolean[] ban = new boolean[s.length()];
        
     
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                nr++;
                          
            else
                nd++;                               
        
    }
        
        while(nd>0&&nd>0){
            for(int i=0;i<s.length();i++){   
                
                if(s.charAt(i)=='R'&&!ban[i]){
                if(br>0){
                    ban[i]=true;
                    nr--;
                    br--;
                }else{
                    bd++;
                }                          
                }
              else if(s.charAt(i)=='D'&&!ban[i])  {
                   if(bd>0){
                    ban[i]=true;
                    nd--;
                    bd--;
                }else{
                    br++;
                }     
                  
              }
                

                
                
                
            }
         
            
        }
        
                return nr>0? "Radiant":"Dire";
        
        
    }
  
}