package kz.zhelezyaka.BreweryRESTfulService.web.mappers;

import kz.zhelezyaka.BreweryRESTfulService.domain.Beer;
import kz.zhelezyaka.BreweryRESTfulService.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}