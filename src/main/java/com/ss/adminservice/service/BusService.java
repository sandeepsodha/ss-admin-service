package com.ss.adminservice.service;

import com.ss.adminservice.entity.Bus;
import com.ss.adminservice.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }

    public Bus getBusById(Long id) {
        return busRepository.findById(id).orElse(null);
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Bus updateBus(Long id, Bus updated) {
        Bus existing = busRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setOperatorID(updated.getOperatorID());
            existing.setBusName(updated.getBusName());
            existing.setCapacity(updated.getCapacity());
            existing.setRegistrationNumber(updated.getRegistrationNumber());
            existing.setType(updated.getType());
            return busRepository.save(existing);
        }

        return null;
    }

    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }
}

