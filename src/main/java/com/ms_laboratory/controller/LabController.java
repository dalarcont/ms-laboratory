package com.ms_laboratory.controller;

import com.ms_laboratory.service.ILabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint1")
public class LabController {

    private final ILabService labService;

    @Autowired
    public LabController(ILabService labService) {
        this.labService = labService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(labService.test());
    }


}
