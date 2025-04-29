package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<>();

        while (true) {


            System.out.print("첫 번째 숫자를 입력하세요: ");
            double a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double b = sc.nextInt();
            double res=0;
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);
            try {
                res = calc.calculate(a, b, c).doubleValue();



            }catch (Exception e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }


            System.out.println(res);



            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, 진행하려면 아무거나 입력)");
            String s = sc.next();
            if (s.equals("exit")) {
                break;
            }
            /* exit을 입력 받으면 반복 종료 */
        }
        System.out.print("입력 하신 숫자 보다 큰 값들이 출력됩니다 숫자를 입력해 주세요: ");
        double num = sc.nextInt();
        calc.bigger(num);


    }
}
