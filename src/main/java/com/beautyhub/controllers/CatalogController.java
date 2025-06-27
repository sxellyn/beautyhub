package com.beautyhub.controllers;

import com.beautyhub.models.Catalog;
import com.beautyhub.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping
    public List<Catalog> getAllServices() {
        return catalogService.getAllServices();
    }

    @PostMapping
    public Catalog createService(@RequestBody Catalog service) {
        return catalogService.createService(service);
    }

    @PutMapping("/{id}")
    public Catalog updateService(@PathVariable Long id, @RequestBody Catalog updatedService) {
        return catalogService.updateService(id, updatedService);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        catalogService.deleteService(id);
    }
}