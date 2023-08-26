/*This would be start of application context
* start configuration through Java instead of XML for spring*/

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* @Configuration annotation is the start, it is a Class level annotation, it replaces applicationContext.xml */
@Configuration
public class AppConfig {

    /* @Bean annotation used to create/get Bean instance, name is optional param */
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        /* Setter Injection */
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}