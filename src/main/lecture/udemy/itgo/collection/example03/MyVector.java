package lecture.udemy.itgo.collection.example03;

public class MyVector {
    Object[] data; // 객체를 담기 위해서 객체 배열을 선언한다.
    private int capacity; // 용량
    private int size = 0; // 객체 수

    // 기본 생성자
    public MyVector() {
        this(10);
    }

    // 매개변수가 있는 생성자
    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Vector 컬렉션은 음수 방을 만들 수 없습니다." + capacity);
        }

        this.capacity = capacity;
        data = new Object[capacity];
    }

    // 벡터에 저장된 객체가 있는지 확인하는 메서드
    public boolean isEmpty() {
        return size == 0;
    }

    // 벡터의 용량을 리턴하는 메서드
    public int getCapacity() {
        return this.capacity;
    }

    // 객체 수를 리턴해주는 메서드
    public int getSize() {
        return this.size;
    }

    // 최소한의 저장공간(capacity)를 확보하는 메서드
    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }

    private void setCapacity(int capacity) {
        // 용량의 크기가 같다면
        if (this.capacity == capacity) {
            return;
        }
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size); // 배열 복사
        data = tmp; // 참조변수의 값을 변경함
        this.capacity = capacity; // 용량 변경
    }

    public boolean add(Object obj) {
        ensureCapacity(size++); // size 0이기 때문에 ++로 최소 저장 공간 확보
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    public Object remove(int index) {
        Object oldObj;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];
        if (index != size-1) {
            System.arraycopy(data, index + 1, data, index, size-index-1);
        }
        data[size-1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (int i = 0; i < size; i++) {
            if (i == (size - 1)) {
                tmp += this.data[i];
            } else {
                tmp += this.data[i] + ",";
            }
        }
        return "[" + tmp + "]";
    }
}
