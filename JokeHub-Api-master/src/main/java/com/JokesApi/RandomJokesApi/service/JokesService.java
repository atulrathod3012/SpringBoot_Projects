package com.JokesApi.RandomJokesApi.service;

import com.JokesApi.RandomJokesApi.model.Jokes;
import com.JokesApi.RandomJokesApi.repository.JokesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JokesService {
//  Random randomNumber =new Random();
//  int num= randomNumber.nextInt(16)+1;

    @Autowired
    private JokesRepository repository;

    public Jokes getRandomJoke(){
        return repository.findRandomJoke().orElse(null);
    }



}
