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
        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }

}
