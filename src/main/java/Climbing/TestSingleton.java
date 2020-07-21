package Climbing;

public class TestSingleton{
   public static void main(String[]args) {
       for (int i = 1; i< 4; i++)
           System.out.println("Appel N° " + i + " : " + Singleton.getInstance().getName());
    }

}
