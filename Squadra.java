package progetto1;

import java.util.ArrayList;

public class Squadra {

    private final String nome;
    private static ArrayList<Calciatore> squadra;
    private static String allenatore;
    private static final String stadio;

    public Squadra(String nome, String allenatore, String stadio){
        this.nome = nome;
        this.squadra = new ArrayList<>();
        this.allenatore = allenatore;
        this.stadio = stadio;
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Calciatore> getSquadra(){
        return squadra;
    }

    public String getAllenatore(){
        return allenatore;
    }

    public String getStadio(){
        return stadio;
    }

    public void aggiungiCalciatore(Calciatore calciatore){
        squadra.add(calciatore);
    }

    public void rimuoviCalciatore(Calciatore calciatore){
        squadra.remove(calciatore);
    }
}