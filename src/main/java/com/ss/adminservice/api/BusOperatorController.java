package com.ss.adminservice.api;

import com.ss.adminservice.service.BusOperatorService;
import com.ss.adminservice.service.BusOperatorService;
import com.ss.adminservice.entity.BusOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operators")
public class BusOperatorController {
    private final BusOperatorService busOperatorService;

    @Autowired
    public BusOperatorController(BusOperatorService busOperatorService) {
        this.busOperatorService = busOperatorService;
    }

    @GetMapping("/")
    public List<BusOperator> getAllBusOperators() {
        return busOperatorService.getAllBusOperators();
    }

    @GetMapping("/{id}")
    public BusOperator getBusOperatorById(@PathVariable Long id) {
        return busOperatorService.getBusOperatorById(id);
    }

    @PostMapping("/")
    public BusOperator createBusOperator(@RequestBody BusOperator busOperator) {
        return busOperatorService.createBusOperator(busOperator);
    }

    @PutMapping("/{id}")
    public BusOperator updateBusOperator(@PathVariable Long id, @RequestBody BusOperator updatedOperator) {
        return busOperatorService.updateBusOperator(id, updatedOperator);
    }

    @DeleteMapping("/{id}")
    public void deleteBusOperator(@PathVariable Long id) {
        busOperatorService.deleteBusOperator(id);
    }
}
