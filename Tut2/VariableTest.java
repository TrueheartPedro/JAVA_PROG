class VariableTest {
  int age = 3;
  boolean adult = (age >= 18);

  public static void main (String [] args){
    VariableTest test = new VariableTest ();
    System.out.println(test.adult);
  }
}
