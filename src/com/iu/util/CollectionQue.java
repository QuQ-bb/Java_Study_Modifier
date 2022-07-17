package com.iu.util;

import java.util.Random;

public class CollectionQue {
	
	public int[] add(int[] nums) {
		//새로운 번호가 추가되는데 0번에 추가한다.
		int[] addNums = new int[nums.length+1];
		Random random = new Random();
		addNums[0] = random.nextInt(50);
		int a = 1;
		for(int i=0; i<nums.length; i++) {
			addNums[a] = nums[i];
			a++;
		}
		nums = addNums;
		
		System.out.print("{");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.print("}");
		return nums;
		
		
	}
	
	public int[] remove(int[] nums) {
		//마지막인덱스번호를 삭제한다.
		
		int[] delNums = new int[nums.length-1];
		for(int i=0; i<delNums.length; i++) {
			delNums[i] = nums[i];
		}
		
		nums = delNums;
		System.out.print("{");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.print("}");
		
		
			return nums;
	}

}
