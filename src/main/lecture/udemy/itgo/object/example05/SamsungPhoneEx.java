package lecture.udemy.itgo.object.example05;

public class SamsungPhoneEx {
    public static void main(String[] args) {
        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.setCompany("삼성");
        samsungPhone.setModel("갤럭시S22");
        samsungPhone.setRelease(2022);
        samsungPhone.setColor("검정");

        System.out.println(samsungPhone);
    }
}
