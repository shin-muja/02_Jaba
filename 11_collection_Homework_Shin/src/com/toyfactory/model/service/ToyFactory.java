package com.toyfactory.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyfactory.model.dto.Toy;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>();
	private Map<Integer,String> materialMap = new HashMap<Integer, String>();
	
	public ToyFactory() {
		// TODO Auto-generated constructor stub
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		
		//toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", ));
	}
	
	public void displayMenu() {
		
	}
}
