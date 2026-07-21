class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zerocnt = 0;
        int onecnt = 0;
        int twocnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zerocnt++;
            else if (nums[i] == 1)
                onecnt++;
            else if (nums[i] == 2)
                twocnt++;
        }
        for (int j = 0; j < zerocnt; j++) {
            nums[j] = 0;
        }

        for (int j = zerocnt; j < (zerocnt + onecnt); j++) {
            nums[j] = 1;
        }
        for (int j = (zerocnt + onecnt); j < n; j++) {
            nums[j] = 2;
        }

    }
}
