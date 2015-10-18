@@ -0,0 +1,29 @@
// Hoofdstuk 10 opdracht 2
 
import java.util.*;

class BestellingApp
{ 
 public static void main (String args[])
  
 {
    double totaal = 0;
    Map<String, Double> artikelen = new HashMap<String, Double>();
 
	artikelen.put("Stuiterbal", 1.5d); 
    artikelen.put("Bromtol", 3.0d);
    artikelen.put("Pop", 2.0d);
	artikelen.put("Puzzel", 2.5d);
  
	totaal+=prijs(artikelen.get(args[0]), Double.parseDouble(args[1]));
       
    System.out.println(totaal);
  }

  static double prijs(Object o, Double aantal)
  {
   	return (Double) o * aantal;

  }

 }
