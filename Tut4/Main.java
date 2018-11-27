public class Main {
  public static void main(String[] args){
/*    int n = 19;
    System.out.println(n);
    while(n>1){
      if(n%2==0){
        n = n/2;
        System.out.println(n);
      }else{
        n = 3*n+1;
        System.out.println(n);
      }
    }
  */

  /*
    int[][] n = new int[10][10];
    for(int xIndex = 0;xIndex<10;xIndex++){
      for(int yIndex = 0;yIndex<10;yIndex++){
        n[xIndex][yIndex] = (xIndex+1)*(yIndex+1);
      }
    };
    for(int xIndex = 0;xIndex<10;xIndex++){
      for(int yIndex = 0;yIndex<10;yIndex++){
      System.out.print(n[xIndex][yIndex] + "\t");
      }
      System.out.print("\n");
    }
    */
    int n = 19;
    Prime.arePrime(n);


  }
}
