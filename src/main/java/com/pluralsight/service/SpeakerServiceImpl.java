package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

/*
* services as in the business logic tier
* */
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
     * This is after we implemented Setter Injection, and now we are trying the same with Constructor Injection
     * */
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

     /*
     * create a setter using generate->setter->select repository which is used for the setter injection implementation
     * */
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
