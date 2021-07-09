public class LendingLibrary {
    private int MAX_BOOK_NUMBER = 10;
    private int MAX_USER_NUMBER = 5;
    private int MAX_LOAN_NUMBER = 10;
    private int MAX_LOAN_PER_USER = 2;

    int lastBookIndex = 0;
    int lastUserIndex = 0;
    int lastLoanIndex = 0;

    private Book[] bookReg = new Book[MAX_BOOK_NUMBER];
    private User[] userReg = new User[MAX_USER_NUMBER];
    private BookLoan[] loanReg = new BookLoan[MAX_LOAN_NUMBER];
    LendingLibrary(){

    }
    public User makeUser(String firstName, String lastName, String address, int age){
        return new User(firstName,lastName,address,age);
    }
    public boolean addUser(User u) {
        if (lastUserIndex < MAX_USER_NUMBER -1) {
            u.setId(u.getUserNextId());
            u.setUserNextId(u.getUserNextId() + 1);
            userReg[lastUserIndex] = u;
            lastUserIndex++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addBook(Book b) {
        if (lastBookIndex < MAX_BOOK_NUMBER - 1){
            bookReg[lastBookIndex] = b;
        lastBookIndex++;
        return true;
    }
        else{
            return false;
        }
    }
    public boolean addLoan(BookLoan l){
        if (lastLoanIndex < MAX_LOAN_NUMBER - 1){
            loanReg[lastLoanIndex] = l;
            lastLoanIndex++;
            return true;
        }
        else{
            return false;
        }
    }
    public User findUser( String firstName, String lastName ){
        for (User user : userReg) {
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) {
                return user;
            }
        }
        return null;

    }
    public Book findBook( String isbnNumber ){
        for (Book book : bookReg) {
            if (book.getIsbnNumber().equals(isbnNumber)) {
                return book;
            }
        }
        return null;

    }
    public BookLoan findLoan( String isbnNumber ){
        for (BookLoan bookLoan : loanReg) {
            if (bookLoan.getBook().getIsbnNumber().equals(isbnNumber)) {
                return bookLoan;
            }
        }
        return null;
    }
    public boolean userCanBorrow( User u ){
        int count = 0;
        for (int i = 0; i < MAX_LOAN_NUMBER ; i++ ){
            if( loanReg[i].getUser() == u ){
                count++;
            }
        }
        return count != 2;
    }
    public boolean isBookLoaned( Book b ){
        for (int i = 0 ; i < MAX_LOAN_NUMBER ; i++){
            if( loanReg[i].getBook() == b ){
                return true;
            }
        }
        return false;
    }

    public int getMAX_BOOK_NUMBER() {
        return MAX_BOOK_NUMBER;
    }

    public Book[] getBookReg() {
        return bookReg;
    }

    public int getLastBookIndex() {
        return lastBookIndex;
    }

    public int getMAX_LOAN_NUMBER() {
        return MAX_LOAN_NUMBER;
    }

    public int getMAX_LOAN_PER_USER() {
        return MAX_LOAN_PER_USER;
    }

    public int getLastLoanIndex() {
        return lastLoanIndex;
    }

    public int getLastUserIndex() {
        return lastUserIndex;
    }

    public int getMAX_USER_NUMBER() {
        return MAX_USER_NUMBER;
    }

    public BookLoan[] getLoanReg() {
        return loanReg;
    }

    public User[] getUserReg() {
        return userReg;
    }

    public void setBookReg(Book[] bookReg) {
        this.bookReg = bookReg;
    }

    public void setLastBookIndex(int lastBookIndex) {
        this.lastBookIndex = lastBookIndex;
    }

    public void setLastLoanIndex(int lastLoanIndex) {
        this.lastLoanIndex = lastLoanIndex;
    }

    public void setLastUserIndex(int lastUserIndex) {
        this.lastUserIndex = lastUserIndex;
    }

    public void setLoanReg(BookLoan[] loanReg) {
        this.loanReg = loanReg;
    }

    public void setMAX_BOOK_NUMBER(int MAX_BOOK_NUMBER) {
        this.MAX_BOOK_NUMBER = MAX_BOOK_NUMBER;
    }

    public void setMAX_USER_NUMBER(int MAX_USER_NUMBER) {
        this.MAX_USER_NUMBER = MAX_USER_NUMBER;
    }

    public void setMAX_LOAN_NUMBER(int MAX_LOAN_NUMBER) {
        this.MAX_LOAN_NUMBER = MAX_LOAN_NUMBER;
    }

    public void setMAX_LOAN_PER_USER(int MAX_LOAN_PER_USER) {
        this.MAX_LOAN_PER_USER = MAX_LOAN_PER_USER;
    }

    public void setUserReg(User[] userReg) {
        this.userReg = userReg;
    }

}
