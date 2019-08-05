package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TrackRepository extends MongoRepository<Track, Integer> {
    //@Query(value = "select t from Track t  where t.name = ?1")
   List<Track>  findByName(String name);
}


