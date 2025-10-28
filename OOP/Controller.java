package OOP;

public class Controller {
    public static void main ( String args[]){

        Inventory i = new Inventory();
        i.setWeapon("m1416");
        System.out.println(i.getWeapon());
        String thing = i.getWeapon(); //m1416
        System.out.println(thing);
    }

}
