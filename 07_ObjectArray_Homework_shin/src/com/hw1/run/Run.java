package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-1111-2222", "서울 마곡");
		
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);
		
		System.out.println("=============================================================================");
		
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("010-5555-9999");
		emp[0].setAddress("전라도 광주");
		
		System.out.println(emp[0]);
		

		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println(emp[1]);

		System.out.println("=============================================================================");
		
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		System.out.println(emp[2].information());

		System.out.println("=============================================================================");
		
		int sum = emp[0].yearSalaty() + emp[1].yearSalaty() + emp[2].yearSalaty();
		int aver = sum / emp.length;
		
		System.out.println("직원들의 평균 연봉 : " + aver + "원");
		
	}

}
