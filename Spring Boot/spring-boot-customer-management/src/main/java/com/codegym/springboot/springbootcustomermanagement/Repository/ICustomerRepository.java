package com.codegym.springboot.springbootcustomermanagement.Repository;
import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
