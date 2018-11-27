public class Car{
//Attributes
  int year, idNumber;
  String name, creator;
//Constructors
  private Car(int year, int idNumber, String name, String creator){
    this.year = year;
    this.idNumber = idNumber;
    this.name = name;
    this.creator = creator;
  }
  private Car(int year, int idNumber, String name){
    this.year = year;
    this.idNumber = idNumber;
    this.name = name;
  }
}
