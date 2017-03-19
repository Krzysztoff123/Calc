package FirstPackage;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	  {
	    String  dzialanie;
	    Calc c = new Calc();
	  /* *
	   * Glowna petla
	   */
	  for (int i = 0;;i++)
	    {
	      Scanner keyboard = new Scanner(System.in);
	  	  System.out.println("Podaj dzialanie :");
	  	  dzialanie = keyboard.nextLine();
	  	  if(dzialanie.equals("koniec")) break;
	  	  System.out.println("Napis : " + dzialanie + " = " +  c.calc(dzialanie) );
	    }
	    System.out.println("Koniec.");
	  }
}
