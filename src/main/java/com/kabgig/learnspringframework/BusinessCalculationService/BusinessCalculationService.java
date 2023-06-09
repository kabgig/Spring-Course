package com.kabgig.learnspringframework.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
class BusinessCalculationService {
    DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays
                .stream(dataService.retrieveData())
                .max()
                .orElse(0);
    }

    @Override
    public String toString() {
        return "Sup!";
    }
}
