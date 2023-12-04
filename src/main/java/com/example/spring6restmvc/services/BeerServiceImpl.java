package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.Beer;
import com.example.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();


    Beer beer1 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Raciborskie Klasyczne")
            .beerStyle(BeerStyle.LAGER)
            .upc("12356")
            .price(new BigDecimal("4.99"))
            .quantityOnHand(122)
            .createDate(LocalDateTime.now())
            .updateDate(LocalDateTime.now())
            .build();

    Beer beer2 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Raciborskie Miodowe")
            .beerStyle(BeerStyle.PILSNER)
            .upc("12378")
            .price(new BigDecimal("5.29"))
            .quantityOnHand(392)
            .createDate(LocalDateTime.now())
            .updateDate(LocalDateTime.now())
            .build();

    Beer beer3 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Raciborskie Ciemne")
            .beerStyle(BeerStyle.CIEMNY_LAGER)
            .upc("12356")
            .price(new BigDecimal("7.29"))
            .quantityOnHand(144)
            .createDate(LocalDateTime.now())
            .updateDate(LocalDateTime.now())
            .build();


    beerMap.put(beer1.getId(), beer1);
    beerMap.put(beer2.getId(), beer2);
    beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {
        return beerMap.get(id);
    }
}
