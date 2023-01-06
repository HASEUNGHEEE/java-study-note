package lecture.udemy.itgo.polymorphism.example07;

import java.util.Vector;

public class BoardEx {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        System.out.println("용량 : " + vector.capacity()); // 10
        System.out.println("저장된 객체 수 : " + vector.size()); // 0

        vector.add(new Board("제목1", "내용1", "작성자1"));
        vector.add(new Board("제목2", "내용1", "작성자1"));
        vector.add(new Board("제목3", "내용1", "작성자1"));
        vector.add(new Board("제목4", "내용1", "작성자1"));
        vector.add(new Board("제목5", "내용1", "작성자1"));
        vector.add(new Board("제목6", "내용1", "작성자1"));
        vector.add(new Board("제목7", "내용1", "작성자1"));
        vector.add(new Board("제목8", "내용1", "작성자1"));
        vector.add(new Board("제목9", "내용1", "작성자1"));
        vector.add(new Board("제목10", "내용1", "작성자1"));
        vector.add(new Board("제목11", "내용1", "작성자1"));

        System.out.println("용량 : " + vector.capacity()); // 20
        System.out.println("저장된 객체 수 : " + vector.size()); // 11

        vector.remove(2); // Vector 는 배열 기반 -> 제목3이 삭제될 것
        System.out.println("용량 : " + vector.capacity()); // 20
        System.out.println("저장된 객체 수 : " + vector.size()); // 10

        System.out.println("---------------------------------");

        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) instanceof Board) {
                Board board = (Board) vector.get(i); // Object -> Board 다운캐스팅
                board.show();
                System.out.println();
            }
        }
    }
}
