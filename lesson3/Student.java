package lesson3;

public class Student {
  int clas;
  String dir ;
  int age ;
  public Student ( String dir , int age , int clas ){
      this.dir= dir;
      this.age= age ;
      this.clas= clas ;

  }
  public String toString (){
   return dir+" "+ age+" "+ clas ;
  }


}
