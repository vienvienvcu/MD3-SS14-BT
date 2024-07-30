package model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    // Phương thức nhập số nguyên
    public static int nhapSoNguyen(String thongBao) {
        while (true) {
            System.out.print(thongBao);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập số nguyên hợp lệ.");
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
        }
    }

    // Phương thức nhập số thực
    public static double nhapSoThuc(String thongBao) {
        while (true) {
            System.out.print(thongBao);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.err.println("Dữ liệu không hợp lệ. Vui lòng nhập số thực hợp lệ.");
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
        }
    }

    // Phương thức nhập chuỗi
    public static String nhapChuoi(String thongBao) {
        System.out.print(thongBao);
        return scanner.nextLine();
    }

    // Phương thức nhập địa chỉ email và kiểm tra tính hợp lệ
    public static String nhapEmail(String thongBao) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        while (true) {
            System.out.print(thongBao);
            String email = scanner.nextLine();
            if (Pattern.matches(emailPattern, email)) {
                return email;
            } else {
                System.err.println("Dữ liệu không hợp lệ. Vui lòng nhập địa chỉ email hợp lệ.");
            }
        }
    }

    // Phương thức nhập tên và đảm bảo không phải số
    public static String nhapTen(String thongBao) {
        while (true) {
            System.out.print(thongBao);
            String ten = scanner.nextLine();
            if (!ten.matches(".*\\d.*")) { // Kiểm tra xem tên có chứa số không
                return ten;
            } else {
                System.err.println("Dữ liệu không hợp lệ. Tên không được chứa số. Vui lòng nhập lại.");
            }
        }
    }
}
