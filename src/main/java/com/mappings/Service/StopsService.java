package com.mappings.Service;

import com.mappings.Repository.StopsRepository;
import com.mappings.entity.Stops;
import org.springframework.stereotype.Service;

@Service
public class StopsService {

    private StopsRepository stopsRepository;

    public StopsService(StopsRepository stopsRepository) {
        this.stopsRepository = stopsRepository;
    }

    public Stops newstop(Stops stops) {
        Stops saved = stopsRepository.save(stops);
        return saved;
    }
}
