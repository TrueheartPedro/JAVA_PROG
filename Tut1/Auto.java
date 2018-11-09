//import Motor;
//import Karosserie;

public class Auto {
  public Motor motor;
  public Karosserie karosserie;
  public int Baujahr;

  public Auto(){
    this.motor = new Motor(6, 1000, 3, 3001); //Test, always creates the same engine
    if(this.motor.weight > 3000){
      System.out.println("This Car is too heavy!");
    }
  }
}
