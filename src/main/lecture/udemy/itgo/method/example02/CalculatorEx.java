package lecture.udemy.itgo.method.example02;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        // 인스턴스 메서드 호출
        int addResult = cal.add(100, 200);
        System.out.println("addResult : " + addResult);

        // static 메서드 호출
        long mulResult = Calculator.multiply(100, 200);
        System.out.println("mulResult : " + mulResult);

        double divResult = Calculator.divide(100.88, 10.0);
        System.out.println("divResult : " + divResult);

        // 정적 메서드의 예시(선언부에 static 제어자 붙어 있다.)
        Integer.parseInt("100");
        Math.random();
    }
}
