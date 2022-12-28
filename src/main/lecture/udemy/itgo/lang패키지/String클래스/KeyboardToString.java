package lecture.udemy.itgo.lang패키지.String클래스;

import java.io.IOException;

public class KeyboardToString {
    public static void main(String[] args) {
        byte[] bytes = new byte[100];

        System.out.print("입력 : ");
        int readBytesNum = 0;
        try {
            /*
            키보드(표준입력)로부터 입력을 받고 그 내용을 bytes에 저장함
            입력받은 바이트 수를 리턴함
            */
            readBytesNum = System.in.read(bytes);

            /*
             - 문자셋 UTF-8로 디코딩
             - 인코딩과 디코딩의 과정에서 문자셋이 반드시 같아야 글자가 깨지는 오류를 방지할 수 있다.
             - EUC-KR: 한글 2바이트, UFT-8: 한글 3바이트
             */
            String str = new String(bytes, 0, readBytesNum-1, "UTF-8");
            System.out.println(str);
            System.out.println("입력받은 바이트 수 : " + readBytesNum);

            byte[] b = str.getBytes("UTF-8");
            System.out.println(b.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
