package lecture.udemy.itgo.inheritance.example05;

public class SuperEx {
    public static void main(String[] args) {
        /*
        자손 클래스의 인스턴스를 생성하면,
        1) 조상 클래스의 인스턴스 생성이 제일 먼저 이루어지고,
        2) 그 후 자손 클래스의 인스턴스가 생성되어
        3) 둘이 합쳐진 상태로 힙에 할당된다.
         */
        Child child = new Child();
        child.show();
    }
}
