package com.vaibhav.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventLoggingTask implements Runnable {

    private Logger logger = LogManager.getLogger(EventLoggingTask.class);

    @Override
    public void run() {
        logger.info("Message");
    }

}
