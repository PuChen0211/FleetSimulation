package com.pu.spring.uber.service;

import com.pu.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by puchen on 12/7/16.
 */

public interface LocationService {
    List<Location> saveCarLocations(List<Location> carLocations);

    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);

    Page<Location> findByVin(String vin, Pageable pageable);
}
