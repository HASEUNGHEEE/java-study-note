package lecture.udemy.itgo.유용한클래스.Objects클래스;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorEx {
    // 중첩 클래스(정적멤버클래스)
    static class Student {
        int studentNum;
        String name;

        public Student(int studentNum, String name) {
            this.studentNum = studentNum;
            this.name = name;
        }
    }

    // name 을 가지고 비교
    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.compareTo(o2.name) < 0) {
                return -1;
            } else if (o1.name.compareTo(o2.name) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "아리울");
        Student student2 = new Student(1, "손흥민");
        Student student3 = new Student(3, "김연아");

        /*
        비교자(Comparator<T> 인터페이스를 익명 구현 객체로 대입)

        int result = Objects.compare(student1, student2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 구현방법 1.
                if (o1.studentNum < o2.studentNum) {
                    return -1;
                } else if (o1.studentNum == o2.studentNum) {
                    return 0;
                } else {
                    return 1;
                }
                // 구현방법 2.
                return o1.studentNum - o2.studentNum;
            }
        });
         */

        int result = Objects.compare(student1, student3, new StudentComparator());
        if (result > 0) {
            System.out.println("o1.name이 큽니다.");
        } else if (result == 0) {
            System.out.println("o1.name과 o2.name이 같습니다.");
        } else {
            System.out.println("o2.name이 큽니다.");
        }
    }
}
