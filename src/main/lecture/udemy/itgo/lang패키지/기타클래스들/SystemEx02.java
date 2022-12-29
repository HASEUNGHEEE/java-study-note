package lecture.udemy.itgo.lang패키지.기타클래스들;

public class SystemEx02 {
    public static void main(String[] args) {
        // 프로그램의 성능을 테스트할 때 유용한 메서드
        long sum = 0;

        long start = System.currentTimeMillis(); // 10의 3승분의 1초
        //long start = System.nanoTime(); // 10의 9승분의 1초

        for (long i = 1; i < 10000000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        //long end = System.nanoTime();

        System.out.println(sum);
        System.out.println("소요된 시간(밀리초) : " + (end - start) + "ms");
        System.out.println("소요된 시간(초) : " + ((end - start)/1000.0) + "s");
    }
}
