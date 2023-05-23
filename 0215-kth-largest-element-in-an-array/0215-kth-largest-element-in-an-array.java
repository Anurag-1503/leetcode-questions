class Solution {
	public int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<k;i++)
		{
			pq.add(nums[i]);
		}

		ans=pq.peek();
		for(int i=k;i<nums.length;i++)
		{
			if(nums[i]>pq.peek()){
				pq.poll();
				pq.add(nums[i]);
			}
		}

		return pq.peek();
	}


}