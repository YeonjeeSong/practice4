package com.greedy.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
		 * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
		 * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 --
		 * 1. 홍길동
		 * 2. 이순신
		 * 3. 유관순
		 * 4. 윤봉길
		 * 5. 장영실
		 * 6. 임꺽정
		 * 7. 장보고
		 * 8. 이태백
		 * 9. 김정희
		 * 10. 대조영
		 * 11. 김유신
		 * 12. 이사부
		 * 
		 * -- 출력 예시 --
		 * == 1분단 ==
		 * 홍길동 이순신
		 * 유관순 윤봉길
		 * 장영실 임꺽정
		 * 
		 * == 2분단 ==
		 * 장보고 이태백
		 * 김정희 대조영
		 * 김유신 이사부
		 * 
		 * 출력한 이후 학생 이름을 입력 받아 몇 분단 몇 번째 줄 왼쪽/오른쪽 에 위치하는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 검색할 학생 이름을 입력하세요 : 대조영
		 * 검색하신 대조영은 2분단 두 번째 줄 오른쪽에 있습니다.
		 */
		
		/* 배열 선언과 초기화 */
		String[] std = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
		
		/* 2열 3행 2차원 배열 2개 할당 - 1분단, 2분단 */
		 String[][] std1 = new String[3][2];
		 String[][] std2 = new String[3][2];
		 
		 int count = 0;	// 분담해줄 변수
		 
		 System.out.println("== 1분단 ==");
		 for(int i = 0; i < std1.length; i++) {
			 for(int j = 0; j < std1[i].length; j++) {
				 std1[i][j] = std[count++];
				 System.out.print(std1[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("== 2분단 ==");
		 for(int i = 0; i < std2.length; i++) {
			 for(int j = 0; j < std2[i].length; j++) {
				 std2[i][j] = std[count++];
				 System.out.print(std2[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 /* 학생 이름을 입력 받아 몇 분단 몇 번째 줄 왼쪽/오른쪽에 위치하는지를 출력 */
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("===============================");
		 
		 System.out.print("검색할 학생 이름을 입력하세요 : ");
		 String name = sc.nextLine();
		 
		 String partName = "";	// 분단
		 String colName = "";	// 세로
		 String rowName = "";	// 가로
		 
		 for(int i = 0; i < std1.length; i++) {
			 for(int j = 0; j < std1[i].length; j++) {
				 if(std1[i][j].equals(name)) {
					 partName = "1분단";
					 if(i == 0) {
						 rowName = "첫 번째 줄";
					 } else if(i == 1) {
						 rowName = "두 번째 줄";
					 } else {
						 rowName = "세 번째 줄";
					 }
					 if(j == 0) {
						 colName = "왼쪽";
					 } else {
						 colName = "오른쪽";
					 }
				 }
			 }
		 }
		 
		 for(int i = 0; i < std2.length; i++) {
			 for(int j = 0; j < std2[i].length; j++) {
				 if(std2[i][j].equals(name)) {
					 partName = "2분단";
					 if(i == 0) {
						 rowName = "첫 번째 줄";
					 } else if(i == 1) {
						 rowName = "두 번째 줄";
					 } else {
						 rowName = "세 번째 줄";
					 }
					 if(j == 0) {
						 colName = "왼쪽";
					 } else {
						 colName = "오른쪽";
					 }
				 }
			 }
		 }
		 
		 System.out.println("검색하신 " + name + "은/는 " + partName + " " + rowName + " " + colName + "에 있습니다.");
		 
//		 for(int i = 0; i < std1.length; i++) {
//			 
//			 for(int j = 0; j < std1[0].length; j++) {
//				 if(std1[i][0].equals(str)) {
//					 System.out.println("검색하신 " + str + "은 1분단 " + (i + 1) +"번째 줄 왼쪽에 있습니다." );
//				 }
//				 break;
//			 }
//			 
//			 for(int j = 0; j < std1[0].length; j++) {
//				 if(std1[i][1].equals(str)) {
//					 System.out.println("검색하신 " + str + "은 1분단 " + (i + 1) +"번째 줄 오른쪽에 있습니다." );
//				 }
//				 break;
//			 }
//			 
//		 }
//		 
//		 for(int i = 0; i < std2.length; i++) {
//			 
//			 for(int j = 0; j < std2[0].length; j++) {
//				 if(std2[i][0].equals(str)) {
//					 System.out.println("검색하신 " + str + "은/는 2분단 " + (i + 1) +"번째 줄 왼쪽에 있습니다." );
//				 }
//				 break;
//			 }
//			 
//			 for(int j = 0; j < std2[0].length; j++) {
//				 if(std2[i][1].equals(str)) {
//					 System.out.println("검색하신 " + str + "은/는 2분단 " + (i + 1) +"번째 줄 오른쪽에 있습니다." );
//				 }
//				 break;
//			 }
//			 
//		 }

	}

}
