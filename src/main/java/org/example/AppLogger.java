package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLogger
{
    private static final Logger Logger = LogManager.getLogger(AppLogger.class);
    public static void main( String[] args )
    {
        Logger.debug("This is debug");
        Logger.info("This is info");
        Logger.warn("This is warn");
        Logger.error("This is error");
        Logger.fatal("This is fatal");
    }
}