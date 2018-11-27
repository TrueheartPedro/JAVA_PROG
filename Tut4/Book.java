public class Book{
//Attributes
  String name, author;
//Methods
  public boolean isFromAuthor(String author){
    if(this.author.equals(author)){
      return true;
    } return false;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}
