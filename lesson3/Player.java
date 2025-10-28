package lesson3;

public class Player {
    Player(String country , int age, String position ){
        System.out.println("player found");
        this.age= age;
        this.position=position;
        this.country=country;
    }
    Player(){
        System.out.println("average player found");
    }


   private String position,country;
    private int age ;
    public void setPosition(String position) {
        this.position=position ;


    }

    public String getPosition() {
        return position ;
    }
    public String getCountry(){
        return country ;
    }
    public  int  getAge (){
        return age ;
    }
    public String toString (){
        return age+" "+country +" "+ position ;
    }

}

