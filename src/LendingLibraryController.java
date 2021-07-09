import java.util.Scanner;

public class LendingLibraryController {
    private final LendingLibrary bookLib = new LendingLibrary();
    private final Scanner input = new Scanner(System.in);

    LendingLibraryController(){

    }
    public void addUser(){
        String lastName, firstName, Address, age;
        System.out.println("New User Entry " + "\n");
        lastName = getResponseTo("Last name");
        firstName = getResponseTo("First name");
            age = getResponseTo("Age");
        Address = getResponseTo("User address");
        if (isValidNumber(age)) {
            if(bookLib.addUser(bookLib.makeUser(lastName,firstName,Address,Integer.parseInt(age)))){
                System.out.println("User was added");
            }
            else{
                System.out.println("User capacity full");
            }
        }
        else {
           if(bookLib.addUser(new User(firstName ,lastName, Address))){
               System.out.println("User was added");
           }
           else{
               System.out.println("User capacity full");
           }
        }
    }
    public void changeUser(){
        String last = getResponseTo("Last name");
        String first = getResponseTo("First name");

        if( bookLib.findUser(last,first) != null ) {
            bookLib.findUser(last, first).setAddress(getResponseTo("Enter address"));
        }
        else{
            System.out.println("No user found in this name");
        }

    }
    public void findUser(){
        String last = getResponseTo("Last name");
        String first = getResponseTo("First name");
        User user = bookLib.findUser(last,first);
        if( user != null) {
            System.out.println(user);
        }
        else{
            System.out.println("No user found in this name");
        }
    }
    public void listUsers(){
        User []users = bookLib.getUserReg();
        for (User user : users) {
            if( user == null)break;
            System.out.println(user);
        }

    }
    public void addBook(){
        System.out.println("New Book Entry");
        String title = getResponseTo("Title:");
        String author = getResponseTo("Author:");
        String date = getResponseTo("Publication date (year in NNNN format)");
        if( date.length() == 4 ){
            try{
                Integer.parseInt(date);
                String isbn = getResponseTo("ISBN number (10 digits):");
                Book book = new Book(title,author,isbn,date);
                if(book.verifyISBNNumber(isbn)){
                    if(bookLib.addBook(book)){
                        System.out.println("Book added successfully");
                    }
                    else{
                        System.out.println("Book capacity is full");
                    }
                }
                else {
                    System.out.println("Invalid ISBN number\nBook not added");
                }
            }
            catch (NumberFormatException e ){
                System.out.println("Invalid date\nBook is not added");
            }
        }
        else{
            System.out.println("Invalid year");
        }

    }
    public void changeBook(){
        String isbn = getResponseTo("ISBN number:");
        if( bookLib.findBook(isbn) != null ) {
            bookLib.findBook(isbn).setAuthor(getResponseTo("Author:"));
            bookLib.findBook(isbn).setTitle(getResponseTo(("Title:")));
            String date = getResponseTo("Publication date (year in NNNN format)");
            if( date.length() == 4 ){
                try{
                    Integer.parseInt(date);
                    bookLib.findBook(isbn).setPublicationDate(date);
                }
                catch( NumberFormatException e){
                    System.out.println("Invalid date\nData didn't change");
                }
            }
        }
        else{
            System.out.println("No book found with this isbn number");
        }
    }
    public void findBook(){
        String isbn = getResponseTo("ISBN number:");
        if( bookLib.findBook(isbn) != null ) {
            System.out.println(bookLib.findBook(isbn));
        }
        else{
            System.out.println("No book found with this isbn number");
        }

    }
    public void listBooks(){
        Book []books = bookLib.getBookReg();
        for (Book book : books) {
            if( book == null )break;
            System.out.println("************ " + book);
        }
    }
    public void addBookLoan() {
        String lastName = getResponseTo("User last name:");
        String firstName = getResponseTo("User first name:");
        if (bookLib.findUser(firstName, lastName) != null) {
            if (bookLib.userCanBorrow(bookLib.findUser(firstName, lastName))){

                String isbn = getResponseTo("Book isbn number");
            if (bookLib.findBook(isbn) != null) {
                if (!bookLib.isBookLoaned(bookLib.findBook(isbn))) {
                    String date = getResponseTo("Loan date (format yyyy-mm-dd)");
                    if(bookLib.addLoan(new BookLoan(bookLib.findUser(firstName, lastName), bookLib.findBook(isbn), date))){
                        System.out.println("Loan added.\n" + bookLib.findLoan(isbn));
                    }
                    else{
                        System.out.println("Book loan reached its capacity");
                    }
                } else {
                    System.out.println("Book is already loaned");
                }
            }
            else{
                    System.out.println("Invalid isbn number");
                }
            }
            else{
                System.out.println("Already loaned 2 books");
            }
        }
        else {
            System.out.println("User name not found");
        }
    }
    public void changeBookLoan(){
        System.out.println("Modify loan details.");
        String isbn = getResponseTo("ISBN number for the loan you want to modify:");
        if( bookLib.findLoan(isbn) != null ){
            System.out.println(bookLib.findLoan(isbn));
            String date = getResponseTo("Change due date (Hit Enter key for no change):");
                    if(!date.equals("\n")){
                        bookLib.findLoan(isbn).setDueDate(date);
                    }
        }
    }
    public void findBookLoan(){
        String isbn = getResponseTo("Enter isbn number:");
        if( bookLib.findBook(isbn) != null) {
            if (bookLib.findLoan(isbn) != null) {
                System.out.println(bookLib.findLoan(isbn));
            }
            else{
                System.out.println("Book is available for loan");
            }
        }
        else {
            System.out.println("Invalid book isbn number");
        }
    }
    public void listBookLoans(){
        BookLoan []bookLoans = bookLib.getLoanReg();
        for (BookLoan bookLoan : bookLoans) {
            if (bookLoan == null)break;
            System.out.println(bookLoan);
        }
    }
    private String getResponseTo( String input ){
        System.out.print(input); return(this.input.nextLine());
    }

    private boolean isValidNumber( String input ){
        return(!input.equals("\n"));

    }
}
