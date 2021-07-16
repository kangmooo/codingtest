package string;

import java.util.Scanner;

public class lecture_7_회문문자열 {
    /*
        앞에서 읽을 때난 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
        문자열이 입력되면 해당 문자열이 회문 문자열이면 'YES', 아니면 'NO' 를 출력하는 프로그램을 작성하세요
        단 회문을 검사할 대 대소문자를 구분하지 않습니다.
     */
    public static String solution(String str) {
//        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())
//                ? "YES"
//                : "NO";

        String s = str.toUpperCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++)
            if (s.charAt(i)!=s.charAt(len-i-1)) return "NO";

        return "YES";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(solution(s));

    }
}