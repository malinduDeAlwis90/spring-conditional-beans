package com.example.springconditionalbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

class CloudFileServiceImpl extends FileServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(CloudFileServiceImpl.class);

    public CloudFileServiceImpl() {
        logger.info("CloudFileServiceImpl constructed.");
    }

    public File loadFile() {
        // This method was added to implement cloud specific functionality.
        return null;
    }
}