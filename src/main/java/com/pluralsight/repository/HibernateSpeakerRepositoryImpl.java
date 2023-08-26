package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


/*
 * @Repository stereotype helps to handle the @Bean configuration when used with @ComponentScan
 * */
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    /*
    * we wrote first below method and then later extracted it into interface SpeakerRepository with the methods
    * */

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Veer");
        speaker.setLastName("Konabhai");

        speakers.add(speaker);

        return speakers;
    }

}
