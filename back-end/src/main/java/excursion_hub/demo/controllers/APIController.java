package excursion_hub.demo.controllers;

import excursion_hub.demo.services.APIServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiservices")
public class APIController {
    @Autowired
    APIServices apiServices;
}
