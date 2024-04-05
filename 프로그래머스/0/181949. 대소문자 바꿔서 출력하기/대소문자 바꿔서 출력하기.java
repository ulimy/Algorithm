import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (char c : a.toCharArray()) {
            if (c >= 97 && c <= 122) {
                sb.append((char)(c - 32));
                continue;
            }

            sb.append((char)(c + 32));
        }
        
        System.out.println(sb);
    }
}