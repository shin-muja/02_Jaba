package edu.kh.arrray.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int numList[] = new int[9];
		int sum = 0;
		
		for( int i =0; i < numList.length ; i++) {
			numList[i] = i+1;
			
			System.out.print(numList[i] + " ");
			
			if(i % 2 ==0 ) sum += numList[i];
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		int numList[] = new int[9];
		int sum = 0;
		
		for( int i = 0 ; i < 9 ; i++) {
			numList[i] = numList.length - i;
			
			System.out.print(numList[i] + " ");
			
			if(i % 2 != 0 ) sum += numList[i];
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		int arr[] = new int[5];
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for( int i = 0 ; i < arr.length ; i++) {
			if(input ==  arr[i]) {
				System.out.println("\n인덱스 : " + i);
				flag = false;
				break;
			} 
		}
		
		if( flag ) {
			System.out.println("\n일차하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] result = new char[str.length()];
		
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, input);
		
		for( int i = 0 ; i < result.length ; i++) {
			result[i] = str.charAt(i); 
			
			if(result[i] == input) {
				count++;
				System.out.print(i + " ");
			}
			
		} 
		
		System.out.println("\ni 개수 : " + count);
	 }

	public void practice6() {
		System.out.print("정수 : ");
		int index = sc.nextInt();
		
		int arr[] = new int[index];
		
		int sum = 0;
		
		for( int i = 0 ; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("\n" + Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
		
		
		
	}

	public void practice7() {
		System.out.print("주민등록번호(-)포함 : ");
		String peopleNum = sc.nextLine();
		
		for(int i = 0 ; i < peopleNum.length() ; i++) {
			if(i < 8) System.out.print(peopleNum.charAt(i));
			else System.out.print("*");
			
			
		}
	}

	public void practice8() {
		boolean patton = true;
		
		int input = 0;
		
		while (patton) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			if( input % 2 ==0 || input < 3) System.out.println("다시 입력해주세요.\n");
			else {
				patton = false;
			}
		}
		
		int numList[] = new int[input];
		
		for( int i = 0 ; i < numList.length ; i++) {
			
			if( i < numList.length / 2 ) {
				numList[i] = i+1;
				System.out.print(numList[i]);
			} else {
				numList[i] = numList.length - i;
				System.out.print(numList[i]);
			}
			
			if(i != numList.length -1 ) {
				System.out.print(", ");
			}
		}
	}

	public void practice9() {
		int arr[] = new int[10];
		
		 System.out.print("발생한 난수 : ");
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int arr[] = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0 ; i < arr.length ; i++) {
			if( max < arr[i]) max = arr[i];
			
			if( min > arr[i]) min = arr[i];
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("\n최소값 : " + min);
		
		
		
		
	}

	public void practice11() {
		int arr[] = new int[10];
		
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10 + 1);

			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

	public void practice12() {
		int arr[] = new int[6];
		
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*45 + 1);

			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		int bigger = 0;

		for( int i = 0 ; i <arr.length ; i++ ) {
			bigger = arr[i];
			
			for( int j = i+ 1 ; j < arr.length ; j++) {
				if(bigger > arr[j]) {
					arr[i] = arr[j];
					arr[j] = bigger;
					bigger = arr[i];
				}
				
			}
		}
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*	// 내방식
	public void practice13() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char arr[] = new char[str.length()];
		
		for( int i = 0 ; i < arr.length ; i++ ) {
			
			arr[i] = str.charAt(i);
			
			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) {
					arr[i] =' ';
				}
			}
		}
		
		System.out.print("문자열에 있는 문자 : ");
		
		for( int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == ' ') {
				for( int j = i ; j < arr.length - 1; j++) {
					arr[j] = arr[j +1];
					arr[j+1] = ' ';
				}
			}
			
			System.out.print(arr[i] + " ");
			
			
			if(arr[i] == ' ' ) {
				arr = Arrays.copyOf(arr, i);
				break;
			} 
			
			
		}
		
		
		System.out.println("\n문자 개수 : " + arr.length);
	}*/

	public void practice13() {
		// 1. 문자열 담기
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 해당 문자열의 문자들을 char[] 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. char 배열에서 중복값 존재할 경우 출력x
		int count = 0; //문자 개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0 ; i< arr.length ; i++) {
			
			boolean flag = true;
			
			// for문
			for( int j = 0 ; j < i ; j++ ) {
				
				if(arr[i] == arr[j]) flag = false;
			}
			
			
			if(flag) { // 중복이 발생하지 않았을 경우
				
				// if문
				if ( i == 0 ) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				// 중복 아닐때만 count 갯수 늘리기
				count++;
				
			}
			
		}
		
		System.out.println("\n문자 개수 : " + count);
		
	}

	/*  // 내방식 14예제
	public void practice14() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[input];
		char exit = 0;
		
		for( int i = 0 ; i<arr.length ; i++) {
			
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
			
			if( i == arr.length - 1) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				exit = sc.next().toLowerCase().charAt(0);
				sc.nextLine();
			}
			
			if( exit == 'y' ) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int plus = sc.nextInt();
				sc.nextLine();
				
				arr = Arrays.copyOf(arr, arr.length + plus);
				exit = 0;
			}
		}
		
		System.out.println("\n" + Arrays.toString(arr));
			
	}*/
	
	public void practice14() {
		// 1. 첫 배열 크기 지정
		
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i< arr.length; i++) {
			System.out.print((i+1) + "번쨰 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복이 시작되는 구간부터 무한 반족하는
		// while 작성하여 내부에 종료조건 만들어서 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			// 4. 값을 더 입력할 경우
			if( ch == 'Y') {
				// 5. 더 입력받은 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> arr.length + addSize 배열 크기
				String[] newArr = new String[arr.length + addSize];
				
				//7. 배열 복사 + 새로운 문자열 입력받기
				for( int i = 0; i < newArr.length ; i++ ) {
					
					if(i < arr.length) { // 인덱스의 크기가 기존배열보다 작을경우
						newArr[i] = arr[i]; //기존 배열 요소값 복사
						
					} else { // 인덱스 크기가 기존 배열보다 클 경우 새로운 입력 받기
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 newArr 주소대입
				arr = newArr;
				
			} else if(ch == 'N') { // 값을 더 입력하지 않은 경우
				break; // while 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
