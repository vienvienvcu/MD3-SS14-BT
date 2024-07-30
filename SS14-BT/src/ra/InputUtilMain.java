package ra;

import model.InputUtil;

public class InputUtilMain {
    public static void main(String[] args) {
        int tuoi = InputUtil.nhapSoNguyen("Nhập tuổi của bạn: ");
        double luong = InputUtil.nhapSoThuc("Nhập lương của bạn: ");
        String ten = InputUtil.nhapTen("Nhập tên của bạn: ");
        String email = InputUtil.nhapEmail("Nhập địa chỉ email của bạn: ");

        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương: " + luong);
        System.out.println("Email: " + email);
    }
}
