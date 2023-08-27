package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

/*services as in the business logic tier*/
public class SpeakerServiceImpl implements SpeakerService {

    /* initial setup without the spring, later we do use spring and remove the dependency */
//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl(); //commenting as we implement as below in xml configuration
    private SpeakerRepository repository;

    /*
    * created using generate->setter
    * */
    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
