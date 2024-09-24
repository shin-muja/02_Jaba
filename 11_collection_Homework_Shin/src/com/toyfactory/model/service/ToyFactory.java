package com.toyfactory.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
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
		
		
		
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materials(1, 4, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", materials(1, 2, 2, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", materials(1, 2, 4)));
	}
	
	public void displayMenu() {

		
		
		
		try {
			while (true) {
				System.out.println("<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
			
			
				System.out.print("선택 : ");
				int input = sc.nextInt();
				sc.nextLine();
				
				System.out.println();
				
				switch ( input ) {
				case 1 : printToy(); break;
				case 2 : addToy(); break;
				case 3 : deleteToy(); break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 0 : System.out.println("종료합니다"); return;
				default : System.out.println("선택지 외에 수를 입력하셨습니다.\n다시 입력해주세요");
				}
				
			}
			
		} catch (InputMismatchException e) {
			System.out.println("제대로 입력해주세요.");
		} catch (NumberFormatException e) {
			System.out.println("q를 입력해주세요");
		}
	}
	
	
	public void printToy() {
		for(Toy toy : toySet) {
			System.out.println(toy);
		}
		
		System.out.println();
	}
	
	public void addToy() throws NumberFormatException {
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		
		
		
		for( Toy toy : toySet) {
			if( toy.getName().equals(name)) {
				System.out.println("일치하는 이름이 있습니다.");
				System.out.println();
				return;
			}
		}
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색깔 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD형식으로 입력) : ");
		String manufactureDate = sc.next();
		
		System.out.println("사용 가능한 재료 목록 : ");
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		List<Integer> list = new ArrayList<>();
		
		while(true) {
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			
			int inputNum = 0;
			
			if( intDistinguish(input)) {
				inputNum = Integer.parseInt(input);
			}
			
			
			if ( input.equals("q") && list.size() == 0) {
				System.out.println("재료를 추가해주세요");
			} else if(input.equals("q")) {
				System.out.println("새로운 장난감이 추가되었습니다!");
				toySet.add(new Toy(name, age, price, color, manufactureDate, materials(list)));
				break;	
			} else if(!materialMap.containsKey(inputNum)) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			} else if ( list.contains(inputNum)){
				System.out.println("이미 추가된 재료입니다.");
			} else {
				list.add(inputNum);
				System.out.println("재료가 추가되었습니다. : "  + materialMap.get(inputNum));
			}
		}
		
		System.out.println();
	}
	
	public void deleteToy() {
		System.out.println("삭제할 장난감의 이름을 입력해주세요 : ");
		String name = sc.next();
		
	}
	
	
	
	
	
	public Set<String> materials(List<Integer> numbers) {
		Set<String> meterial = new HashSet<String>();
		
		for(int num : numbers) {
			meterial.add(materialMap.get(num));
		}
		
		return meterial;
	}

	public Set<String> materials(int... numbers) {
		Set<String> meterial = new HashSet<String>();
		
		for(int num : numbers) {
			meterial.add(materialMap.get(num));
		}
		
		return meterial;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(toySet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToyFactory other = (ToyFactory) obj;
		return Objects.equals(toySet, other.toySet);
	}public boolean intDistinguish(String str)  {
		for( int i = 0 ; i < str.length() ; i++ ) {
			if( !Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
			
		return true;
	}
}
