package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    public enum OperatorType{
        PLUS, MINUS, MULTIPLY, DIVIDE;


        public static OperatorType fromChar(char c) {

            if(c=='+'){
                return OperatorType.PLUS;
            }else if(c=='-'){
                return OperatorType.MINUS;
            }else if(c=='*'){
                return OperatorType.MULTIPLY;
            }else if(c=='/'){
                return OperatorType.DIVIDE;
            }
            throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + c);
        }

    }
    private ArrayList<Double> arrayList = new ArrayList<Double>();


    public Number calculate(T a,T b,char c){
        OperatorType op = OperatorType.fromChar(c);
        double x = a.doubleValue();
        double y = b.doubleValue();
        double result;

        switch (op) {
            case PLUS:
                result = x + y;
                break;
            case MINUS:
                result = x - y;
                break;
            case MULTIPLY:
                result = x * y;
                break;
            case DIVIDE:
                if (y == 0.0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = x / y;
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 연산자입니다.");
        }
        arrayList.add(result);
        return result;

    }
    public ArrayList<Double> get(){
        return arrayList;
    }
    public void set(Double num){
        arrayList.add(num);
    }
    public void delete(){
        arrayList.remove(0);
    }
    public void bigger(double a){
        arrayList.stream().filter(x -> x > a).forEach(System.out::println);
    }
}
