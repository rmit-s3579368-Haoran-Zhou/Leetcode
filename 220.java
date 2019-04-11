class Solution {
public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{
		if (nums.length == 0 || k < 1) {
			return false;
		}

		TreeMap<Long, Long> map = new TreeMap<>();
		map.put((long) nums[0], 0l);

		for (int i = 1; i < nums.length; i++) {
			if (map.ceilingKey((long) nums[i] - (long) t) != null
					&& map.ceilingKey((long) nums[i] - (long) t) <= ((long) nums[i] + (long) t)) {
				return true;
			}

			if (map.size() >= k) {
				map.remove((long) nums[i - k]);
			}

			map.put((long) nums[i], (long) i);
		}

		return false;
	}
}