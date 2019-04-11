class Solution {
    public boolean isNumber(String s) {

        int start = 0;
        int end = s.length();
        for(; start < end; start++){
            char cur = s.charAt(start);
            if(cur != ' '){
                break;
            }
        }

        for(;start < end; end--){
            char cur = s.charAt(end-1);
            if(cur != ' '){
                break;
            }
        }
        
        if(start == end){
            return false;
        }
        
        if(s.charAt(start) == '-' || s.charAt(start) == '+'){
            start ++;
        }
        

        boolean hasDot = false;
        boolean hasE = false;
        int preEIndex = -100000;
        int epreNum = 0;
        int ebackNum = 0;
        int numCount = 0;
        for(int i = start;i < end; i++){
            char cur = s.charAt(i);
            if(cur == '.'){
                if(hasDot || hasE){
                    return false;
                }else {
                    hasDot = true;
                    continue;
                }
            }

            if(cur == 'e'){
                if(hasE){
                    return false;
                }else {

                    preEIndex = i;
                    hasE = true;

                    continue;

                }

            }
            
            if(preEIndex + 1 == i &&(s.charAt(i) == '-' || s.charAt(i) == '+')){
                continue;
            }
            

            if((cur <= '9' && cur >= '0') ){

                if(hasE){

                    ebackNum ++;

                }else {

                    epreNum ++;

                }

                numCount++;

                continue;

            }else{

                return false;

            }

        }



        if(numCount == 0){

            return false;

        }


        if(hasE){

            if(ebackNum > 0 && epreNum > 0){

                return true;

            }else {

                return false;

            }
        }

        return true;

    }

}
