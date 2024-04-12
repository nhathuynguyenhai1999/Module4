package com.codegym.databinding.form.medicalform.medicalform.service;

import com.codegym.databinding.form.medicalform.medicalform.model.HealthForm;
import com.codegym.databinding.form.medicalform.medicalform.repository.HealthFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthFormService {
    @Autowired
    private HealthFormRepository healthFormRepository;
    public void saveHealthForm(HealthForm healthForm){
    }
}
