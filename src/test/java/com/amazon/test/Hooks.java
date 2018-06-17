package com.amazon.test;

import com.amazon.test.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks
{
    DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp() throws IOException
    {
        driverFactory.openBrowser();
    }
    @After
    public void tearDown()
    {

        driverFactory.closeBrowser();
    }
}
