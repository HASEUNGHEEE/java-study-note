package lecture.udemy.itgo.generic.example03;

// 설계 클래스 - 제네릭 클래스, 타입 파라미터 2개
public class Product<T, M> {
    private T t;
    private M m;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
