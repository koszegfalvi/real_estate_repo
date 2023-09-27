package hu.progmatic.real_estate_repo.repository;

import hu.progmatic.real_estate_repo.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment,Long> {


}
