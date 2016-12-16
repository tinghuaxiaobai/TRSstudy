package com.haier.config;

import com.season.core.spring.SeasonServletInitializer;


public class ServletInitializer extends SeasonServletInitializer{
    @Override
    protected Class<?> getAppClass() {
        return App.class;
    }
}
