import java.io.File;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn của thư mục hoặc tập tin bạn muốn xoá: ");
        String path = scanner.nextLine();
        File fileOrDir = new File(path);
        if (!fileOrDir.exists()) {
            System.out.println("Đường dẫn không tồn tại.");
            return;
        }
        if (fileOrDir.isDirectory()) {
            deleteDirectory(fileOrDir);
            System.out.println("Thư mục đã được xoá thành công.");
        } else {
            if (fileOrDir.delete()) {
                System.out.println("Tập tin đã được xoá thành công.");
            } else {
                System.out.println("Không thể xoá tập tin.");
            }
        }
    }

    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }
}
