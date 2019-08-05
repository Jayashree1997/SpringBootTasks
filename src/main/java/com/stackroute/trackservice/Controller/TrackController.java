package com.stackroute.trackservice.Controller;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.trackservice.service.TrackService;
import com.stackroute.trackservice.service.TrackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/")
public class TrackController {
  private TrackServiceImpl trackServiceImpl;

  public TrackController() {

  }

  @Autowired
  public TrackController(TrackService trackService) {
    this.trackServiceImpl = trackServiceImpl;
  }

  @PostMapping("track")
      public ResponseEntity<?> saveUser(@RequestBody Track track) throws TrackAlreadyExistsException {

          return new ResponseEntity<>(trackServiceImpl.saveTrack(track), HttpStatus.OK);
      }

  @GetMapping("track/{id}")
  public ResponseEntity<?> getTrackById(@PathVariable int id){
      System.out.println(id);
      Track retrievedTrack=trackServiceImpl.getTrackById(id);
      return new ResponseEntity<>(retrievedTrack,HttpStatus.OK);
  }
  @GetMapping("track")
  public ResponseEntity<?> getAllTracks() {
    List<Track> retrieveTrack = trackServiceImpl.getAllTracks();
    return new ResponseEntity<>(retrieveTrack, HttpStatus.OK);
  }
  @DeleteMapping("track/{id}")
  public ResponseEntity<?> deleteTrackById(@PathVariable int id){
    Track deleteTrack = trackServiceImpl.deleteTrackById(id);
    return new ResponseEntity<>(deleteTrack,HttpStatus.OK);
  }
  @PutMapping("track/{id}")
  public ResponseEntity<?> updateTrackById(@PathVariable int id,@RequestBody Track track){
    Track updateTrack = trackServiceImpl.updateTrackById(id,track);
    return new ResponseEntity<>(updateTrack,HttpStatus.OK);
  }
  @GetMapping("tracks/{name}")
  public ResponseEntity<?> findByName(@PathVariable String name){
      List<Track> track = trackServiceImpl.findByName(name);
      return new ResponseEntity<>(track, HttpStatus.OK);
    }
  }


