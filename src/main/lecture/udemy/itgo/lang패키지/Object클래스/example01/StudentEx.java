package lecture.udemy.itgo.lang패키지.Object클래스.example01;

public class StudentEx {
    public static void main(String[] args) {
        Student student1 = new Student(10, "홍길동");
        Student student2 = new Student(10, "홍길동");

        // Student 클래스에서 equals() 오버라이딩 -> 출력값 true 나옴
        System.out.println(student1.equals(student2));
    }
}
