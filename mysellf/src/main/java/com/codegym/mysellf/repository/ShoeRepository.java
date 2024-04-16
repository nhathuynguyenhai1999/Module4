package com.codegym.mysellf.repository;

import com.codegym.mysellf.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
    void delete(Long id);
}
