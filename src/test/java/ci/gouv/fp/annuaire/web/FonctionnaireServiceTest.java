package ci.gouv.fp.annuaire.web;

import ci.gouv.fp.annuaire.entity.Fonctionnaire;
import ci.gouv.fp.annuaire.service.FonctionnaireService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static  org.junit.jupiter.api.Assertions.*;



@Transactional
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class FonctionnaireServiceTest {



    @Autowired
    private FonctionnaireService fonctionnaireService;

    private Fonctionnaire fonctionnaire;

    @BeforeEach
    public void setUp(){



    }

    @Test
    public void TesterCreer(){
        fonctionnaire = new Fonctionnaire();
        assertThat(1).isEqualTo(null);

    }
}
