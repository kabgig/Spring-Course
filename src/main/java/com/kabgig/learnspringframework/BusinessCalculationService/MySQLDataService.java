package com.kabgig.learnspringframework.BusinessCalculationService;

import org.springframework.stereotype.Component;

@Component
class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
