package lesson3;

import java.util.Scanner;

public class Person {

    public static void main(String[] args){
        Oil oil = new Oil() ;
        Oil oil2 = new Oil("QATAR", "Er Riad") ;
        oil.setCash(1000);
        oil.getAilyk();
        System.out.printf("%.0f $",oil.getAilyk());

        Scanner sc = new Scanner(System.in);



    }
}
