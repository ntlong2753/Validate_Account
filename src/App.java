import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AccountManage isValid = new AccountManage();
        while(true) {
            System.out.print("nhập tên tài khoản: ");
            String acc = scanner.nextLine();
            if (!isValid.checkName(acc)) {
                System.out.println("sai r");
                continue;
            }
            break;
        }
        System.out.println("ok");
    }
}
