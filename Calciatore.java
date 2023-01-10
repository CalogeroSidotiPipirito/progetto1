package progetto1;

enum Ruolo {Portiere, Difensore, Centrocampista, Attaccante}; //enumerate type - role player


public class Calciatore { //class containing biographical data of player

    private final String nome; //player name
    private final String cognome; //player surname

    private Ruolo ruolo; //player role

    private int eta; //age

    public Calciatore(String nome, String cognome, Ruolo ruolo, int eta){ //constructor of class Calciatore
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

    public Ruolo getRuolo(){
        return ruolo;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public void cambiaRuolo(Ruolo ruolo){
        this.ruolo = ruolo;
    }



}