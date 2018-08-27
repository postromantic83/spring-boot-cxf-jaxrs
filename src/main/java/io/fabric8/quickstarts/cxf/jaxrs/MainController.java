package io.fabric8.quickstarts.cxf.jaxrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/tests")
public class MainController {
    private final LoggingRepository repository;
    private final TestService service;

    @Autowired
    public MainController(LoggingRepository repository, TestService service) {
        this.repository = repository;
        this.service = service;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public String selfTest() {
        return "Service is working";
    }

    @RequestMapping(value = "/loadTest1", method = RequestMethod.GET)
    @ResponseBody
    public String loadTest1() {
        service.loadTestOne();
        return "Load Test Passed";
    }
}