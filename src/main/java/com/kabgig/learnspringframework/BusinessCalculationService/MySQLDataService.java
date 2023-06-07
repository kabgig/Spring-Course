package com.kabgig.learnspringframework.BusinessCalculationService;

import org.springframework.stereotype.Repository;

//@Component
@Repository
class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
