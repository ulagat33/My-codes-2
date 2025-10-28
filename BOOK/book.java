package BOOK;

public class book {
    private  String title ;
    private  String author;
    private  int year;
    private String ISBN;

    book()
    {


    }
    book (String title, String author,int year,String ISBN){

        this.title = title ;
        this.ISBN=ISBN ;
        this.year= year ;
        this.author = author ;

    }

    public String getAuthor() {

        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getTitle() {
        return this.title;
    }
}

