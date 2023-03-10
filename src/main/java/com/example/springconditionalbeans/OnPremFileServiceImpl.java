package com.example.springconditionalbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
class OnPremFileServiceImpl extends FileServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(OnPremFileServiceImpl.class);

    public OnPremFileServiceImpl() {
        logger.info("OnPremFileServiceImpl constructed.");
    }

    public File loadFile() {
        // This method was added to implement on-prem specific functionality.
        return null;
    }
}