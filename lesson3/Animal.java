
package lesson3;

public class Animal {
        public void animalSound () {
            System.out.println("animals make sound");
        }



}
    class Dog extends Animal {
    public void animalSound (){
        System.out.println("dogs barking ");
    }
}
    class Cat extends Animal {
    public void animalSound (){
        System.out.println("cats says Meow ");
    }
}
    class Test {
        public static void main(String[] args) {
            Animal animal = new Animal() ;
            Animal mydog = new Dog() ;
            Animal mycat = new Cat() ;
            mydog.animalSound();
            mycat.animalSound();
            animal.animalSound();
        }
    }