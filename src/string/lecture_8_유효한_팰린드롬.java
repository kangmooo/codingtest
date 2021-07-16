package string;

import java.util.Scanner;

public class lecture_8_유효한_팰린드롬 {
    /*
        앞에서 읽을 때난 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
        문자열이 입력되면 해당 문자열이 팰린드롬 이면 'YES', 아니면 'NO' 를 출력하는 프로그램을 작성하세요
        단 회문을 검사할 대 대소문자를 구분하지 않습니다.
        알파벳 이외의 문자들은 무시합니다.
     */
    public static String solution(String str) {
        String s = str.toUpperCase().replaceAll("[^A-Z]","");
        return s.equals(new StringBuilder(s).reverse().toString())
                ? "YES"
                : "NO";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(solution(s));

    }
}