package com.greedy.section02.demensional_array.level02.normal;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 가로와 세로 길이를 정수형으로 입력 받아
		 * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
		 * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
		 * 
		 * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
		 * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
		 * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
		 * 
		 * -- 입력 예시 --
		 * 가로 행의 수를 입력하세요 : 5
		 * 세로 열의 수를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * F H Z G 
         * W F O T 
         * O R X V 
         * W H J X 
         * W S S J 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int row = 0;	// 가로 길이
		int col = 0;	// 세로 길이
		char ch = 'A';	// 랜덤 대문자 알파벳
		while(true) {
			
			System.out.print("가로 행의 수를 입력하세요 : ");
			row = sc.nextInt();
			
			if(!(1 <= row && row <= 10)) {
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
			} else {
				break;
			}
			
		}
		
		while(true) {
			
			System.out.print("세로 열의 수를 입력하세요 : ");
			col = sc.nextInt();
			
			if(!(1 <= row && row <= 10)) {
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		
		char carr[][] = new char[row][col];
		
		for(int i = 0; i < carr.length; i++) {
			
			for(int j = 0; j < carr[i].length; j++) {
				Random r = new Random();
				carr[i][j] = (char) (ch + r.nextInt(26));	// 알파벳 26개 이므로
				
				System.out.print(carr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
