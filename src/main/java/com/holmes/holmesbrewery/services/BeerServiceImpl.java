package com.holmes.holmesbrewery.services;

import com.holmes.holmesbrewery.services.BeerService;
import com.holmes.holmesbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Holmes IPA")
                .beerStyle("IPA")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO impl - add to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer...");
    }


}
