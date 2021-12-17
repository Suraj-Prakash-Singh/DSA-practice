package com.company;

public class noOfRotations {
    public static void main(String[] args) {
        int []arr={11,13,15,17};
        int ans = findRotations(arr);
        System.out.println(ans);

    }

    private static int findRotations(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int N = nums.length;

        if (N == 1)
            return nums[0];


        while (start <= end) {
            int mid = start + (end - start) / 2;


            int next = (mid + 1) % N;
            int prev = (mid + N - 1) % N;

            if(nums[0]<nums[nums.length-1])
                return nums[0];

            if (nums[mid] < nums[next] && nums[mid] < nums[prev]) {
                return nums[mid];
            } else if (nums[0] <nums[mid])
                start = mid + 1;

            else if (nums[mid] < nums[nums.length - 1])
                end = mid - 1;
        }
        return -1;
    }


}
