package String;

import java.util.Scanner;

public class lecture_1_문자찾기 {
    /*
        문자열이 주어지고
        문자 주어지면
        문자열에서 주어진 문자의 갯수 출력
     */
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char s : str.toCharArray()) {
            if (s==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        System.out.print(solution(str, c));
    }
}