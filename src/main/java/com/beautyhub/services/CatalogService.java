package com.beautyhub.services;

import com.beautyhub.models.Catalog;
import com.beautyhub.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public List<Catalog> getAllServices() {
        return catalogRepository.findAll();
    }

    public Catalog createService(Catalog service) {
        return catalogRepository.save(service);
    }

    public Catalog updateService(Long id, Catalog updatedService) {
        return catalogRepository.findById(id).map(service -> {
            service.setServiceName(updatedService.getServiceName());
            service.setDescription(updatedService.getDescription());
            service.setPrice(updatedService.getPrice());
            return catalogRepository.save(service);
        }).orElseGet(() -> {
            updatedService.setId(id);
            return catalogRepository.save(updatedService);
        });
    }

    public void deleteService(Long id) {
        catalogRepository.deleteById(id);
    }
}
