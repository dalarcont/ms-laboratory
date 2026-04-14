package com.ms_laboratory.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LabServiceImplementation implements ILabService {

    @Value("${clusterlab.tests.cfm.val1:null}")
    private String cfgMapIncluding_1;

    @Value("${clusterlab.tests.cfm.val2:null}")
    private String cfgMapIncluding_2;

    @Value("${clusterlab.tests.cfm.val3:null}")
    private String cfgMapIncluding_3;

    @Value("${clusterlab.tests.cfm.val3:null}")
    private String cfgMapIncluding_4;

    @Value("${clusterlab.tests.cfm.val5:null}")
    private String cfgMapIncluding_5;

    @Override
    public String test() {
        String propsFromCfgMap = null;
        if(!cfgMapIncluding_1.isEmpty()){
            propsFromCfgMap = String.format("%n%s %n%s %n%s %n%s %n%s",cfgMapIncluding_1,cfgMapIncluding_2,cfgMapIncluding_3,cfgMapIncluding_4,cfgMapIncluding_5);
        }
        return String.format("%s %s","( ͡° ͜ʖ ͡°) Laboratory answer for test endpoint!!!  ( ͡° ͜ʖ ͡°)",propsFromCfgMap);
    }
}
