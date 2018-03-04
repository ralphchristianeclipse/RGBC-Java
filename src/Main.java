import com.rgbc.Account;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showBanner();
        showInputs();
        String key = scanner.nextLine();

        if(key.equals("S")) {
            showATM(scanner);
        }

    }

    static void showBanner() {
        System.out.println("RGBC");
        System.out.println("Richard Gwapo Banking Corporation");
    }

    static void showInputs() {
        System.out.println("S -> Start Transaction");
        System.out.println("Q -> Quit");
    }

    static void showATM(Scanner scanner) {
        showBanner();
        System.out.println("Enter your pin number");
        int pin = scanner.nextInt();
        Account account = Account.getAccount(pin);
        if(account == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.println(account.getName());
        System.out.println(account.getBalance());
        System.out.println(account.getNumber());
    }
}
