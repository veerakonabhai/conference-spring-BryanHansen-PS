package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;

/*
* interface created using intelliJ's extract interface shortcut on HibernateSpeakerRepositoryImpl class
* */
public interface SpeakerRepository {
    List<Speaker> findAll();
}
