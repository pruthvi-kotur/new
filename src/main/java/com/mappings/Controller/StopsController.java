package com.mappings.Controller;


import com.mappings.Repository.StopsRepository;
import com.mappings.Service.StopsService;
import com.mappings.entity.Stops;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/Stops")
@RestController
public class StopsController {

    private StopsService stopsService;

    public StopsController(StopsService stopsService) {
        this.stopsService = stopsService;
    }


    @PostMapping
    public ResponseEntity<Stops> addStop(@RequestBody Stops stops)
    {
       Stops saved= stopsService.newstop(stops);
       return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
