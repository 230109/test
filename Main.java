package Baekjoon;
//        Scanner sc = new Scanner(System.in);
//        int king = Integer.parseInt(sc.next());
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int result = 0;
        if(A==B && B==C && C==A){
            result = 10000 + A * 1000;
        }
        else if(A != B && B != C && C != A){
            result = Math.max(A,(Math.max(B,C))) * 100;
        }
        else {
            if(A==B){
                result = 1000 + A * 100;
            }
            else if (B==C){
                result = 1000 + B * 100;
            }
            else if (C==A){
                result = 1000 + C * 100;
            }
        }

        System.out.println(result);
    }
}

