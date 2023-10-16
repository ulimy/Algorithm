import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String answer = IntStream.rangeClosed(1, n)
            .mapToObj(i -> "*".repeat(i))
            .collect(Collectors.joining("\n"));

        System.out.println(answer);
    }
}