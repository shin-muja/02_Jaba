package ehu.kh.oop.method.run;

import ehu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.displayMenu();
		
	}
}
