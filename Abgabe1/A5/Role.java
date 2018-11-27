public class Role {
  String name;
  /*roleID has 4 digits, short MAX_VALUE is 2^15 - 1 and has 5 digits.
  Short is therefore suitable.*/
  short roleID;
  Phrase phrase;
}
