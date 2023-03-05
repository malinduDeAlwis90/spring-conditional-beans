package com.example.springconditionalbeans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller
public class MainController {

    final FileService fileService;

    public MainController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/getFile")
    public File getFile() {
        return fileService.loadFile();
    }
}
