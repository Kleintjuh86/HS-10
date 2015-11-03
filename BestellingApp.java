package com.HS10; //je had je package HS-10 genoemd, je kan dat beter zonder speciale tekens of cijfers doen. Meeste
// IDE's vinden dat niet leuk. En is niet bepaald 'best practice'. Het kan zijn dat je deze weer even terug moet
// veranderen, ik heb namelijk geen zicht hoe je packages zijn ingedeeld. Normaal wordt heel de src map op git gegooid
// namelijk.

import java.util.*;


//je maakt een file aan genaamd 'Bestelling' en je class daarin gedefineerd is 'BestellingApp' dat is niet handig he,
// fixed it. Normaliter is je class naam hetzelfde als je file naam.

class BestellingApp {

    /**
     * De implementatie is verplaatst naar de class 'Bestelling'. Implementatie hoort eigenlijk niet in de main. Dit
     * is al een klein stukje op weg naar object orientatie, maar nog niet helemaal. Moet niet meteen te verwarrend/
     * ingewikkeld worden ;-)
     *
     * @param args
     */
    public static void main(String args[])
    {
        Map<String, Double> artikelen = new HashMap<>();
        artikelen.put("Stuiterbal", 1.5d);
        artikelen.put("Bromtol", 3.0d);
        artikelen.put("Pop", 2.0d);
        artikelen.put("Puzzel", 2.5d);

        Bestelling bestelling = new Bestelling(artikelen);
        bestelling.voegToe("Pop", 3);
        bestelling.voegToe("Puzzel", 2);
        bestelling.voegToe("Stuiterbal", 4);

        System.out.println("Totaal bedrag: "+ bestelling.totaalBedrag());

    }

}
