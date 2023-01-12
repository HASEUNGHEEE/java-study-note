package lecture.udemy.itgo.generic.example08;

public class StudentEx {
    public static void main(String[] args) {
        // 필드의 다형성
        Person<String, String> person = new Student<String, String, Integer>();
        person.setKind("황인");
        person.setMode("전투태세");

        System.out.println(person.getKind() + " : " + person.getMode());

        Student<String, String, Integer> student = new Student<>();
        student.setKind("백인");
        student.setMode("평화모드");
        student.setC(100);

        System.out.println(student.getKind() + " : " + student.getMode() +
                " 전투력 : " + student.getC());
    }
}
