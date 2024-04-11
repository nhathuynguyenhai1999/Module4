package com.codegym.springboot.springbootcustomermanagement.Repository;
import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
