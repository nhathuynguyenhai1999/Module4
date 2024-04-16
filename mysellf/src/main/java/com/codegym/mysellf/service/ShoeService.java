package com.codegym.mysellf.service;

import com.codegym.mysellf.model.Shoe;

import java.util.List;
import java.util.Optional;

public interface ShoeService {
    Optional<Shoe> findShoeById(Long id);
    List<Shoe> findAllShoes();
    void saveShoe(Shoe shoe);
    void deleteShoe(Long id);
}
