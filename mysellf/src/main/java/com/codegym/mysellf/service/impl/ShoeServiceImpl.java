package com.codegym.mysellf.service.impl;

import com.codegym.mysellf.model.Shoe;
import com.codegym.mysellf.repository.ShoeRepository;
import com.codegym.mysellf.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoeServiceImpl implements ShoeService {
    @Autowired
    private ShoeRepository shoeRepository;

    @Override
    public Optional<Shoe> findShoeById(Long id) {
        return shoeRepository.findById(id);
    }

    @Override
    public List<Shoe> findAllShoes() {
        return shoeRepository.findAll();
    }

    @Override
    public void saveShoe(Shoe shoe) {
        shoeRepository.save(shoe);
    }

    @Override
    public void deleteShoe(Long id) {
        shoeRepository.delete(id);
    }
}
