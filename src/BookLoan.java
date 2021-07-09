public class BookLoan {
    private User user;
    private Book book;
    private String dueDate;

    BookLoan(User user, Book book, String dueDate ){
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "User name:"+user +"\n" +
                "Title: "+book.getTitle() +"\n" +
                "Author: "+book.getAuthor()+"\n" +
                "ISBN:"+book.getIsbnNumber()+"\n" +
                "Due date:"+dueDate+"\n";
    }

    public Book getBook() {
        return book;
    }

    public String getDueDate() {
        return dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
