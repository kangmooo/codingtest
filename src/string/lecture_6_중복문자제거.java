package string;

import java.util.Scanner;

public class lecture_6_중복문자제거 {
    /*
        소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     */
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(solution(s));

    }
}