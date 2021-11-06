package com.holmes.holmesbrewery.domain;

import com.holmes.holmesbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Pretend this is something we are persisting to JPA or some sort of persisting tier.
 *
 * We are taking this persisted layer to our API model
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
