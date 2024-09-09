package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	// 속성
	private Scanner sc = new Scanner(System.in);
	
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member memberArr[] = new Member[5];
	
	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;
	
	
	public MemberService() { // 기본 생성자
		
		// memberArr배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "김철수", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
	
	}
	
	// 기능
	
	// 메뉴 출력용 메서드
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		 do {
			 System.out.println("=== 회원정보관리 프로그램 v2===");
			 System.out.println("1. 회원 가입");
			 System.out.println("2. 로그인");
			 System.out.println("3. 회원 정보 조회");
			 System.out.println("4. 회원 정보 수정");
			 System.out.println("5. 회원 검색(지역)");
			 System.out.println("0. 프로그램 종료");
			 
			 System.out.print("메뉴 입력 : ");
			 menuNum = sc.nextInt();
			 // 입력 버퍼에 남은 개행문자 제거
			 sc.nextLine();
			 
			 switch(menuNum) {
			 case 1 : System.out.println(signUp()); break;
			 case 2 : System.out.println(login()); break;
			 case 3 : System.out.println(selectMember()); break;
			 case 4 : System.out.println(updateMemberPrint()); break;
			 case 5 : searchRegion(); break;
			 case 0 : System.out.println("프로그램 종료"); break;
			 
			 default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요!"); break;
			 }
		 } while ( menuNum != 0); // menuNum이 0이되면 반복종료
		System.out.println();
	}
	
	// memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		
		// memberArr 배열을 0 인덱스부터 인덱스 끝까지 접근해서
		// 참조하는 값이 null 인경우의 인덱스를 반환
		
		for( int i = 0 ; i < memberArr.length ; i++) {
			if(memberArr[i] == null ) return i; // 현재 메서드를 종료하고 호출한 곳으로 i값을 가지고 돌아감
		}
		
		// for문을 수행했지만 return이 되지 않은 경우 해당위치 코드 수행된다
		// -> for문에서 return 되지 않았다 == 배열에 빈칸이 없다
		return -1;
	}
	
	// 회원가입 메서드
	public String signUp() {

		// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		// 빈공간의 인덱스를 번호를 어어오기
		
		System.out.println("\n============회원 가입============");

		int index = emptyIndex(); // meberArr배열에서 비어있는 인덱스 반환 받음
								  // 없다면 -1 반환
		
		// 비어있는 인덱스가 없을경우 -> 회원가입 불가
		if(index == -1 ) return "회원가입 불가능합니다(인원 수 초과)";
		
		// 회원 가입 가능
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();

		System.out.print("이름 : ");
		String memberName = sc.next();

		System.out.print("나이 : ");
		int memberAge = sc.nextInt();

		System.out.print("지역 : ");
		String region = sc.next();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if( memberPw.equals(memberPw2)) { // 일치하는 경우
			
			// 새로운 Memver 객체 생성해서 할당된 주소를
			// memverArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
						
			return "회원 가입이 되셨습니다.";
		} else { // 불일치 경우			
			return "회원 가입 실패(비밀번호 불일치)";
		}
	}
	
	// 로그인 메서드
	public String login() {
		System.out.println("\n======로그인======");
		
		if( loginMember != null) return "이미 로그인을 하셨습니다.";
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		// 1) memberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		for( int i = 0 ; i < memberArr.length ; i++ ) {
			
			if(memberArr[i] != null ) { // 회원정보가 있을 경우
				// 2) 회원정보(memberArr[i])의 아이디, 비밀번호와
				//    입력받은 아이디(memberId), 비밀번호(memberPw)가 같은지 비교
				if( memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					
					// 3) 로그인 회원 정보 객체를 참조할 변수 loginMember에
					// 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복수
					loginMember = memberArr[i];
					break; // 더이상 같은 아이디, 비밀번호가 없기 떄문에 효율을 위해 for문 종료
				}
				
			}
		}
		
		// 4) 로그인 성공/실패 여부에 따라 결과 값 반환
		if(loginMember == null ) { // 로그인 실패
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		} else { // 로그인 성공
			return loginMember.getMemberNmae() + "님 환영합니다";
		}
	}
	
	// 회원정보 조회 메서드
	public String selectMember() {
	
		// 1) 로그인 여부 확인
		if( loginMember == null ) return "로그인을 먼저 진행해주시기 바랍니다.\n";
		else {
			// 2) 로그인이 되어있는 경우
			//    현재 로그인한 회원의 정보를 출력할 문자열을 만들어 반환
			//    단, 비밀번호 제외(이름, 아이디, 나이, 지역)
			// 이름 : 홍길동
			// 아이디 : user01
			// 나이 : 20
			// 지역 : 서울
			return "이름 : " + loginMember.getMemberNmae()
					+ "\n아이디 : " + loginMember.getMemberId()
					+ "\n나이 : " + loginMember.getMemberAge()
					+ "\n지역 : " + loginMember.getRegion() + "\n";
		}
	}
	
	public int updateMember() {
		
		// 1) 로그인 여부 판별
		// -> 로그인이 되어있지 않으면 -1 반환
		if( loginMember == null ) return -1;
		
		// 2) 수정할 회원 정보 입력받기 (이름, 나이, 지역)
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("지역 : ");
		String region = sc.next();
		
		// 3) 비밀번호를 입력받아서
		//    로그인한 회원의 비밀번호와 일치하는지 확인
		System.out.print("변경을 위한 비밀번호를 확인하겠습니다.\n비밀번호 : ");
		String pass = sc.next();
		
		
		if(loginMember.getMemberPw().equals(pass)) {
			// 4) 비밀번호가 같을 경우
			//    로그인한 회원의 이름, 나이, 지역 정보를 입력받은 값으로 변경후
			//    1 반환
			
			loginMember.setMemberNmae(name);
			loginMember.setMemberAge(age);
			loginMember.setRegion(region);
			
			return 1;
			
		} else {
			// 5) 비밀번호가 다른 경우 0 반환
			return 0;
		}
	}
	
	public String updateMemberPrint() {
		
		int update = updateMember();
		
		switch ( update ) {
		case 1 : return "성공적으로 변경 되었습니다."; 
		case 0 : return "비밀번호가 다릅니다. 다시 입력해주시기 바랍니다.\n";
		case -1 : return "로그인 후 이용해주시기 바랍니다.\n";
		
		default : return "에러 발생 문의 바람";		
		}
		
	}
	
	
	
	
	// 회원 검색(지역) 메서드
	public void searchRegion() {
		System.out.println("\n=====회원 검색(지역)=====");
		
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		boolean flag = true;// 검색 결과 신호용 변수
		
		// 1) memberArr 배열의 모든 요소 순차 접근
		for( int i = 0 ; i< memberArr.length ; i++ ) {
			
			// 2) memberArr[i] 요소가 null인 경우 반복 종료
			if (memberArr[i] == null) break;
			
			// 3) memberArr[i] 요소에 저장된 지역(region)이
			//    입력받은 지역(inputRegion)과 같을 경우
			//    memberArr[i] 요소에 저장된 객체의
			//    회원의 아이디, 이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberNmae());
				
				flag = false;
				
			}
		}
		
		if(flag) {
			System.out.println("일치하는 검색 결과가 없습니다.");
		}
	}
}




