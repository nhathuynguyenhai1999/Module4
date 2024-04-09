package com.codegym.module4.customermanagementthymeleaf.Service;
import com.codegym.module4.customermanagementthymeleaf.Model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customers;
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Hai Phong"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Sai Gon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijing"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "NewYork"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
    @Override
    public void save(Customer customer) {
        Transaction transaction = null;
        Customer origin;
        if(customer.getId() == 0){
            origin = new Customer();
        }
        else {
            origin = findById(customer.getId());
        }
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            origin.setName(customer.getName());
            origin.setEmail(customer.getEmail());
            origin.setAddress(customer.getAddress());
            session.saveOrUpdate(origin);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            if(transaction != null){
                transaction.rollback();
            }
        }
        customers.put(customer.getId(), customer);
    }
    @Override
    public Customer findById(int id) {
        String queryStr = "SELECT c FROM Customer AS c WHERE c.id = :id";
        TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
        query.setParameter("id",id);
        return query.getSingleResult();
//        return customers.get(id);
    }
    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }
    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
