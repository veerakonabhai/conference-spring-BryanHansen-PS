package com.pluralsight.service;

import com.pluralsight.model.Speaker;

import java.util.List;

/*
* interface created using intelliJ's extract interface shortcut on SpeakerServiceImpl class
* */
public interface SpeakerService {
    List<Speaker> findAll();
}
