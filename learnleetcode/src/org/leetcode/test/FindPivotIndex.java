package org.leetcode.test;

/**
 * 
 * @author Brian Day3 time:Oct 28, 2018 - 10:42:16 AM FindPrivotIndex
 *
 */
public class FindPivotIndex {

	public static void main(String args[]) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		FindPivotIndex fp = new FindPivotIndex();
		int index = fp.pivotIndex(nums);
		System.out.println("The pivotIndes of nums is " + index);
	}

	/**
	 * Given an array of integers nums, write a method that returns the "pivot"
	 * index of this array.
	 * 
	 * We define the pivot index as the index where the sum of the numbers to the
	 * left of the index is equal to the sum of the numbers to the right of the
	 * index.
	 * 
	 * If no such index exists, we should return -1. If there are multiple pivot
	 * indexes, you should return the left-most pivot index.
	 * 
	 * @param nums
	 * @return
	 */
	public int pivotIndex(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		long total = 0L;

		for (int n : nums) {
			total += n;
		}

		long left = 0L, right = total;
		for (int i = 0; i < nums.length; i++) {
			right -= nums[i];
			if (left == right) {
				return i;
			}
			left += nums[i];
		}
		return -1;
	}

}
