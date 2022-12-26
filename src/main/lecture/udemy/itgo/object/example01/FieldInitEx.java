package lecture.udemy.itgo.object.example01;

import lecture.udemy.itgo.object.example01.FieldInit;

public class FieldInitEx {
    public static void main(String[] args) {
        /*
        new 연산자가 클래스에 있는 멤버들의 바이트 크기만큼
        힙에다가 메모리 할당을 하며 동시에 초기화를 시켜주는
        역할을 한다.
         */
        FieldInit f1 = new FieldInit();
        System.out.println(f1.byteField);
        System.out.println(f1.boolField);
        System.out.println(f1.floatField);
        System.out.println(f1.arrField);

        System.out.println(f1);
    }
}
