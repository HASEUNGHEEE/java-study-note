package lecture.udemy.itgo.generic.example07;

import java.util.Arrays;

public class WildCardEx {
    // ? 는 어떠한 객체도 다 받겠다는 의미
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생 : " +
                Arrays.toString(course.getStudents()));
    }

    // 상위 타입 제한 : Student 이거나 Student 를 상속받는 클래스
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생 : " +
                Arrays.toString(course.getStudents()));
    }

    // 하위 타입 제한 : Worker 이거나 Worker 의 상위 클래스
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생 : " +
                Arrays.toString(course.getStudents()));
    }


    public static void main(String[] args) {
        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 10));
        registerCourse(new Course<Worker>("직장인 과정", 8));
        registerCourse(new Course<HighSchoolStudent>("고등학생 과정", 7));

        // registerCourseStudent(new Course<Person>("일반인 과정", 5));
        registerCourseStudent(new Course<Student>("학생 과정", 10));
        // registerCourseStudent(new Course<Worker>("직장인 과정", 8));
        registerCourseStudent(new Course<HighSchoolStudent>("고등학생 과정", 7));

        registerCourseWorker(new Course<Person>("일반인 과정", 5));
        // registerCourseWorker(new Course<Student>("학생 과정", 10));
        registerCourseWorker(new Course<Worker>("직장인 과정", 8));
        // registerCourseWorker(new Course<HighSchoolStudent>("고등학생 과정", 7));

        System.out.println("----------------------------------------------");

        // 직접 Course 객체 생성
        Course<Person> personCourse = new Course<>("일반인 과정", 4);
        personCourse.add(new Person("일반인1"));
        personCourse.add(new Person("일반인2"));
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("일반인4"));

        registerCourse(personCourse);
        registerCourseWorker(personCourse);
        // registerCourseStudent(personCourse); // Student 의 하위 타입만 들어올 수 있음, Person 은 조상 타입

        System.out.println();

        Course<Worker> workerCourse = new Course<>("직장인 과정", 3);
        workerCourse.add(new Worker("김대리"));
        workerCourse.add(new Worker("박과장"));
        workerCourse.add(new Worker("유선임"));
        workerCourse.add(new Worker("주인턴"));

        registerCourse(workerCourse);
        registerCourseWorker(workerCourse);
        // registerCourseStudent(workerCourse); // 아무런 관계 없는 클래스

        System.out.println();

        Course<Student> studentCourse = new Course<>("학생 과정", 3);
        studentCourse.add(new Student("홍길동"));
        studentCourse.add(new Student("김연아"));
        studentCourse.add(new Student("손흥민"));

        registerCourse(studentCourse);
        // registerCourseWorker(studentCourse); // 아무런 관계 없는 클래스
        registerCourseStudent(studentCourse);
    }
}
