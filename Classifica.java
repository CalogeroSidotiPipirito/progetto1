package progetto1;

import java.security.SecureRandom;
import java.util.HashMap;

public class Classifica {

    private static HashMap<String, Integer> classifica = new HashMap<String, Integer>();
    private static SecureRandom n = new SecureRandom();


    public static void aggiungiSquadraConPunti(Squadra squadra) {
        if (classifica.containsKey(squadra.getNome()))
            ;
        else {
            classifica.put(squadra.getNome(), n.nextInt(90));

        }
    }

    public static void ordinaClassifica() {
            //.........................
        }




    }










