import com.rgbc.Account;

import java.util.Scanner;

public class Main {

    public static int tries = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startATM(scanner);
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
        try {
            int pin = Integer.parseInt(scanner.nextLine());
            Account account = Account.getAccount(pin);
            if (tries > 3) {
                System.out.println("CAPTURED CARD…. PLEASE CALL 143-44");
                System.exit(0);
                return;
            }
            if (account == null) {
                tries++;
                System.out.println("Account not found");
                System.out.println(tries);
                showATM(scanner);
                return;
            }

            System.out.println(account.getName());
            System.out.println(account.getBalance());
            System.out.println(account.getNumber());

        } catch (Exception exception) {

        }
        startATM(scanner);
    }

    static void startATM(Scanner scanner) {
        String key = scanner.nextLine();
        while(!key.equals("Q")) {
            if (key.equals("S")) {
                showATM(scanner);
            }
            key = scanner.nextLine();
        }
        System.exit(0);
    }
}
