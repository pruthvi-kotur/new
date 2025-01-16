package com.mappings.Service;

import com.mappings.Repository.BusRepository;
import com.mappings.Repository.BusStopsRepository;
import com.mappings.Repository.StopsRepository;
import com.mappings.entity.Bus;
import com.mappings.entity.BusStops;
import com.mappings.entity.Stops;
import org.springframework.stereotype.Service;

@Service
public class BusStopsService {

    private BusRepository busRepository;
    private StopsRepository stopsRepository;
    private BusStopsRepository busStopsRepository;

    public BusStopsService(BusRepository busRepository, StopsRepository stopsRepository, BusStopsRepository busStopsRepository) {
        this.busRepository = busRepository;
        this.stopsRepository = stopsRepository;
        this.busStopsRepository = busStopsRepository;
    }

    public BusStops newdata(Long busId, long stopId, int orderId) {
        Bus bus = busRepository.findById(busId).get();
        Stops stops = stopsRepository.findById(stopId).get();
        BusStops busStops=new BusStops();
        busStops.setBus(bus);
        busStops.setStops(stops);
        busStops.setOrderId(orderId);
        BusStops save = busStopsRepository.save(busStops);
        return save;

    }
}
