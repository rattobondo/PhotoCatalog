package org.rattobondo.photocatalog.controller;

import org.rattobondo.photocatalog.domain.Photo;
import org.rattobondo.photocatalog.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Photo> getAll() {
        return photoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Photo getPhotoById(@PathVariable("id") int id){
        Photo photo = photoRepository.getOne(id);
        return photo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        photoRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Photo save(@RequestBody Photo photo) {
        return photoRepository.save(photo);
    }


}
