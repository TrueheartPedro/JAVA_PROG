public class Prime{
//Methods
  public static boolean isPrime(int a){
    for (int i = 2; i<a/2; i++){
      if(a%i == 0){
        return false;
      }
    }return true;
  }
  public static void arePrime(int a){
    for (int i = 2; i <= a; i++){
      if(isPrime(i)){
        System.out.println(i + " is prime" + "\n");
      }else{
        System.out.println(i + " is not prime" + "\n");
      }
    }
  }
}
