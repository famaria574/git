package ci.gouv.fp.annuaire.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "t_fonctionnaire")
public class Fonctionnaire {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "seq_fonctionnaire")
    @SequenceGenerator(name = "seq_fonctionnaire",initialValue = 10,allocationSize = 5)
    private Long id;

    @Getter @Setter
    @Column(name = "mat", unique = true, nullable = false, length = 7)
    private String matricule;


    //generer les geter et les seter

    @Getter @Setter
    @Column(name = "nom_prenom", length = 200)
    private String nomPrenom;
}
