package io.fabric8.quickstarts.cxf.jaxrs;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {
    private Logger logger = Logger.getLogger(TestService.class);
    Map mapa = new HashMap();
    public void loadTestOne(){
        logger.error("Нагрузочный тест №1");
        long startTime = System.currentTimeMillis();
        Integer counter = 0;
        for (int i=0; i<1000000; i++){
            counter = counter + i*i;
            mapa.put(i, counter);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        logger.info("Посчитали. Время выполнения:" + duration + " мс.");
    }
}
