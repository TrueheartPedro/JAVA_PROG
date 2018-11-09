public class Main {
  public static void main(String[] args){
    //One "=" instead of "=="; Constructor "human" needs to "Human";
    //John needs to be in quotation to be handled as a String
  Human newHuman = new Human("John", 20, 180);
    //Contatenation of string " is " with newHuman.age needs to be done with an "addition";
    //String "years old" needs a space at the beginning of the String
  System.out.println(newHuman.name + " is " + newHuman.age + " years old.");
  }
}
