package ci.gouv.fp.annuaire.service.impl;

import ci.gouv.fp.annuaire.entity.Fonctionnaire;
import ci.gouv.fp.annuaire.repository.FonctionnaireRepository;
import ci.gouv.fp.annuaire.service.FonctionnaireService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Qualifier("fonctionnaireAbidjanService")
public class FonctionnaireServiceImpl implements FonctionnaireService {

    private final FonctionnaireRepository fonctionnaireRepository;

    public FonctionnaireServiceImpl(FonctionnaireRepository fonctionnaireRepository) {
        this.fonctionnaireRepository = fonctionnaireRepository;
    }

    @Override
    public Fonctionnaire creerFonctionnaire(Fonctionnaire fonctionnaire) {
        return fonctionnaireRepository.save(fonctionnaire);
    }

    @Override
    public Fonctionnaire modifierFonctionnaire(Fonctionnaire fonctionnaire) {
        return fonctionnaireRepository.save(fonctionnaire);
    }

    @Override
    public Fonctionnaire rechercherFonctionnaire(String matricule) {
        return fonctionnaireRepository.findByMatricule(matricule);
    }

    @Override
    public Fonctionnaire rechercherFonctionnaire(Long id) {
        Optional<Fonctionnaire> optional = fonctionnaireRepository.findById(id);
        return optional.get() ;
    }

    @Override
    public List<Fonctionnaire> listerFonctionnaire() {
        return fonctionnaireRepository.findAll();
    }

    @Override
    public List<Fonctionnaire> filtrerFonctionnaire(String cle) {
        return null;
    }

    @Override
    public void supprimerFonctionnaire(String matricule) {

    }
}
