package excursion_hub.demo.controllers;

import excursion_hub.demo.data.AttractionRepository;
import excursion_hub.demo.services.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locationservices")
public class LocationController {
    @Autowired
    private LocationServices locationServices;

    @Autowired
    private AttractionRepository attractionRepository;
}
