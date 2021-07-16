package string;

import java.util.Scanner;

public class lecture_9_숫자만_추출 {
    /*
        문자와 숫자가 섞여이쓴ㄴ 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
        만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5 이고 이것을 자연수를 만들면 1205 됩니다.
        추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
     */
    public static Integer solution(String str) {
        String s = str.toUpperCase().replaceAll("[^0-9]","");
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(solution(s));
    }
}