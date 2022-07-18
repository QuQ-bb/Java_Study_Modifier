package com.iu.main;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {

		//test data set
		int[] nums = {1,2,3};
		
		String name = "test";
		char c = name.charAt(0);
		System.out.println(c);
		
		
		
		//1.com.iu.util.CollectionStack
			//add,remove메소드가 들어가
			//add를 호출하면 입력받은 새로운 숫자추가 무조건 0번에 추가
			//remove를 호출하면 삭제해 어디를? 0번 인덱스 삭제
			//add -{새로운값,1,2,3,4}
			//remove -{2,3}
	
		//2.com.iu.util.CollectionQue
			//add - 새로운 번호가 추가되는데 0번에 추가한다 {4,1,2,3}
			//remove -마지막인덱스번호를 삭제한다 {1,2}

		
		//3.com.iu.util.CollectionSet
			//add -	 새로운 숫자를 추가하는데 맨뒤에 추가 {1,2,3,4}
			// 			단,중복되지않는 숫자만 추가 (중복숫자있으면 추가안됨)
			//remove -	삭제할 숫자를입력받아서 일치하는 숫자를 삭제	{2,3}
		
		CollectionStack cs = new CollectionStack();
//		 nums = cs.add(nums);
//		System.out.println(nums);
//		nums = cs.remove(nums);
		
		CollectionQue cq = new CollectionQue();
		//cq.add(nums);
		//cq.remove(nums);
		
		CollectionSet cset = new CollectionSet();
		//nums=cset.add(nums);
		//cset.remove(nums);
		
	}//main
}//class
