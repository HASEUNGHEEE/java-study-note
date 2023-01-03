package lecture.udemy.itgo.constructor.example03;

public class BlockEx {
    // 인스턴스 초기화 블럭 : 인스턴스가 생성될 때마다 호출 (힙에 생성)
    {
        System.out.println("인스턴스 초기화블럭 실행");
    }

    // 정적 초기화 블럭 : 단 한 번 수행 (클래스 영역에 생성)
    static {
        System.out.println("정적 초기화 블럭 실행");
    }

    public BlockEx() {
        System.out.println("생성자 호출");
    }

    /*
    초기화 순서
    1. 기본값
    2. 명시적 초기화
    3. 클래스 / 인스턴스 변수 초기화 블럭
    4. 생성자
     */
    public static void main(String[] args) {
        BlockEx b1 = new BlockEx();
    }
}
