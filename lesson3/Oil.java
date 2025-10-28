package lesson3;

public class Oil {
    private int  cash ;

    Oil()
    {
        System.out.println("empty oil object");
    }

    Oil(String place)
    {
        System.out.println("object from "+place);
    }
    Oil (String country, String city)
    {
        System.out.printf("objects country: %s\ncity: %s\n", country, city);
    }

    public  void setCash (int cash ){
        this.cash = cash ;
    }

    double  getAilyk(){
        return cash*0.68 ;
    }



}

