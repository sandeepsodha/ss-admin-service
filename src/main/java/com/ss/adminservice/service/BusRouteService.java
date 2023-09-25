package com.ss.adminservice.service;

import com.ss.adminservice.entity.BusRoute;
import com.ss.adminservice.repository.BusRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BusRouteService {
    private final BusRouteRepository busRouteRepository;

    @Autowired
    public BusRouteService(BusRouteRepository busRouteRepository) {
        this.busRouteRepository = busRouteRepository;
    }

    public List<BusRoute> getAllBusRoutes() {
        return busRouteRepository.findAll();
    }

    public BusRoute getBusRouteById(Long id) {
        return busRouteRepository.findById(id).orElse(null);
    }

    public BusRoute createBusRoute(BusRoute busRoute) {
        return busRouteRepository.save(busRoute);
    }

    public BusRoute updateBusRoute(Long id, BusRoute updatedRoute) {
        BusRoute existingRoute = busRouteRepository.findById(id).orElse(null);

        if (existingRoute != null) {
            existingRoute.setSourceCity(updatedRoute.getSourceCity());
            existingRoute.setDestinationCity(updatedRoute.getDestinationCity());
            existingRoute.setDistance(updatedRoute.getDistance());
            existingRoute.setDuration(updatedRoute.getDuration());
            existingRoute.setPrice(updatedRoute.getPrice());
            existingRoute.setDepartureTime(updatedRoute.getDepartureTime());
            existingRoute.setArrivalTime(updatedRoute.getArrivalTime());

            return busRouteRepository.save(existingRoute);
        }

        return null;
    }

    public void deleteBusRoute(Long id) {
        busRouteRepository.deleteById(id);
    }
}

