package hu.progmatic.real_estate_repo.service;

import hu.progmatic.real_estate_repo.model.Apartment;
import hu.progmatic.real_estate_repo.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
   private final ApartmentRepository apartmentRepository;
public Apartment getApartmentById;

@Autowired

   public ApartmentService(ApartmentRepository apartmentRepository) {
      this.apartmentRepository = apartmentRepository;
   }
   public  List<Apartment> getAllApartments(){return apartmentRepository.findAll();}

   public Apartment getGetApartmentById(Long id){return apartmentRepository.findById(id).orElse(null);}
   public Apartment createApartment(Apartment apartment){
   return apartmentRepository.save(apartment);
   }






}
