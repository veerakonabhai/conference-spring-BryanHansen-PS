/*
* This would be start of application context
* start configuration through Java instead of XML for spring
* */

import com.pluralsight.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

/*
 * @Configuration annotation is the start, it is a Class level annotation, it replaces applicationContext.xml
 * */
@Configuration
/*
* @ComponentScan is an annotation which helps to remove all the below bean definitions
* */
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

/*
* no need of below implementation after using @ComponentScan annotation which looks for bean using the stereotypes
* like @Component, @Service, @Repository, @Controller.
* so commenting out below hybrid approach whole code
* */
//     /*
//     * @Bean annotation used to create/get Bean instance, name is optional param
//     * */
//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //we can use SCOPE_PROTOTYPE to get unique bean per request
//    public SpeakerService getSpeakerService(){
//         /*
//         * Setter Injection
//         * */
//        /*SpeakerServiceImpl speakerService = new SpeakerServiceImpl(); //commenting as we implement below
//        speakerService.setRepository(getSpeakerRepository());
//        return speakerService;*/
//
//        /*
//        * Constructor Injection
//        * it is same as above but we are using the constructor injection way
//        * */
//        /*SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository()); //commenting as we implement below for Autowired demo
//        return speakerService;*/
//
//        /*
//        * Autowired demo with setter injection*/
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        return  speakerService;
//    }
//
//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
