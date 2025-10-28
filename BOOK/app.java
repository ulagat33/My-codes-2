package BOOK;

import java.sql.SQLOutput;

public class app {
    public static void main(String[] args) {
        book book1 = new book("Гарри Поттер и философский камень ","Джоан Роулинг ", 1997 ,"978-1-4088-4565-2");
        System.out.println("name:" + book1.getTitle());
        System.out.println("author: "+ book1.getAuthor());
        System.out.println("year: "+ book1.getYear());
        System.out.println("ISBN "+ book1.getISBN());
        
    }
}
