package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping("/{beerID}")
    public ResponseEntity saveBeer(@PathVariable("beerID") UUID beerID)    {
        beerService.saveNewBeer(beerID);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerID}")
    public ResponseEntity updateBeer(@PathVariable("beerID") UUID beerID)   {
        beerService.updateBeer(beerID);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{beerID}")
    public ResponseEntity deleteBeer(@PathVariable("beerID") UUID beerID)   {
        beerService.deleteBeer(beerID);
        return new ResponseEntity(HttpStatus.OK);
    }

}
