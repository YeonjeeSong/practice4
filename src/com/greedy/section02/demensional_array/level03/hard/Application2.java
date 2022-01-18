package com.greedy.section02.demensional_array.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 홀수를 하나 입력 받아 입력받은 크기 만큼의 정사각형 형태의 2차원 배열을 할당하고
		 * 모래시계 모양으로 *을 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 홀수 하나를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * *****
         *  *** 
         *   *  
         *  *** 
         * *****
         * 
         * 단, 홀수를 입력하지 않은 경우 "홀수만 입력해야 합니다." 출력
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수 하나를 입력하세요 : ");
		int row = sc.nextInt();
		int col = row;
		
		/* 모래시계 모양으로 출력 */
		/* recipe 참조
		 * - 공백(" ")과 *을 번갈아 가며 출력
		 * - 중간에 잘라서 위, 아래를 따로 본다. */
		
		/* 입력 받은 크기 만큼의 정사각형 형태의 2차원 배열 할당 */
		String star[][] = new String[row][col];
		
		int center = (int) row / 2;
		int start = 0;		// 별이 출력되는 시작
		int end = col;		// 입력한 숫자만큼 end의 길이
		int rowstart = 0;

		/* 홀수만 입력 받기 */
		if(row % 2 == 1) {
			
			/* String 배열이라 null이 나오지 않게 초기값으로 공백을 넣어줌 */
			for(int i = 0; i < star.length; i++) {
				for(int j = start; j < star[i].length; j++) {
					star[i][j] = " ";
				}
			}

			/* 패턴 찾기 */
			for(int i = 0; i < star.length; i++) {
				
				/* 첫 줄은 무조건 다 채우기 */
				for(int j = start; j < end; j++) {
					star[i][j] = "*";
				}
				
				if(rowstart < center){	// rowstart : i와 동일한 값, center : i/2
					// 5 -> 3 -> 1 순으로 공백이 늘고 별이 줄어든다.
					start++;	// 별이 한 자리 뒤부터 출력 -> 두 자리 뒤부터 출력 -> ...
					end--;		// 별이 뒤에서 한자리 당긴 곳까지만 출력 -> 뒤에서 두 자리 당긴 곳까지만 출력 -> ...
					rowstart++;
				} else {
					// 1 -> 3 -> 5 순으로 공백이 줄고 별이 늘어난다.
					start--;
					end++;
					rowstart++;
				}
			}

			for(int i = 0; i < star.length; i++) {
				for(int j = 0; j < star.length; j++) {
					System.out.print(star[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("홀수만 입력해야 합니다.");
		}

	}

}
