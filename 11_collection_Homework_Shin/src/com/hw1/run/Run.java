package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		List<Friend> leader = new ArrayList<Friend>();
		
		leader.add(new Friend("짱구"));
		leader.add(new Friend("철수"));
		leader.add(new Friend("유리"));
		leader.add(new Friend("훈이"));
		leader.add(new Friend("맹구"));
		
		Random random = new Random();
		
		int choice = random.nextInt(5);
		
		System.out.println(leader.get(choice).getName() + "가 떡잎방범대 대장이다!");
	}
}
