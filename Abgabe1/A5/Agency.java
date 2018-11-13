public class Agency {
  String agencyName;
  int agencyID; //int MAX_VALUE is 2^31 - 1 which has 10 digits.
  int size;

  float latitude, longitude;
  float[] position = {latitude,longitude};

  /*
  *This declaration is not well thought out, since each Agency
  *will have to know exactly how many Actors it will have at the moment
  *it is instanced. Same applies for all Array declarations where the
  *length isn't specified. Lists would be more suitable.
  */
  Actor[] actors;
}
