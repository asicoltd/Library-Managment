public class Book {
    private String title;
    private String author;
    private String publicationDate;
    private String isbnNumber;

    public Book(String title, String author, String isbn, String pubDate){
        this.title = title;
        this.author = author;
        this.isbnNumber = isbn;
        this.publicationDate = pubDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthor() {
        return author;
    }
    public boolean verifyISBNNumber(String s){
        if ( s.length() == 10 ){
            try{
                Integer.parseInt(s);
                return true;
            }
            catch (NumberFormatException e ){
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + title+"\n"+
                "Author: " + author +"\n"+
                "Publication Year: " + publicationDate+"\n"+
                "ISBN: " + isbnNumber+"\n";
    }
}
