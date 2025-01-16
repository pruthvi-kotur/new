package com.mappings.Controller;


import com.mappings.Service.BusService;
import com.mappings.entity.Bus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Bus")
public class BusController {

    private BusService busService;


    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> addbus(@RequestBody Bus bus)
    {
        Bus saved =busService.newbus(bus);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
