package lecture.udemy.itgo.inheritance.example03;

public class HddEx {
    public static void main(String[] args) {
        HddDisk hddDisk = new HddDisk(500, 7200);
        UsbMemory usbMemory = new UsbMemory(32, 960);

        System.out.println("[HDD 상세]");
        System.out.println(hddDisk.showStatus());
        System.out.println();

        System.out.println("pUSB 상세]");
        System.out.println(usbMemory.showStatus());
        System.out.println(usbMemory.showStatus(999));
    }
}
