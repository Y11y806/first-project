class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int len = blocks.size();
        int num = 0;
        int mincount = 0;
        int n = k-1;
        for(int i=0;i<len;i++){
            if(blocks[i] == 'W'){
                num++;
            }
            if(i == n){
                mincount = num;
            }
            if(i>=k && blocks[i-k] == 'W'){
                num--;
                if(mincount>num)
                    mincount = num;
                
            }
        }
        return mincount;
    }
};