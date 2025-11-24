package com.JokesApi.RandomJokesApi.repository;

import com.JokesApi.RandomJokesApi.model.Jokes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface JokesRepository extends JpaRepository<Jokes ,Integer> {
    @Query(value = "SELECT * FROM jokes ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Jokes> findRandomJoke();


}
