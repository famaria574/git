package ci.gouv.fp.annuaire.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExempleService {

    private static ExempleService exempleService;
    private ExempleService(){

    }
    public static ExempleService getInstance(){
        if (exempleService == null)
            exempleService = new ExempleService();
        return exempleService;
    }
    public int calculerAge(int anneeDeNaissance){
        return LocalDate.now().getYear() - anneeDeNaissance;
    }
    public LocalDate  calculerDateRetraite(LocalDate naissance){
        return naissance.plusYears(65);
    }

    public void afficher(int age){
        System.out.println("vous avez" + age + "an(s)");

    }
    public void afficher(LocalDate dateRetraitre){
        System.out.println("votre date de depart a la retraite est : " + dateRetraitre.toString());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Votre date de depart a la retraite est : " + dateRetraitre.format(df));
    }
}
