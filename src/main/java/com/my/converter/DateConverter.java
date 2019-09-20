package com.my.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.datetime.DateFormatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateConverter implements Converter<String, Date> {

    private String pattern;

    public DateConverter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Date convert(String s) {
        DateFormatter dateFormatter = new DateFormatter(pattern);
        Date date = null;
        try {
            date = dateFormatter.parse(s, Locale.CHINA);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
