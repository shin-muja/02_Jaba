package edu.kh.collection.pack3.model.service;

import java.util.*;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
	// - Key를 모아두면 Set의 특징(중복X)
	// - Value를 모아두면 List의 특징(중복 O)
	
	public void ex1() {
		
		// HashMap<K, V> : Map 의 자식 클래스 중 가장 대표 되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(K, V) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		// key 중복 테스트
		map.put(1, "홍홍홍"); // 중복 허용 x, 대신 Value 덮어씀
		
		// value 중복 테스트
		map.put(7, "최길동");

		System.out.println(map);
	}
	
	public void ex2( ) {
		// Map 사용 예제
		
		// VO(값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용
		// -> 재사용이 적음 VO는 오히려 코드 낭비
		// -> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있음.
		
		// 1) VO버전
		Member mem = new Member();
		
		mem.setId("user01");
		mem.setPw("pass01");
		mem.setAge(30);
		
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getAge());
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		// value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있다
		
		// 값세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값출력
		// Object(Value) Map.get(Object Key) : 매개변수로 전달받은 key와 대응되는 value 반환
		System.out.println( map.get("id"));
		System.out.println( map.get("pw"));
		System.out.println( map.get("age"));
		
		System.out.println("-------------------------------");
		
		// ** Map에 저장된 데이터 순차적으로 접근하기
		
		// Map에서 key만 모아두면 Set의 특징을 가진다.
		// -> 이를 활용해서 Map에서 KeySet()메서드 제공
		// -> 
	}
	
}


































