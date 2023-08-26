import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
         /*
         * loading spring and loading configuration files
         * */
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

         /*
         * getBean instead of hardcoded implementation
         * */
        //SpeakerService service = new SpeakerServiceImpl();//commented to implement as below
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

        /*
        * To check if we have the Singleton object returned for a different getBean request
        * */
        System.out.println(service); //object address of service
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2); //object address of service2
        /*
        * both prints should be pointed to same object address when scope is "singleton" and different when scope is "prototype"
        * */
    }

}
