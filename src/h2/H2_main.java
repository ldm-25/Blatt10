package h2;

public class H2_main  
{ 

	public static void main (String args [])
	{
		 // Brett mit 5x5 Feldern erzeugen
        Spielbrett brett = new Spielbrett(5);

        // Alle Felder initialisieren: nicht boese, Richtung nach rechts
        for (int r = 0; r < brett.getDim(); r++) {
            for (int c = 0; c < brett.getDim(); c++) {
                brett.getBrett()[r][c] = new Feld(false, 'R');
            }
        }

        // Beispiel: ein Feld boese machen
        brett.getBrett()[2][2].setBoese(true);

        // Beispiel: ein paar Richtungen ändern
        brett.getBrett()[0][0].setDirection('U'); // ganz oben → würde rausgehen
        brett.getBrett()[4][4].setDirection('D'); // ganz unten → würde rausgehen
        brett.getBrett()[1][1].setDirection('L'); // links bewegen

        // Spielstein auf (2,1) setzen
        Spielstein stein = new Spielstein(brett, 2, 1);

        System.out.println("Startposition: (" + stein.getCurrentRow() + "," + stein.getCurrentCol() + ")");
        System.out.println("movesOut? " + stein.movesOut());

        // 5 Züge ausführen
        stein.go(5);

        System.out.println("Endposition: (" + stein.getCurrentRow() + "," + stein.getCurrentCol() + ")");
        System.out.println("movesOut? " + stein.movesOut());
    }

	
	
	
	
}
