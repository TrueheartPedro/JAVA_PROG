public class Human {
  //string must be written with capital S since it is not a primitive
  //variable but rather a class in itself
  String name;
  int age;
  //Commentary "height in centimeter" needed two forward slashes instead of one
  int height; // height in centimeter
  //Input name must be of type String, not string. height needs to be of the same type as Human.height
  public Human(String name, int age, int height){
    this.name = name;
    this.age = age;
    this.height = height;
  }
  //Last curly bracket needed to close the class declaration
}
