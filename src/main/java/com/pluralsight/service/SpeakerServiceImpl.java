package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* services as in the business logic tier
* */

/*
* @Service stereotype helps to handle the @Bean configuration when used with @ComponentScan
* */
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
     /*
     * initial setup without the spring, later we do use spring and remove the dependency
     * */

     /*
     * commenting this as we remove this hardcoded implementation as part of spring upgrade
     * */
    //private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    /*
    * we are creating a no args constructor to demo with Autowired feature which will use the below setter injection to autowire
    * */
    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    /*
     * This is after we implemented Setter Injection, and now we are trying the same with Constructor Injection
     * */
    /*
    * @Autowired used after using stereotypes to implement constructor injection, we can use either setter or constructor
    * just by adding @Autowired
    * */
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

     /*
     * create a setter using generate->setter->select repository which is used for the setter injection implementation
     * */
    /*
    * @Autowired used to do the setter injection
    * */
//    @Autowired //@Autowired moved to above constructor to implement constructor injection when testing stereotypes
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository setter");
        this.repository = repository;
    }
}
