package lecture.udemy.itgo.collection.example02;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        // 용량이 5인 벡터를 생성한다.
        // 생성자의 매개값을 주지 않으면, 기본적으로 10개의 용량을 가진 벡터가 생성된다.
        Vector<Board> vector = new Vector<>(5);
        System.out.println("용량 : " + vector.capacity()); // 5
        System.out.println("사이즈 : " + vector.size()); // 0
        System.out.println("-------------------------------");

        // 객체 추가
        vector.add(new Board("제목1", "내용1", "글쓴이1"));
        vector.add(new Board("제목2", "내용2", "글쓴이2"));
        vector.add(new Board("제목3", "내용3", "글쓴이3"));
        vector.add(new Board("제목4", "내용4", "글쓴이4"));
        vector.add(new Board("제목5", "내용5", "글쓴이5"));
        System.out.println("용량 : " + vector.capacity()); // 5
        System.out.println("사이즈 : " + vector.size()); // 5
        System.out.println("-------------------------------");

        // 객체 삭제
        vector.remove(2); // 배열 복사
        vector.remove(3); // 배열 복사
        System.out.println("용량 : " + vector.capacity()); // 5
        System.out.println("사이즈 : " + vector.size()); // 3
        System.out.println("-------------------------------");

        // 용량 확보
        vector.ensureCapacity(20); // 배열 복사
        System.out.println("용량 : " + vector.capacity()); // 20
        System.out.println("사이즈 : " + vector.size()); // 3
        System.out.println("-------------------------------");

        // null 값 포함하여 size 값 변경
        vector.setSize(7); // 배열 복사
        System.out.println("용량 : " + vector.capacity()); // 20
        System.out.println("사이즈 : " + vector.size()); // 7
        System.out.println("-------------------------------");

        // size 로 잡히지 않은 null 값은 삭제
        vector.trimToSize(); // 배열 복사
        System.out.println("용량 : " + vector.capacity()); // 7
        System.out.println("사이즈 : " + vector.size()); // 7
        System.out.println("-------------------------------");

        vector.setSize(3);
        System.out.println("용량 : " + vector.capacity()); // 7
        System.out.println("사이즈 : " + vector.size()); // 3
        System.out.println("-------------------------------");

        // 향상된 for 문을 사용해도 된다.
        for (Board board : vector) {
            System.out.println(board.subject + board.content + board.writer);
        }
        System.out.println("-------------------------------");

        // 반복자로 출력하기
        Iterator<Board> iterator = vector.iterator();
        while (iterator.hasNext()) { // 가져올 데이터가 있느냐?
            Board board = iterator.next(); // 있으면 가져와라.
            System.out.println(board.subject + board.content + board.writer);
        }
    }
}
