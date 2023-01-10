package progetto1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.security.SecureRandom;

public class Squadra { //class containing data of team

    private final String nome; //team name
    private ArrayList<Calciatore> squadra; //list of team's players
    private String allenatore; //coach team
    private final String stadio; //arena name

    private int[] schema = new int[3];

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

    public void stampaRosa(){
        for (Calciatore calciatore : squadra)
            System.out.println(calciatore.getNome() + "\t" + calciatore.getCognome() + "\n");
    }

    public void cambioSchema() {

        int dif, cen, att;

        boolean continua = true;

        Scanner n = new Scanner(System.in);

        do {
            System.out.println("Scegli lo schema della formazione in campo(inserisci solo numeri interi)");

            try {
                System.out.print("Difensori: ");
                dif = n.nextInt();
                System.out.print("Centrocampisti: ");
                cen = n.nextInt();
                System.out.print("Attaccanti: ");
                att = n.nextInt();
                int somma = dif + cen + att;
                if (somma != 10)
                    throw new Exception();
                else {
                    schema[0] = dif;
                    schema[1] = cen;
                    schema[2] = att;
                    System.out.println("La squadra giocherà con il " + schema[0] + schema[1] + schema[2] + "\n\n");
                    continua = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInserimento dati non compatibile con la richiesta. Riprova.\n");
                System.out.println("Devi inserire un numero intero di difensori, centrocampisti e attaccanti (la somma deve fare 10)\n\n");
            } catch (Exception e) {
                System.out.println("Devi inserire un numero intero di difensori, centrocampisti e attaccanti (la somma deve fare 10)\n\n");
            }
        }
        while (continua);


    }

    public void stampaTitolari(){

        SecureRandom sr = new SecureRandom();

        int scelta = 0, i;

        while(squadra.get(scelta).getRuolo() != Ruolo.Portiere)
            scelta = sr.nextInt(squadra.size());
        System.out.println("Portiere: " + squadra.get(scelta).getNome() + "\t" + squadra.get(scelta).getCognome() + "\n");

        for(i = 0; i < schema[0];) {
            scelta = sr.nextInt(squadra.size());
            if (squadra.get(scelta).getRuolo() == Ruolo.Difensore)
                {
                    System.out.println("Difensore: " + squadra.get(scelta).getNome() + "\t" + squadra.get(scelta).getCognome() + "\n");
                    i++;
                }
        }

        for(i = 0; i < schema[1];) {
            scelta = sr.nextInt(squadra.size());
            if (squadra.get(scelta).getRuolo() == Ruolo.Centrocampista)
            {
                System.out.println("Centrocampista: " + squadra.get(scelta).getNome() + "\t" + squadra.get(scelta).getCognome() + "\n");
                i++;
            }
        }

        for(i = 0; i < schema[2];) {
            scelta = sr.nextInt(squadra.size());
            if (squadra.get(scelta).getRuolo() == Ruolo.Attaccante)
            {
                System.out.println("Attaccante: " + squadra.get(scelta).getNome() + "\t" + squadra.get(scelta).getCognome() + "\n");
                i++;
            }
        }

    }
}