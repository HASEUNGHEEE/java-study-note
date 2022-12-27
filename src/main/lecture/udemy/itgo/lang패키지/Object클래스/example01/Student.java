package lecture.udemy.itgo.lang패키지.Object클래스.example01;

public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        // 타입 변환 가능 여부를 알아보기 위해서 instanceof 연산자 이용
        if (obj instanceof Student) {
            Student student = (Student) obj;
            // 논리적 동등을 위해서 조건문 설정, age & name 모두 같다
            if ((this.age == student.age) && (this.name.equals(student.name))) {
                return true;
            }
        }
        return false;
    }
}
