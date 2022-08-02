package ci.gouv.fp.annuaire.web;

import ci.gouv.fp.annuaire.entity.Fonctionnaire;
import ci.gouv.fp.annuaire.service.FonctionnaireService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fonctionnaire")
public class FonctionnaireController {


    private final FonctionnaireService fonctionnaireService;

    public FonctionnaireController(@Qualifier("fonctionnaireAbidjanService") FonctionnaireService fonctionnaireService) {
        this.fonctionnaireService = fonctionnaireService;
    }

    @PostMapping("/creer")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Fonctionnaire>  creerFonctionnaire(@RequestBody Fonctionnaire fonctionnaire){
       fonctionnaire = fonctionnaireService.creerFonctionnaire(fonctionnaire);
       return ResponseEntity.ok().body(fonctionnaire);
    }

    @GetMapping("/lister")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Fonctionnaire>> listerFonctionnaire(){
     return ResponseEntity.ok().body(fonctionnaireService.listerFonctionnaire());
    }
}
