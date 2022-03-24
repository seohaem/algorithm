package com.algorithm._01_그리디_구현;

/**
 * @Date 2022/03/24
 * @URL https://programmers.co.kr/learn/courses/30/lessons/42747
 */
public class P42747_H_Index {
    public static void main(String[] args) {
	    // write your code here
        P42747_H_Index main = new P42747_H_Index();
        System.out.println(main.solution(new int[]{10, 10, 10, 10, 10}));
    }

    public int solution(int[] citations) {
        int answer = 0;

        // 3, 0, 6, 1, 5
        // 1 - > 인용된 논문 1편 이상, 나머지 논문이 1편 이하
        // 3 - > 인용된 논문 3편 이상, 나머지 논문이 3편 이하

        for (int i = 1; i <= citations.length; i++) { // 1, 2, 3, 4, 5
            int big = 0;
            int small = 0;

            for (int citation : citations) {
                // i편 이상인가?
                if (i <= citation) {
                    big++;
                } else {
                    small++;
                }
            }

            if (big >= i && small <= i) {
                answer = Math.max(answer, i);
            }
        }

        return answer;
    }
}
