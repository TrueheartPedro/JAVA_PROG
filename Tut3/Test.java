public class Test {

public static boolean isPrime(int a){
  for (int i = 2; i<a/2; i++){
    if(a%i == 0){
      return false;
    }
  }return true;
}

public static boolean fibonacci(int iterationen){
  int[] fibZahl = new int[iterationen];
  int index = 2;
  fibZahl[0] = 1; fibZahl[1] = 1;
  while (iterationen - index > 0){
    fibZahl[index] = fibZahl[index-2] + fibZahl[index-1];
    System.out.println(fibZahl[index]);
    index++;
  }
  return true;
}

public static void main(String[] args){
  int a = 1;
  System.out.println(fibonacci(a));
}

}
