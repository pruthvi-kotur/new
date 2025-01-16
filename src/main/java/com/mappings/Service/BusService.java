package com.mappings.Service;

import com.mappings.Repository.BusRepository;
import com.mappings.entity.Bus;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    private BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus newbus(Bus bus) {
        Bus save = busRepository.save(bus);
        return save;

    }
}
