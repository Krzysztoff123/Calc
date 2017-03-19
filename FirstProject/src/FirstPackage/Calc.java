package FirstPackage;
import java.util.StringTokenizer;
import java.util.ArrayList;

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
		String znaki;	//znaki wczytywane ze strumienia
		StringTokenizer stringTokenizer1 = new StringTokenizer(dzialanie, "+-/*");
		StringTokenizer stringTokenizer2 = new StringTokenizer(dzialanie, "0123456789");
		ArrayList<Double> lista = new ArrayList<Double>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
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
		  znaki = stringTokenizer2.nextToken();
		  lista2.add(znaki);

	    }
		
		double liczby;
		/* *
		 * zamiana stringa na double
		 */
		for(int i=0;i<k;i++)
		{
			liczby = Integer.parseInt(dane[i]);
			lista.add(liczby);
		}
		wynik = 0;
		
		/* *
		 * Obliczanie kolejnych wyrazen
		 */
		for(int i=0;i<k-1;i++)
		{
			if(lista2.get(i).equals("*") )
			{
				wynik = lista.get(i) * lista.get(i+1);				
				lista.set(i, wynik);
				lista.remove(i+1);
				lista2.remove(i);
				i--;
				k--;
								
			}
			else if(lista2.get(i).equals("/") )
			{
				wynik = lista.get(i) / lista.get(i+1);		
				lista.set(i, wynik);
				lista.remove(i+1);
				lista2.remove(i);
				i--;
				k--;
			}
		}
		
		for(int i=0;i<k-1;i++)
		{
			if(lista2.get(i).equals("+") )
			{
				wynik = lista.get(i) + lista.get(i+1);		
				lista.set(i, wynik);
				lista.remove(i+1);
				lista2.remove(i);
				i--;
				k--;
			}
			else if(lista2.get(i).equals("-") )
			{
				wynik = lista.get(i) - lista.get(i+1);		
				lista.set(i, wynik);
				lista.remove(i+1);
				lista2.remove(i);
				i--;
				k--;
			}		
		}
			
		return wynik;
	  }

}
