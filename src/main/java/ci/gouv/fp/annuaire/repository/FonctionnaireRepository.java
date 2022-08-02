package ci.gouv.fp.annuaire.repository;

import ci.gouv.fp.annuaire.entity.Fonctionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FonctionnaireRepository extends JpaRepository <Fonctionnaire, Long> {
    Fonctionnaire findByMatricule(String matricule);
    @Query(value = "SELECT f FROM Fonctionnaire f WHERE f.matricule = :matricule")
    Fonctionnaire rechercherParMatricule(@Param("matricule") String matricule);
}
