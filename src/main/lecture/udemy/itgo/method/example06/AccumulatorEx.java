package lecture.udemy.itgo.method.example06;

class A {
    int data1 = 10;
    int data2 = 30;
}

public class AccumulatorEx {
    public static void main(String[] args) {
        Accumulator ac = new Accumulator();
        int iResult = ac.add(10, 50);
        System.out.println("iResult : " + iResult);

        long lResult = ac.add(100, 7500L);
        System.out.println("lResult : " + lResult);

        double dResult = ac.add(107.88, 11.55);
        System.out.println("dResult : " + dResult);

        long arrResult = ac.add(new int[] {1, 2, 3, 4, 5});
        System.out.println("arrResult : " + arrResult);

        int classResult = ac.add(new A());
        System.out.println("classResult : " + classResult);
    }
}
