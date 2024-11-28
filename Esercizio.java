//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        int n;
        double tempoGaraH, tempoGaraV;
        String vincitore;
        double tMinV, tMinH;

        System.out.println("Inserisci il numero dei giri");
        n=in.nextInt();
        double [] hamilton=new double[n];
        double [] verstappen=new double[n];

        for (i = 0; i <= n - 1; i++); {
            System.out.println("Inserisci il tenpo del " +i+1+ "° giro di Hamilton ");
            hamilton=in.nextint();
            System.out.println("Inserisci il tenpo del " +i+1+ "° giro di Verstappen ");
            verstappen=in.nextint();

            tempoGaraH = 0;
            tempoGaraV = 0;

            for (i = 0; i <= n - 1; i++); {
                tempoGaraH= tempoGaraH+hamilton[i];
                tempoGaraV= tempoGaraV+verstappen[i];
            }

            if (tempoGaraH < tempoGaraV) {
              vincitore = "Hamilton";
            } else {
              vincitore = "Verstappen";
        }
        System.out.println("Tempo gara Hamilton: " +tempoGaraH+ "Tempo gara Verstappen: " +tempoGaraV);
        System.out.println("Vincitore della gara: " +vincitore);

        tMinV = verstappen[0];
        tMinH = hamilton[0];
        for (i = 0; i <= n - 1; i++) {
          if (hamilton[i] < tMinH) {
            tMinH = hamilton[i];
          }
          if (verstappen[i] < tMinV) {
            tMinV = verstappen[i];
          }
        }
        if (tMinH < tMinV) {
          vincitore = "Hamilton";
        }else{
          vincitore = "Verstappen";
        }

        System.out.println("Giro veloce Hamilton: " +tMinH+ ", giro veloce Verstappen: " +tMinV);
        System.out.println("Il giro veloce più veloce è di " +vincitore);

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md