package string;

import java.util.Scanner;

public class lecture_5_특정문자뒤집기 {
    /*
        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        특수문자는 자기자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
     */
    public static String solution(String str) {
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
            }
            lt++;
            rt--;
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(solution(s));

    }
}