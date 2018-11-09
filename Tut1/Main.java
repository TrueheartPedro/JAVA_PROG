//import Auto;

public class Main {
  public static void main(String[] args){
    Auto auto = new Auto();
  }
}
/*
Weitere Klassen sollten immer in eigenen Datei definiert werden. Diese kann man am Anfang der Main Datei
mit dem Befehl #import"Colour.java" inkludieren. Dadurch weißt der Compiler, dass die Datei Colour.java
auch kompilliert werden soll.

enum Colour { //enum ersetzt "class", es werden nur begrenzte Daten akzeptiert.
  Red,
  Blue,
  Green,
  Yellow,
}

class Karosserie {
  public Colour colour;
  public int weight;
  public int seats;

  public Karosserie(Colour colour, int weight, int seats){
    this.colour = colour;
    this.weight = weight;
    this.seats = seats;
  }
}

class Motor {
  public int cylinder;
  public int power;
  public float hubraum;
  public int weight;

  public Motor(int cylinder, int power, int hubraum, int weight){
    this.cylinder = cylinder;
    this.power = power;
    this.hubraum = hubraum;
    this.weight = weight;
  }
}
*/
