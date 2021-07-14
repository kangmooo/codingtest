package String;

import java.util.Scanner;

public class lecture_2_대소문자변환 {
    /*
        대문자 와 소문자 가 같이 존재하는 문자열 입력 받아
        대문자 <-> 소문자 서로 변경 해서 출력
     */
    public static String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            answer = (Character.isLowerCase(c))
                    ? answer + Character.toUpperCase(c)
                    : answer + Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}