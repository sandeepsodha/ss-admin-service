package com.ss.adminservice.api;

import com.ss.adminservice.service.BusService;
import com.ss.adminservice.entity.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {
    private final BusService busservice;

    @Autowired
    public BusController(BusService busservice) {
        this.busservice = busservice;
    }

    @GetMapping("/")
    public List<Bus> getAllBus() {
        return busservice.getAllBus();
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Long id) {
        return busservice.getBusById(id);
    }

    @PostMapping("/")
    public Bus createBus(@RequestBody Bus Bus) {
        return busservice.createBus(Bus);
    }

    @PutMapping("/{id}")
    public Bus updateBus(@PathVariable Long id, @RequestBody Bus updatedRoute) {
        return busservice.updateBus(id, updatedRoute);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable Long id) {
        busservice.deleteBus(id);
    }
}
