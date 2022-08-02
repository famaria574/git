package ci.gouv.fp.annuaire.service;

import ci.gouv.fp.annuaire.entity.Fonctionnaire;

import java.util.List;

public interface FonctionnaireService {

    Fonctionnaire creerFonctionnaire(Fonctionnaire fonctionnaire);

    Fonctionnaire modifierFonctionnaire(Fonctionnaire fonctionnaire);

    Fonctionnaire rechercherFonctionnaire(String matricule);

    Fonctionnaire rechercherFonctionnaire(Long id);

    List<Fonctionnaire> listerFonctionnaire();

    List<Fonctionnaire> filtrerFonctionnaire(String cle);

    void supprimerFonctionnaire(String matricule);


}
