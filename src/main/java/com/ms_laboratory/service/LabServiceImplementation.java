package com.ms_laboratory.service;

import org.springframework.stereotype.Service;

@Service
public class LabServiceImplementation implements ILabService {
    @Override
    public String test() {
        return " ( ͡° ͜ʖ ͡°) Laboratory answer for test endpoint!!!  ( ͡° ͜ʖ ͡°)";
    }
}
