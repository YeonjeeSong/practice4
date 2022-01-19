package com.greedy.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
		 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 * 
		 * -- 출력 예시 --
		 * ================== A반 성적표 ====================
         * 이름        국어      영어      수학     합계     평균
         * -----------------------------------------------
         * 홍길동       80      90       77      247     82.3
         * 이순신       78      97       86      261     87.0
         * 유관순       71      68       88      227     75.7
         * -----------------------------------------------
         * 합계        229     255      251      735     81.7
		 * */
		
		/* 학생 성적 정보 초기화 */
		int[][] iarr = {{80, 90, 77}, {78, 97, 86}, {71, 68, 88}};
		
		String name = "";
		
		System.out.println("============== A반 성적표 ==============");
		System.out.println("  이름   국어   영어   수학   합계    평균");
		System.out.println("---------------------------------------");
		
		for(int i = 0; i < iarr.length; i++) {
			
			switch(i) {
			case 0 : name = "홍길동"; break;
			case 1 : name = "이순신"; break;
			case 2 : name = "유관순"; break;
			}
			System.out.print(" " + name + "   ");
			
			for(int j = 0; j < iarr[i].length; j++) {
				
				/* name의 국어, 영어, 수학 점수 출력 */
				System.out.print(iarr[i][j]);
				
				if(j != iarr[i].length - 1) {
					System.out.print("    ");
				} else {
					
					/* name의 합계, 평균 출력 */
					int sum = 0;
					float avg = 0.0f;
					
					for(int k = 0; k < iarr[i].length; k++) {
						sum += iarr[i][k];
					}
					
					avg = (float) sum / iarr[i].length;
					avg = ((float) Math.round(avg * 10)) / 10;
					
					System.out.print("    " + sum + "    " + avg);
				}
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		System.out.print("  합계 ");
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int total = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				if(j == 0) {
					sum1 += iarr[i][j];		// 국어 총합
				} else if(j == 1) {
					sum2 += iarr[i][j];		// 영어 총합
				} else if(j == 2) {
					sum3 += iarr[i][j];		// 수학 총합
				}
			}
		}
		
		total = sum1 + sum2 + sum2;
		avg = (float) total / (float) (iarr.length * iarr[0].length);
		avg = ((float) Math.round(avg * 10)) / 10;
		
		System.out.print("  " + sum1 + "   " + sum2 + "   " + sum3 + "    " + total + "    " + avg);
		
//		int sum1 = 0;	// 홍길동의 합계
//		for(int i = 0; i < iarr1.length; i++) {
//			sum1 += iarr1[i];
//		}
//		int sum2 = 0;	// 이순신의 합계
//		for(int i = 0; i < iarr2.length; i++) {
//			sum2 += iarr2[i];
//		}
//		int sum3 = 0;	// 유관순의 합계
//		for(int i = 0; i < iarr3.length; i++) {
//			sum3 += iarr3[i];
//		}
//		
//		int sum4 = 0;	// 국어 총합
//		for(int i = 0; i < iarr.length; i++) {
//			for(int j = 0; j < iarr[i].length; j++) {
//				sum4 += iarr[i][0];
//				break;
//			}
//		}
//		int sum5 = 0;	// 영어 총합
//		for(int i = 0; i < iarr.length; i++) {
//			for(int j = 0; j < iarr[i].length; j++) {
//				sum5 += iarr[i][1];
//				break;
//			}
//		}
//		int sum6 = 0;	// 수학 총합
//		for(int i = 0; i < iarr.length; i++) {
//			for(int j = 0; j < iarr[i].length; j++) {
//				sum6 += iarr[i][2];
//				break;
//			}
//		}
//		
//		int sum = sum1 + sum2 + sum3;
//		
//		double avg1 = (double) sum1 / 3;
//		double avg2 = (double) sum2 / 3;
//		double avg3 = (double) sum3 / 3;
//		
//		double avg = (avg1 + avg2 + avg3) / 3;
//		
//		System.out.println("============== A반 성적표 ==============");
//		System.out.println("이름   국어  영어  수학  합계  평균");
//		System.out.println("-------------------------------------");
//		System.out.println("홍길동" + "  " + iarr1[0] + "    " + iarr1[2] + "   " + iarr1[2] + "   " + sum1 + "   " + avg1);
//		System.out.println("이순신" + "  " + iarr2[0] + "    " + iarr2[2] + "   " + iarr2[2] + "   " + sum2 + "   " + avg2);
//		System.out.println("유관순" + "  " + iarr3[0] + "    " + iarr3[2] + "   " + iarr3[2] + "   " + sum3 + "   " + avg3);
//		System.out.println("-------------------------------------");
//		System.out.println("합계" + "   " + sum4 + "  " + sum5 + "  " + sum6 + "  " + sum + "  " + avg);

	}

}
