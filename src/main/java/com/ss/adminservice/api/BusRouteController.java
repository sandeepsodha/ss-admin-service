package com.ss.adminservice.api;

import com.ss.adminservice.service.BusRouteService;
import com.ss.adminservice.entity.BusRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class BusRouteController {
    private final BusRouteService busRouteService;

    @Autowired
    public BusRouteController(BusRouteService busRouteService) {
        this.busRouteService = busRouteService;
    }

    @GetMapping("/")
    public List<BusRoute> getAllBusRoutes() {
        return busRouteService.getAllBusRoutes();
    }

    @GetMapping("/{id}")
    public BusRoute getBusRouteById(@PathVariable Long id) {
        return busRouteService.getBusRouteById(id);
    }

    @PostMapping("/")
    public BusRoute createBusRoute(@RequestBody BusRoute busRoute) {
        return busRouteService.createBusRoute(busRoute);
    }

    @PutMapping("/{id}")
    public BusRoute updateBusRoute(@PathVariable Long id, @RequestBody BusRoute updatedRoute) {
        return busRouteService.updateBusRoute(id, updatedRoute);
    }

    @DeleteMapping("/{id}")
    public void deleteBusRoute(@PathVariable Long id) {
        busRouteService.deleteBusRoute(id);
    }
}
