package lecture.udemy.itgo.유용한클래스.Format클래스;

import java.text.DecimalFormat;

public class DecimalFormatEx {
    public static void main(String[] args) {
        double number = 5577669.78;

        // 0은 자릿수를 다 차지하고 표식한다.
        DecimalFormat dFormat = new DecimalFormat("0");
        System.out.println(dFormat.format(number)); // 5577670

        dFormat = new DecimalFormat("0.0");
        System.out.println(dFormat.format(number)); // 5577669.8

        dFormat = new DecimalFormat("0000000000.00000");
        System.out.println(dFormat.format(number)); // 0005577669.78000

        // #은 표현은 다 하되 표식이 안된다.
        dFormat = new DecimalFormat("#");
        System.out.println(dFormat.format(number)); // 5577670

        dFormat = new DecimalFormat("#.#");
        System.out.println(dFormat.format(number)); // 5577669.8

        dFormat = new DecimalFormat("##########.#####");
        System.out.println(dFormat.format(number)); // 5577669.78

        dFormat = new DecimalFormat("#,###.00");
        System.out.println(dFormat.format(number)); // 5,577,669.78
    }
}
