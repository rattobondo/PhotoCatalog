package org.rattobondo.photocatalog.controller;

import org.rattobondo.photocatalog.domain.Keyword;
import org.rattobondo.photocatalog.repository.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/keyword")
public class KeywordController {

    @Autowired
    private KeywordRepository keywordRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Keyword> getAll() {
        return keywordRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Keyword getKeywordById(@PathVariable("id") int id){
        Keyword keyword = keywordRepository.getOne(id);
        return keyword;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        keywordRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Keyword save(@RequestBody Keyword keyword) {
        return keywordRepository.save(keyword);
    }


}
