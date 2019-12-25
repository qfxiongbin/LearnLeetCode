package org.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Brian Day2 time:Oct 26, 2018 - 18:16:16 PM DynamicArray
 *
 */
public class DynamicArrayTest<T> {

	public static void main(String args[]) {
		// 1. initialize
		List<Integer> v0 = new ArrayList<Integer>();
		List<Integer> v1;
		//"ceshiceshiceshi "
		// 2. cast an array to a vector
		Integer [] a = {0,1,2,3,4};
		v1 = new ArrayList<>(Arrays.asList(a));
		// 3. make a copy
		List<Integer> v2 = v1;
		// 3. get length
		System.out.println("The size of v1 is : "+v1.size());
		// 4. access element
		System.out.println("The first Element is : "+ v1.get(0));
		// 5. iterate the vector
		print("Iterate","1",v1);
		// 6. modify element
		v2.set(0, 10);
		print("Modify","2",v2);
		// 7. sort
		Collections.sort(v2);
		print("Sort","3",v2);
		// 8. add new element at the end of the vector
		v1.add(-1);
		print("Add","4",v1);
		// 9. delete the last element
		v1.remove(v1.size()-1);
		print("Delete","version",v1);
	}
	
	/**
	 * print result to console
	 * @param type 
	 * @param version
	 * @param o
	 */
	private static void print(String type,String version,Object o) {
		System.out.print("["+type+" Version"+version+"] The contents of v1 are :");
		if(o instanceof List) {
			List<Integer> list = new ArrayList<Integer>();
			list = (List<Integer>) o;
			for(Integer item : list) {
				System.out.print(" " +item);
			}
		}
		
		System.out.println();
	}

}
