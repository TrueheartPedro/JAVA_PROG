public class Actor {

  String firstName, lastName;
  String fullName = firstName + " " + lastName;
  /*actorID has 9 digits, int MAX_VALUE is 2^15 - 1 and has 10 digits.
  Int is therefore suitable.*/
  int actorID;
  /*Birthday is a class itself. Day, Month and Year are all ints.
  There is no mechanism to control if the date is valid.
  There is also a birthdayString that contains dd.mm.yyyy.*/
  Birthday birthday;
  /*Actor has roles, but always a main role and side roles.
  One attribute for the main role and one array for all side roles. */
  Role mainRole;
  Role[] sideRoles;

}
