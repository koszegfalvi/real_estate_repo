package hu.progmatic.real_estate_repo.controller;

import hu.progmatic.real_estate_repo.model.Apartment;
import hu.progmatic.real_estate_repo.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private  final ApartmentService apartmentService;

    @Autowired

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;}

    @GetMapping
    public  List<Apartment>getAllApartments(){return apartmentService.getAllApartments();}

    @GetMapping("/{id}")
    public Apartment getApartmentById(@PathVariable Long id){return apartmentService.getGetApartmentById(id);}
    @PostMapping
    public Apartment createApartment(@RequestBody Apartment apartment){
        return apartmentService.createApartment(apartment);
    }






}
