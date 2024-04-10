package com.codegym.studentjpa.studentjpa.repository;

import com.codegym.studentjpa.studentjpa.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Transactional
@Repository
public class StudentRepository implements IStudentRepository{
    @PersistenceContext
    private EntityManager entityManager;
    /**
     * @return
     */
    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("select s from Student as s", Student.class);
        return query.getResultList();
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student save(Student student) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(Long id) {

    }
}
