package lecture.udemy.itgo.array;

public class ArrayEx01 {
    public static void main(String[] args) {
        // score는 참조변수이다.
        int[] score = null;

        // 방도 만들지 않았는데 값을 대입하여 문법 에러 발생
        // score = {100, 29};

        // score는 5개의 방을 heap에 생성하고 있다. (20바이트)
        score = new int[5];

        // 배열명이 곧 주소다.
        System.out.println("score의 주소값 : " + score);

        // 배열에 값을 대입시키고 있는 형태
        for (int i = 0; i < score.length; i++) {
            score[i] = i + 10;
        }

        // 배열의 각각의 방에 있는 값을 출력하는 형태
        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
        }
    }
}
