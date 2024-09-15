
public class UserLoginManager2 {

    private static UserLoginManager2 instance;
    private boolean loggedIn;

    private UserLoginManager2() {
        loggedIn = false;
    }

    public static UserLoginManager2 getInstance() {
        if (instance == null) {
            instance = new UserLoginManager2();
        }
        return instance;
    }

    public void login() {
        if (!loggedIn) {
            loggedIn = true;
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("User already logged in.");
        }
    }

    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}

class BankingProcess2 {
    private UserLoginManager2 loginManager;

    public BankingProcess2() {
        loginManager = UserLoginManager2.getInstance();
    }

    public void viewBalance() {
        if (loginManager.isLoggedIn()) {
            System.out.println("Balance: $1000");
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    public void deposit(double amount) {
        if (loginManager.isLoggedIn()) {

            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Please log in to make a deposit.");
        }
    }

    public void withdraw(double amount) {
        if (loginManager.isLoggedIn()) {
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Please log in to make a withdrawal.");
        }
    }

    public static void main(String[] args) {
        BankingProcess2 bankingProcess = new BankingProcess2();
        UserLoginManager2 loginManager = UserLoginManager2.getInstance();

        bankingProcess.viewBalance();
        bankingProcess.deposit(500);
        bankingProcess.withdraw(200);

        loginManager.login();
        bankingProcess.viewBalance();
        bankingProcess.deposit(500);
        bankingProcess.withdraw(200);

        loginManager.logout();
        bankingProcess.viewBalance();
    }
}
