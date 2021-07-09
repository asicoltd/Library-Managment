import java.util.Scanner;

public class AppDriver {
    private int APP_EXIT = 0;
    private int APP_ADD_BOOK = 1;
    private int APP_MOD_BOOK = 2;
    private int APP_FIND_BOOK = 3;
    private int APP_LIST_BOOKS = 4;
    private int APP_ADD_USER = 5;
    private int APP_MOD_USER = 6;
    private int APP_FIND_USER = 7;
    private int APP_LIST_USERS = 8;
    private int APP_ADD_LOAN = 9;
    private int APP_MOD_LOAN = 10;
    private int APP_FIND_LOAN = 11;
    private int APP_LIST_LOANS = 12;
    private final Scanner input = new Scanner(System.in);
    public LendingLibraryController appControl = new LendingLibraryController();

    public void startApp() {
        executeMenuItem();
    }
    private int displayAppMenu(){
            System.out.println("Enter a selection from the following menu:" +"\n"+
                    "1.Enter a new book" +"\n"+
                    "2.Modify the book details. Enter the book isbn number" +"\n"+
                    "3.Find a book by isbn number" +"\n"+
                    "4.Display list of all books" +"\n"+
                    "\n" +
                    "5.Add a new user" +"\n"+
                    "6.Modify user details" +"\n"+
                    "7.Find a user by name" +"\n"+
                    "8.Display all users" +"\n"+
                    "\n" +
                    "9.Add a loan. Link a user name to a book by isbn number" +"\n"+
                    "10.Modify a loan. Loan is identified by isbn number" +"\n"+
                    "11.Find a loan. Loan is identified by isbn number" +"\n"+
                    "12.Display all loans" +"\n"+
                    "\n" +
                    "0.Exit program");

        return input.nextInt();
    }
    private void executeMenuItem(){
        while(true) {
            int option = displayAppMenu();
            if (option == APP_EXIT) {
                System.out.println("Good Bye!");
                break;
            } else if (option == APP_ADD_BOOK) {
                appControl.addBook();
            } else if (option == APP_MOD_BOOK) {
                appControl.changeBook();
            } else if (option == APP_FIND_BOOK) {
                appControl.findBook();
            } else if (option == APP_LIST_BOOKS) {
                appControl.listBooks();
            } else if (option == APP_ADD_USER) {
                appControl.addUser();
            } else if (option == APP_MOD_USER) {
                appControl.changeUser();
            } else if (option == APP_FIND_USER) {
                appControl.findUser();
            } else if (option == APP_LIST_USERS) {
                appControl.listUsers();
            } else if (option == APP_ADD_LOAN) {
                appControl.addBookLoan();
            } else if (option == APP_MOD_LOAN) {
                appControl.changeBookLoan();
            } else if (option == APP_FIND_LOAN) {
                appControl.findBookLoan();
            } else if (option == APP_LIST_LOANS) {
                appControl.listBookLoans();
            }
        }
    }
}
