package by.avsak.sonic.jms.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Receiver {

    private static Logger logger = LogManager.getRootLogger();

    public Receiver() {
        logger.info("Receiver created.");
    }
}
