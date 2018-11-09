public class Agency {
  String agencyName;
  int agencyID; //int MAX_VALUE is 2^31 - 1 which has 10 digits.
  int size;

  float latitude, longitude;
  float[] position = {latitude,longitude};

  Actor[] actors;
}
