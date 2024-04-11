package com.codegym.springboot.springbootcustomermanagement.Service.ImplServer;

import com.codegym.springboot.springbootcustomermanagement.Model.Customer;
import com.codegym.springboot.springbootcustomermanagement.Repository.ICustomerRepository;
import com.codegym.springboot.springbootcustomermanagement.Service.ImplCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ImplCustomerService {

    private final ICustomerRepository iCustomerRepository;

    public CustomerService(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public List<Customer> getALl() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findId(Long id) {
        return iCustomerRepository.findById(id).orElse(null);// khi khong co du lieu thi se tra ve null
    }

    @Override
    public void delete(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
