package com.HS10;
//@@ -0,0 +1,69 @@
//Hoofdstuk 10 opdracht 3 SUBMAP VORM

import java.util.SortedSet;
import java.util.TreeSet;

public class VormenApp
{
abstract class Vorm implements Comparable <Vormen> {
	abstract public float getOppervlakte();
}

class Vierkant implements Comparable <Vierkant> {
  float zijde;
  Vierkant(float zijde)		// constructor
  {
    this.zijde = zijde;
  }

  public String toString()		// string representatie van een object
  {
    return "("+zijde+")";
  }

  // public float getOppervlakte() DOET NIET WAT IK WIL
		// {
		// float zijde = (float)Math.pow(zijde,2);
		// return zijde;
		// }

  public int compareTo(Vierkant v)
  {

    if(Math.pow(zijde,2) > Math.pow(v.zijde,2))		// eigen oppervlakte is groter
      return 1;
    if(Math.pow(zijde,2) < Math.pow(v.zijde,2))		// eigen oppervlakte is kleiner
      return -1;

    return 0;		// oppervlakten even groot
  }
}


class Cirkel implements Comparable <Cirkel> {
  float straal;
  Cirkel(float straal)		// constructor
  {
    this.straal = straal;
  }

  public String toString()		// string representatie van een object
  {
    return "("+straal+")";
  }

  // public float getOppervlakte()
		// {
		// float straal =  (float)Math.PI*Math.pow(straal,2));
		// return straal;
		// }

  public int compareTo(Cirkel c) {
    if(Math.PI*Math.pow(straal,2) > Math.PI*Math.pow(c.straal,2))		// eigen oppervlakte is groter
      return 1;
    if(Math.PI*Math.pow(straal,2) < Math.PI*Math.pow(c.straal,2))		// eigen oppervlakte is kleiner
      return -1;
    return 0;		// oppervlakten even groot
  }
}
}
