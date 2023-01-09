package progetto1;

public class Calciatore {

    private final String nome;
    private final String cognome;

    private String ruolo;
    private int eta;

    public Calciatore(String nome, String cognome, String ruolo, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.eta = eta;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String getRuolo(){
        return ruolo;
    }

    public int getEta(){
        return eta;
    }

    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

    public void setEta(int eta){
        this.eta = eta;
    }



}