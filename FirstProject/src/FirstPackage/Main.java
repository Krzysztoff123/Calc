package FirstPackage;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;






public class Main {
	public static void main(String[] args) throws FileNotFoundException
	  {
	    String  dzialanie;
	    Calc c = new Calc();
	    String menu;	    
	    Scanner keyboard = new Scanner(System.in);	    
	    
	    System.out.println("Jesli chcesz wpisywac dzialanie, wcisnij 1, jesli wczytac z pliku, wcisnij 2");
	    menu = keyboard.nextLine();    
	  /* *
	   * Glowna petla
	   */  
	    if(menu.equals("2"))
	    {
	    	FileReader fr = null;
	    	/* 
	    	 * Otwieranie pliku
	    	 */
	    	try 
	    	{
	    	  fr = new FileReader("plik.txt");
	    	} catch (FileNotFoundException e)
	    	{
	    	  System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
	    	  System.exit(1);
	    	}
	    	BufferedReader bfr = new BufferedReader(fr);
	    	/*
	    	 * Wczytywanie z pliku
	    	 */
	    	try 
	    	{
	    	  while((dzialanie = bfr.readLine()) != null)
	    	  {
	    		  System.out.println("Napis : " + dzialanie + " = " +  c.calc(dzialanie) );
	    	  }
	    	} catch (IOException e) 
	    	{
	    	   System.out.println("B£¥D ODCZYTU Z PLIKU!");
	    	   System.exit(2);
	    	}
	    	/*
	    	 * Zamykanie pliku
	    	 */
	    	 try {
	    	     fr.close();
	    	    } catch (IOException e) {
	    	         System.out.println("B£¥D PRZY ZAMYKANIU PLIKU!");
	    	         System.exit(3);
	    	        }
	    }
	    else if(menu.equals("1"))
	    {
		  for (int i = 1;;i++)
		    {
		      
		  	  System.out.println("Podaj dzialanie :");
		  	  dzialanie = keyboard.nextLine();
		  	  if(dzialanie.equals("koniec")) break;
		  	  System.out.println(i+".Dzialanie : " + dzialanie + " = " +  c.calc(dzialanie) );
		    }
	    }
	    System.out.println("Koniec.");
	  }
}
