package lecture.udemy.itgo.generic.example09;

// 인터페이스도 일종의 조상이기 때문에 인터페이스가 제네릭 타입이면 구현 클래스도 제네릭 타입이어야 한다.
public class Storage<T> implements Storable<T>{
    private T[] arr;

    public Storage(int size) {
        this.arr = (T[]) new Object[size];
    }

    @Override
    public void add(T item, int index) {
        this.arr[index] = item;
    }

    @Override
    public T get(int index) {
        return this.arr[index];
    }

    public T[] getArr() {
        return arr;
    }
}
