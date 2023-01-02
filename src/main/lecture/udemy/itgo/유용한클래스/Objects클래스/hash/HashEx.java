package lecture.udemy.itgo.유용한클래스.Objects클래스.hash;

public class HashEx {
    public static void main(String[] args) {
        Person person1 = new Person(27, "홍길동", new int[] {180, 72});
        Person person2 = new Person(27, "홍길동", new int[] {180, 72});

        System.out.println(person1.hashCode()); // 2108949071
        System.out.println(person2.hashCode()); // 940101312

        /*
        해시코드 값이 다른 이유?
        => 배열에 대한 해시코드가 다르기 때문이다.

        배열에 대한 해시코드가 다른 이유?
        => new 인스턴스가 생성되면서 새로운 메모리 번지를 갖기 때문에!
         */
        int[] arr1 = new int[] {180, 72};
        int[] arr2 = new int[] {180, 72};
        System.out.println(arr1.hashCode()); // 2054798982
        System.out.println(arr2.hashCode());  // 885951223

        /*
        Person.hashCode()가 Objects.hash()를 리턴하도록 오버라이딩 했을 때는
        해시코드가 같다.
         */
        System.out.println(person1.hashCode()); // -516090164
        System.out.println(person2.hashCode()); // -516090164
    }



}
