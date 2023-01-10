package progetto1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;

public class Classifica {

    private static HashMap<String, int> classifica = new HashMap<String, int>();
    private static ArrayList<String> squadre = new ArrayList<>();

    private SecureRandom n = new SecureRandom();


    public static void aggiungiSquadraConPunti(Squadra squadra) {
        for (int i = 0; i < squadre.size(); i++) {
            if (squadre.contains(squadra.getNome()))
                ;
            else {
                squadre.add(squadra.getNome());
                int puntiSquadra = n.nextInt(90);
                classifica.put(squadra.getNome(), n.nextInt(90));

            }
        }
    }

    public static void ordinaClassifica() {
            //.........................
        }




    }










