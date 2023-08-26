/*
* This would be start of application context
* start configuration through Java instead of XML for spring
* */
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
 * @Configuration annotation is the start, it is a Class level annotation, it replaces applicationContext.xml
 * */
@Configuration
public class AppConfig {

     /*
     * @Bean annotation used to create/get Bean instance, name is optional param
     * */
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //we can use SCOPE_PROTOTYPE to get unique bean per request
    public SpeakerService getSpeakerService(){
         /*
         * Setter Injection
         * */
        /*SpeakerServiceImpl speakerService = new SpeakerServiceImpl(); //commenting as we implement below
        speakerService.setRepository(getSpeakerRepository());
        return speakerService;*/

        /*
        * Constructor Injection
        * it is same as above but we are using the constructor injection way
        * */
        /*SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository()); //commenting as we implement below for Autowired demo
        return speakerService;*/

        /*
        * Autowired demo with setter injection*/
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        return  speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
