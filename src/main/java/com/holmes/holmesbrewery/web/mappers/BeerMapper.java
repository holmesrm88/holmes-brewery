package com.holmes.holmesbrewery.web.mappers;

import com.holmes.holmesbrewery.domain.Beer;
import com.holmes.holmesbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
