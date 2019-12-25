package org.leetcode.test;

import java.util.Arrays;

/**
 * 
 * @author Brian
 * Day1
 * time:Oct 25, 2018 - 17:34:16 PM
 * Array
 *
 */
public class ArrayTest {
	
	public static void main(String args[]){
		// 1.Initialize
		int[] a0 = new int [5];
		int [] a1 = {1,2,3};
		//2.Get Length
		System.out.println("The size of a1 is:"+a1.length);
		//3.Access Element
		System.out.println("Thie first Element is:"+a1[0]);
		//4. Iterate all Elements
		System.out.print("[Version 1] The contents of a1 are: ");
		for(int item : a1) {
			System.out.print(" "+item);
		}
		System.out.println();
		System.out.print("[Version 2] The contents of a1 are :");
		for(int i = 0; i < a1.length; i++) {
			System.out.print(" "+a1[i]);
		}
		System.out.println("dddd");
		System.out.println();
		// 5. Modify Element
		a1[0] = 4;
		System.out.print("[Version 3] The contents of a1 are :");
		for(int i = 0; i < a1.length; i++) {
			System.out.print(" "+a1[i]);
		}
		System.out.println();
		// 6. Sort
		Arrays.sort(a1);
		System.out.print("[Version 4] The contents of a1 are :");
		for(int i = 0; i < a1.length; i++) {
			System.out.print(" "+a1[i]);
		}
		
	}

}
