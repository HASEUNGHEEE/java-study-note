package lecture.udemy.itgo.collection.example03;

public class MyVectorEx {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        System.out.println("용량 수 : " + myVector.getCapacity());

        myVector.add("2000");
        myVector.add("20");
        myVector.add("-15");
        myVector.add("홍길동");
        myVector.add("7.5");

        System.out.println("1번 인덱스의 값 : " + myVector.get(0));
        System.out.println("삭제전 : " + myVector.toString());
        System.out.println("사이즈 : " + myVector.getSize());

        myVector.remove("2000");
        myVector.remove("홍길동");
        System.out.println("삭제전 : " + myVector.toString());
        System.out.println("사이즈 : " + myVector.getSize());

        myVector.clear();
        System.out.println("삭제전 : " + myVector.toString());
        System.out.println("사이즈 : " + myVector.getSize());
    }
}
