package com.example.JPAOpeningDemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandyService {

    private CandyRepository candyRepository;

    public CandyService(CandyRepository candyRepository){
        this.candyRepository = candyRepository;
    }
    public List<Candy> getCandies() {
        return candyRepository.findAll();
    }

    public void addCandy(CandyRequest candyRequest) {
        Candy candyToAdd = new Candy();
        candyToAdd.setFlavor(candyRequest.flavor());
        candyToAdd.setName(candyRequest.name());
        candyToAdd.setPrice(candyRequest.price());
        candyRepository.save(candyToAdd);
    }

    public void deleteById(Integer id) {
        candyRepository.deleteById(id);
    }

    public void updateCandy(Candy candy) {
        if(candyRepository.existsById(candy.getId()))
        {
            candyRepository.save(candy);
        }
    }
}
