package FirstPackage;
import java.util.StringTokenizer;

/*/
 * Klasa Kalkulator
 */
public class Calc {

	/* 
	 * Metoda obliczajaca wyrazenie podane w strumieniu (w kolejnosci wpisywania)
	 */
	public double calc(String dzialanie)
	  {
		double wynik;
		String dane[] = new String [dzialanie.length()];	//ciagi liczb wczytywane ze strumienia
		String znaki[] = new String [dzialanie.length()];	//znaki wczytywane ze strumienia
		StringTokenizer stringTokenizer1 = new StringTokenizer(dzialanie, "+-/*");
		StringTokenizer stringTokenizer2 = new StringTokenizer(dzialanie, "0123456789");
		int k=0;
		/* *
		 * Zapisywanie danych do poszczegolnych tablic
		 */
		for(int i=0; stringTokenizer1.hasMoreTokens();i++)
	    {
		  dane[i] = stringTokenizer1.nextToken();
		
		  k++;
	    }
		for(int i=0; stringTokenizer2.hasMoreTokens();i++)
	    {
		  znaki[i] = stringTokenizer2.nextToken();
		  
	    }
		
		double liczby[] = new double[k];
		/* *
		 * zamiana stringa na double
		 */
		for(int i=0;i<k;i++)
		{
			liczby[i] = Integer.parseInt(dane[i]);			
		}
		wynik = liczby[0];
		
		/* *
		 * Obliczanie kolejnych wyrazen
		 */
		for(int i=0;i<k-1;i++)
		{
			if(znaki[i].equals("*") )
			{
				wynik=liczby[i]*liczby[i+1];				
				liczby[i]=liczby[i+1]=wynik;
								
			}
			else if(znaki[i].equals("/") )
			{
				wynik=liczby[i]/liczby[i+1];
				liczby[i]=liczby[i+1]=wynik;
				
			}
			else if(znaki[i].equals("+") )
			{
				wynik=liczby[i]+liczby[i+1];
				liczby[i]=liczby[i+1]=wynik;
				
			}
			else if(znaki[i].equals("-") )
			{
				wynik=liczby[i]-liczby[i+1];
				liczby[i]=liczby[i+1]=wynik;
				
			}		
		}	
		return liczby[k-1];
	  }

}
