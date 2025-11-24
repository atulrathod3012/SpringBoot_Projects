package com.JokesApi.RandomJokesApi.controller;

import com.JokesApi.RandomJokesApi.model.Jokes;
import com.JokesApi.RandomJokesApi.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Joke")
public class JokesController {

    @Autowired
    private JokesService jokesService;



    @GetMapping("/random")
    public ResponseEntity<Jokes> getRandomJoke(){
        Jokes joke=jokesService.getRandomJoke();
        if (joke!=null){
            return new ResponseEntity<>(joke, HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>(joke,HttpStatus.NOT_FOUND);
        }




    }
}
