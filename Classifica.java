package progetto1;

import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;

public class Classifica {

    private SecureRandom n = new SecureRandom();
    private static ArrayList<String> squadre = new ArrayList<>();
    private static ArrayList<Integer> punti = new ArrayList<>();

    public static void aggiungiSquadra(Squadra squadra)
    {
        for (int i = 0; i < squadre.size(); i++)
        {
            if(squadre.contains(squadra.getNome()))
                ;
            else
                squadre.add(squadra.getNome());
        }

        int puntiSquadra = n.nextInt(90);
        for (int i = 0; i < punti.size(); i++)
        {
            if (puntiSquadra > punti.get(i)) {
                punti.get(size()) + 1 = punti.size();

                punti.get(i) = puntiSquadra;
            }
        }

    }

    //private static ArrayList[][] classifica;






}