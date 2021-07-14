package string;

import java.util.Scanner;

public class lecture_3_문장속단어 {
    /*
        한 개의 문장이 주어지면 그 문장속에서 가장 긴 단어를 출력 하시오
        문장속의 각 단어는 공백으로 구분 됩니다.
     */
    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}