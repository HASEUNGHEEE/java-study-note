package lecture.udemy.itgo.polymorphism.example06;

import java.util.Scanner;

public class ProductEx {
    // 클래스(static) 영역에서 공용 데이터로 사용
    static int productID = 0;
    static int numberOfProduct = 0;
    static Product[] products = new Product[10];
    static Scanner sin = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 3) {
            int type = 0;
            System.out.println("상품 조회, 추가 프로그램입니다.");
            System.out.print("상품 추가(1) | 상품 조회(2) | 프로그램 종료(3) >> ");
            choice = sin.nextInt();

            switch (choice) {
                case 1:
                    if (numberOfProduct >= products.length) {
                        System.out.println("더 이상 상품을 추가할 수 없습니다.");
                        break;
                    }

                    System.out.print("책(1) | 음악 CD(2) | 회화책(3) >> ");
                    type = sin.nextInt();
                    if (type < 1 || type > 3) {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                    addProduct(type);
                    break;
                case 2:
                    for (int i = 0; i < numberOfProduct; i++) {
                        products[i].showInfo();
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }


    }

    public static void addProduct(int type) {
        sin.nextLine();
        System.out.print("상품 설명 >> ");
        String desc = sin.nextLine();
        System.out.print("생산자 >> ");
        String maker = sin.nextLine();
        System.out.print("가격 >> ");
        int price = sin.nextInt();
        sin.nextLine(); // int 의 경우 입력스트림 커서에 남아있기 때문에(엔터키) 버퍼를 비워주어야 한다.

        switch (type) {
            case 1:
                System.out.print("일반책 제목 >> ");
                String title = sin.nextLine();
                System.out.print("저자 >> ");
                String author = sin.nextLine();
                System.out.print("국제표준도서번호(ex.0000) >> ");
                int ISBN = sin.nextInt();
                // 필드의 다형성 (조상 객체 배열에 자손의 인스턴스를 붙이고 있다(attach))
                products[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
                break;
            case 2:
                System.out.print("앨범 제목 >> ");
                String albumTitle = sin.nextLine();
                System.out.print("아티스트 >> ");
                String artist = sin.nextLine();
                // 필드의 다형성 (조상 객체 배열에 자손의 인스턴스를 붙이고 있다(attach))
                products[numberOfProduct] = new CompactDisc(productID++, desc, maker, price, albumTitle, artist);
                break;
            case 3:
                System.out.print("국제표준도서번호(ex.0000) >> ");
                int conversationISBN = sin.nextInt();
                System.out.print("회화책 제목 >> ");
                String conversationTitle = sin.nextLine();
                System.out.print("저자 >> ");
                String conversationAuthor = sin.nextLine();
                System.out.print("언어 >> ");
                String language = sin.nextLine();
                // 필드의 다형성 (조상 객체 배열에 자손의 인스턴스를 붙이고 있다(attach))
                products[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, conversationISBN,
                        conversationTitle, conversationAuthor, language);
                break;
        }
        numberOfProduct++;
    }
}
