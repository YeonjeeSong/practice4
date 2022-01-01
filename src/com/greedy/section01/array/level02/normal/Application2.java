package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 990101-1234567
		 * 
		 * -- 출력 예시 --
		 * 990101-1******
		 */
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * (String Class의 toCharArray() : char[] 메소드 활용 가능
		 *  char[] carr = 문자열변수.toCharArray(); 와 같이 사용) */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 : ");
		String str = sc.nextLine();
		
		char[] sarr = str.toCharArray();
		
		for(int i = 0; i < sarr.length; i++) {
			
			if(i >= 8) {	// i : index라 8부터
				sarr[i] = '*';
			}
			
			System.out.print(sarr[i]);
		}

	}

}
