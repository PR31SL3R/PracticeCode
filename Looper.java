public class Looper{






public static void main (String[] args){


int z=0;
int x=0;
int y=0;
int w=0;



for (int j = 1; j <= 10; j++){
   y++;
   System.out.println("outer loop " + y);
   for (int k = 1; k <= 10; k++){
   x++;
   System.out.println("middel loop " + x);
      for (int i = 1; i <= 10; i++){
      z++;
      System.out.println("inner loop " + z);
      for (int r = 1; r <= 10; r++){
      w++;
      System.out.println("inner inner loop " + w);
      }
   }
}
}

}


}