package string;

import java.util.Scanner;

public class lecture_4_단어뒤집기 {
    /*
        N 개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오
     */
    public static String solution(String str) {
//        return new StringBuffer(str).reverse().toString();
        char [] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }

        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String s : str) {
            System.out.println(solution(s));

        }
    }
}