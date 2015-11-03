package com.HS10;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bestelling {

    private Map<String, Integer> bestellingLijst;
    private Map<String, Double> artikelenLijst;

    /**
     * De lijst opgemaakt in de main wordt meegegeven. En een Hashmap wordt geïnitialiseerd.
     *
     * @param artikelenLijst
     */
    public Bestelling(Map artikelenLijst) {
        this.artikelenLijst = artikelenLijst;

        this.bestellingLijst = new HashMap<>();
    }

    /**
     * Het toevoegen van een artikel aan de bestellinglijst. Eigenlijk zou hier een check moeten komen die
     * controlleert of de naam wel voor komt in artikelenLijst.
     *
     * @param artikelNaam
     * @param aantal
     */
    public void voegToe(String artikelNaam, Integer aantal){
        this.bestellingLijst.put(artikelNaam, aantal);
    }

    /**
     * Iteratie door bestellinglijst waar de prijs van het losse artikel wordt opgehaald op basis van de 'key'
     * dat in de bestellinglijst staat (wat dus dezelfde naam is). Vervolgens wordt het vermenigvuldigd met het
     * aantal (value).
     * !!harde koppeling: Als de naam (key van je lijst 'artikelen' in main) niet overeen komt met de artikelNaam (key
     * van de lijst 'bestelling' in main) dan error boem pats paniek!! Er zou een check moeten komen in de methode
     * 'voegToe()' idealiter.
     *
     * @return double totaal
     */
    public double totaalBedrag() {
        Iterator it = this.bestellingLijst.entrySet().iterator();

        Double totaal = 0.0;
        while (it.hasNext()) {
            Map.Entry artikel = (Map.Entry)it.next();

            Double prijsPerArtikel = this.artikelenLijst.get(artikel.getKey());
            totaal+= prijsPerArtikel * (Integer)artikel.getValue();

        }

       return totaal;
    }
}
