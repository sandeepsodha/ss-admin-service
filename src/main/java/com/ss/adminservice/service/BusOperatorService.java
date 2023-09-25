package com.ss.adminservice.service;

import com.ss.adminservice.entity.BusOperator;
import com.ss.adminservice.repository.BusOperatorRepository;
import com.ss.adminservice.repository.BusOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusOperatorService {
    private final BusOperatorRepository busOperatorRepository;

    @Autowired
    public BusOperatorService(BusOperatorRepository busOperatorRepository) {
        this.busOperatorRepository = busOperatorRepository;
    }

    public List<BusOperator> getAllBusOperators() {
        return busOperatorRepository.findAll();
    }

    public BusOperator getBusOperatorById(Long id) {
        return busOperatorRepository.findById(id).orElse(null);
    }

    public BusOperator createBusOperator(BusOperator busOperator) {
        return busOperatorRepository.save(busOperator);
    }

    public BusOperator updateBusOperator(Long id, BusOperator updatedOperator) {
        BusOperator existingOperator = busOperatorRepository.findById(id).orElse(null);

        if (existingOperator != null) {
            existingOperator.setOperatorName(updatedOperator.getOperatorName());
            existingOperator.setContactInformation(updatedOperator.getContactInformation());
            existingOperator.setLicenseDetails(updatedOperator.getLicenseDetails());

            return busOperatorRepository.save(existingOperator);
        }

        return null;
    }

    public void deleteBusOperator(Long id) {
        busOperatorRepository.deleteById(id);
    }
}

