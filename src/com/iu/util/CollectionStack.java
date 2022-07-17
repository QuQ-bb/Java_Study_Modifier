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
		int j=1;
		for(int i=0; i<nums.length; i++) {
			num2[j] =nums[i];
			num2[j] =nums[i];
			num2[j] =nums[i];
			j++;
		}
//			System.out.println(addNum);
//			System.out.println(num2[0]);
//			System.out.println(nums[0]);
		nums = num2;
		System.out.print("{");
		for(int i =0; i<num2.length; i++) {
			System.out.print(nums[i]);
			System.out.print(",");
		}
		System.out.println("}");
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		//출력 그거 어떻게 하는건데
		return nums;
	}

	@Override
	public int[] remove(int[] nums) {
		//새로 입력되는 숫자를 인덱스 0번부터 삭제
//		System.out.println("삭제할 숫자를 입력해주세요.");
//		int delNum = scan.nextInt();
		
		int[] nums3 = new int[nums.length-1];
		
		int d =0;
		for(int i =1; i<nums.length; i++) {
			nums3[d] =nums[i];
			 d++;
		}
		
		nums = nums3;
		
		System.out.print("{");
		for(int i=0; i<nums3.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("}");
		
		
		
		return nums;
	}

	
}
