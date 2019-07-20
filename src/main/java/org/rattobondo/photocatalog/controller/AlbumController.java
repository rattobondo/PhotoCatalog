package org.rattobondo.photocatalog.controller;

import org.rattobondo.photocatalog.domain.Album;
import org.rattobondo.photocatalog.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Album> getAll() {
        return albumRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Album getAlbumById(@PathVariable("id") int id){
        Album album = albumRepository.getOne(id);
        return album;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        albumRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Album save(@RequestBody Album album) {
        return albumRepository.save(album);
    }


}
