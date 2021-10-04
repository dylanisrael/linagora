package com.linagora.config;

import com.linagora.driverManager.WebDriverManager;

public abstract class Properties {

    public final static Configuration       Config          = Configuration.getInstance();
    public final static WebDriverManager    DriverManager   = WebDriverManager.getInstance();

}
