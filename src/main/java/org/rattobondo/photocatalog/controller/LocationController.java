package org.rattobondo.photocatalog.controller;

import org.rattobondo.photocatalog.domain.Location;
import org.rattobondo.photocatalog.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Location> getAll() {
        return locationRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable("id") int id){
        Location location = locationRepository.getOne(id);
        return location;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        locationRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Location save(@RequestBody Location location) {
        return locationRepository.save(location);
    }


}
