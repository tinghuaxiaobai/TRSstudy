package com.haier.config;

import com.season.core.spring.SeasonApplication;
import com.season.core.spring.SeasonRunner;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
public class App extends SeasonApplication {
    public static void main(String[] args){
        SeasonRunner.run(App.class,args);
    }
}
