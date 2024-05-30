package bancsapp;

public class Aplicacio {

    public static void main(String[] args) {

        System.out.print("Introdueix el nom del compte bancari 1: ");
        String nom = cLlegir.dato();
        System.out.print("Introdueix el nombre secret del compte bancari 1: ");
        int numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte = new CompteBancari(nom, numero);

        System.out.print("Introdueix el nom del compte bancari 2: ");
        nom = cLlegir.dato();
        System.out.print("Introdueix el nombre secret del compte bancari 2: ");
        numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte2 = new CompteBancari(nom, numero);
        
        System.out.println("Introdueix la quantitat que vols ingressar "
                + "del banc 1 y 2");
        float quantitat = cLlegir.datoFloat();
        boolean resultat = compte.extreure(quantitat);
        boolean resultat2 = compte.extreure(quantitat);
        
        if (resultat == false || resultat2 == false) {
            System.out.println("No se ha pogut realitzar el ingres");
        } else {
            System.out.println("Saldo bc1 : " + compte.consultarSaldo());
            System.out.println("Saldo bc2 : " + compte2.consultarSaldo());
        }
        
        System.out.println(".................................................");
    }
}
