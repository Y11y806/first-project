class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int num = 0;
        int min = 0;
        int len = blocks.size();
        for(int i = 0;i<k;i++){
            if(blocks[i] == 'W'){
                num++;
            }
        } 
        min = num;
        for(int i=k;i<len;i++){
            if(blocks[i-k] == 'W'){
                num--;
            }
            if(blocks[i] == 'W'){
                num++;
            }
            if(min>num){
               min = num;
            }
        }
        return min;
    }
};