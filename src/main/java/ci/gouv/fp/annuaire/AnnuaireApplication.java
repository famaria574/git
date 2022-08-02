package ci.gouv.fp.annuaire;

import ci.gouv.fp.annuaire.service.ExempleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;

@SpringBootApplication
public class AnnuaireApplication {

    static ExempleService fs = ExempleService.getInstance();

    public static void main(String[] args) {
        SpringApplication.run(AnnuaireApplication.class, args);


       int age =  fs.calculerAge(1960);
       fs.afficher(age);

        LocalDate dateRetraite = fs.calculerDateRetraite(LocalDate.now());
        fs.afficher(dateRetraite);

    }
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/fonctionnaire/**").allowedOrigins("*");
            }
        };
    }



}
