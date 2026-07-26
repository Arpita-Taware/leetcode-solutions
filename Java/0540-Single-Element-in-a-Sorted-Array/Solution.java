class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            int f = mid, s = mid;
            if (nums[mid - 1] == nums[mid])
                f = mid - 1;
            else
                s = mid + 1;

            int leftcount = f - lo;
            int rightcount = hi - s;
            if (leftcount % 2 == 0)
                lo = s+1;
            else
                hi = f-1;
        }
        return -1;
    }
}
