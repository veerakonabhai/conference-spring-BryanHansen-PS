package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

/*
* Demo for wrap calendar instance inside factory to manipulate things
* */
public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar instance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public  void addDays(int num){
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}
