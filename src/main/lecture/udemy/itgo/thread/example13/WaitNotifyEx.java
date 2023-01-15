package lecture.udemy.itgo.thread.example13;

public class WaitNotifyEx {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();

        /*
        실행코드에 가서 notify()와 wait()를 호출하는데,
        WorkObject 의 methodA()와 methodB()가 synchronized(동기화) 되어 있기 때문에
        메서드 잠금이 일어나면서 서로 번갈아 가면서 실행된다.
         */
        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();

        /*
        스레드 간의 협업 - Object 클래스의 메서드인 notify()와 wait()를 이용하면 된다.
        단, 동기화 처리가 된 곳에서 호출해야 한다.
         */
    }
}
