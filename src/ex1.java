import java.io.File;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc đường dẫn từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập đường dẫn
        System.out.print("Nhập đường dẫn của file: ");
        String filePath = scanner.nextLine();

        // Tạo đối tượng File từ đường dẫn
        File file = new File(filePath);

        // Kiểm tra xem file tồn tại không
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return;
        }

        // Lấy độ lớn của file (tính bằng byte)
        long fileSizeInBytes = file.length();

        // Chuyển đổi kích thước từ byte sang kilobyte, megabyte hoặc gigabyte
        double fileSizeInKB = fileSizeInBytes / 1024.0;
        double fileSizeInMB = fileSizeInKB / 1024.0;
        double fileSizeInGB = fileSizeInMB / 1024.0;

        // Xuất ra màn hình kích thước của file
        System.out.println("Độ lớn của file:");
        System.out.println("Byte: " + fileSizeInBytes);
        System.out.printf("Kilobyte: %.2f KB\n", fileSizeInKB);
        System.out.printf("Megabyte: %.2f MB\n", fileSizeInMB);
        System.out.printf("Gigabyte: %.2f GB\n", fileSizeInGB);

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}