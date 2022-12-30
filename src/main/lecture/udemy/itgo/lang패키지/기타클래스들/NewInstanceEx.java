package lecture.udemy.itgo.lang패키지.기타클래스들;

interface I {
    public void method();
}

class A implements I {
    @Override
    public void method() {
        System.out.println("A 메서드 호출");
    }
}

class B implements I {
    @Override
    public void method() {
        System.out.println("B 메서드 호출");
    }
}

public class NewInstanceEx {
    public static void main(String[] args) throws Exception {
        Class class1 = Class.forName("lecture.udemy.itgo.lang패키지.기타클래스들.A");
        I i1 = (I) class1.newInstance(); // 런타임 시 동적 객체를 생성함
        i1.method();

        Class class2 = Class.forName("lecture.udemy.itgo.lang패키지.기타클래스들.B");
        I i2 = (I) class2.newInstance(); // 런타임 시 동적 객체를 생성함
        i2.method();
    }
}
