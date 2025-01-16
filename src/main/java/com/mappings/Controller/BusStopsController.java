package com.mappings.Controller;

import com.mappings.Service.BusService;
import com.mappings.Service.BusStopsService;
import com.mappings.entity.Bus;
import com.mappings.entity.BusStops;
import com.mappings.entity.Stops;
import jdk.jfr.Registered;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/BusStops")
public class BusStopsController {

    private BusStopsService busStopsService;



    public BusStopsController(BusStopsService busStopsService) {
        this.busStopsService = busStopsService;
    }

    @PostMapping
    public ResponseEntity<BusStops> addnewdata(@RequestParam long Bus_id,
                                               @RequestParam long Stop_id,
                                               @RequestParam int order_id)
    {

        BusStops saved= busStopsService.newdata(Bus_id,Stop_id,order_id);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

}
