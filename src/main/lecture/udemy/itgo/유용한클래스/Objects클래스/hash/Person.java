package lecture.udemy.itgo.유용한클래스.Objects클래스.hash;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    int age;
    String name;
    int[] heightNWeight;

    public Person(int age, String name, int[] heightNWeight) {
        this.age = age;
        this.name = name;
        this.heightNWeight = heightNWeight;
    }

    @Override
    public int hashCode() {
        /*
         JDK 1.7 이전 버전 사용시 하위 호환
         문제: 멤버변수가 많을수록 코드가 길어진다.
         */
        // return this.age + this.name.hashCode() + this.heightNWeight.hashCode();

        /*
        JDK 1.8 이상 버전 사용시
        해시코드를 얻기가 상당히 수월하다.
         */
        return Objects.hash(this.age, this.name, Arrays.toString(this.heightNWeight));
    }
}
