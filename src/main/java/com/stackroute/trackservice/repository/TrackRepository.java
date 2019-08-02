package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {
    @Query(value = "select t from Track t  where t.name = ?1")
   public  List<Track> getTrackByName(String name);
}


