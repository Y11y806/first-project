//半径为k的子数组平均值
class Solution {
	public:
		vector<int> getAverages(vector<int>& nums, int k) {

			int len = nums.size();
			long long sum = 0 ;
			vector<int> avgs(len, -1);
			for (int i = 0; i < len; i++) {
				sum += nums[i];
                		if(i<2*k){
                    			continue;
               			 }
                		avgs[i-k] = sum/(2*k+1);
                		sum = sum - nums[i-2*k];

			}
			return avgs;
		}
};