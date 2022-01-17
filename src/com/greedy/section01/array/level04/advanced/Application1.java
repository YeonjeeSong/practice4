package com.greedy.section01.array.level04.advanced;

import java.util.Set;
import java.util.TreeSet;

public class Application1 {

	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		
		/* 배열 선언과 할당 */
		int[] iarr = new int[6];
		
		/* 배열 초기화 */
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int) (Math.random() * 45) + 1;
			
			/* 중복되지 않는 난수 */
			for(int j = 0; j < i; j++) {
				if(iarr[i] == iarr[j]) {
					i--;
					break;
				}
			}
		}
		
		/* 오름차순 정렬 */
		for(int i = 1; i < iarr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
		System.out.println();
		
		/* TreeSet을 활용한 로또 번호 생성기 */
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		
		System.out.println("lotto : " + lotto);

	}

}
