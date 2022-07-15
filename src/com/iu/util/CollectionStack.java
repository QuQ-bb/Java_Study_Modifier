package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection{

	Scanner scan = new Scanner(System.in);
	
	@Override
	public int[] add(int[] nums) {
		//새로 입력되는 숫자를 인데스 0번에 추가
		System.out.println("추가할 숫자를 입력해주세요.");
		int addNum = scan.nextInt();
		
		//nums[0] = addNum;
		int [] num2 = new int[nums.length+1];
			
			num2[0] =addNum;
			num2[1] =nums[0];
			num2[2] =nums[1];
			num2[3] =nums[2];
//			System.out.println(addNum);
//			System.out.println(num2[0]);
//			System.out.println(nums[0]);
		nums = num2;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
		//출력 그거 어떻게 하는건데
		return nums;
	}

	@Override
	public int[] remove(int[] numbers) {
		//새로 입력되는 숫자를 인덱스 0번부터 삭제
//		System.out.println("삭제할 숫자를 입력해주세요.");
//		int delNum = scan.nextInt();
		
		
		
		return numbers;
	}

	
}
