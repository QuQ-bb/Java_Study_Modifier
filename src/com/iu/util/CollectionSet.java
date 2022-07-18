package com.iu.util;

import java.util.Random;
import java.util.Scanner;

public class CollectionSet {

	public int[] add(int[] nums) {
		//새로운 숫자를 추가하는데 맨뒤에 추가
		//단, 중복되지않는 숫자만 추가
		int[] addNums = new int[nums.length+1];
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 번호를 입력해주세요.");
		int add = scan.nextInt();
		
		boolean check =false;
		int i=0;
		for(i=0; i< nums.length; i++) {
				addNums[i]= nums[i];
			nums =addNums;
//
//		for(i=0; i<nums.length; i++) {
//			if(add ==nums[i]) {
//				check =!check;
//				System.out.println("중복된 숫자입니다.");
//				System.out.print("{");
//				for(int j=0; j<nums.length; j++) {
//					System.out.print(nums[j]+" ");
//				}//for
//				System.out.print("}");
//				break;
//			}//if
//		}//for
		
		
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		
		
		
		
		return nums;
		
	}//add
	
	public int[] remove(int[]nums) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력해주세요.");
		int num = scan.nextInt();
		
		boolean flag = false;
			int s=0;
			for(s=0; s<nums.length; s++) {
				if(num == nums[s]) {
					flag=!flag;
					break;
				}//if문
			}//for문
			
		int[] delNums = new int[nums.length-1];
		
		
		
		
		if(flag) {
			int j=0;
			for(int i=0; i<nums.length; i++) {
				if(i == s) {
					flag=!flag;
					continue;
				}//if문
				delNums[j]= nums[i];
				j++;
			}//for문
		}//if문
		
		nums = delNums;
		
		System.out.print("{");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.print("}");
		
		return nums;
		
	}
}
