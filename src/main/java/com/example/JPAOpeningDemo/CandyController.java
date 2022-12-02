package com.example.JPAOpeningDemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandyController {

    private CandyService candyService;

    public CandyController(CandyService candyService){
        this.candyService = candyService;
    }

    @GetMapping("/")
    public List<Candy> getCandies(){
        return candyService.getCandies();
    }

    @PostMapping("/")
    public void addCandy(@RequestBody CandyRequest candyRequest){
        candyService.addCandy(candyRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteCandyById(@PathVariable(value = "id") Integer id){
        candyService.deleteById(id);
    }

    @PutMapping("/")
    public void updateCandy(@RequestBody Candy candy){
        candyService.updateCandy(candy);
    }

}
