package excursion_hub.demo.services;

import excursion_hub.demo.data.LocationRepository;
import excursion_hub.demo.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServices {
    @Autowired
    private LocationRepository locationRepository;

    public Optional<Location> getLocationById(int id) {
        return locationRepository.findById(id);
    }
}
