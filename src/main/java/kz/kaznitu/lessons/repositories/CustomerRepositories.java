package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepositories extends CrudRepository<Customer, Long> {

    List<Customer> findByLastname(String lastname) ;

    @Query("select c from Customer as c where c.id = :id")
    Customer findOne(@Param("id") long l);
}
