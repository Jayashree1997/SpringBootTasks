package com.stackroute.trackservice.Controller;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.service.TrackService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1")
public class TrackController {
  private TrackService trackService;

  public TrackController() {

  }

  @Autowired
  public TrackController(TrackService trackService) {
    this.trackService = trackService;
  }

  @PostMapping("track")
  public ResponseEntity<?> saveTrack(@RequestBody Track track) {
    Track savedTrack = trackService.saveTrack(track);
    return new ResponseEntity<>(savedTrack, HttpStatus.OK);
  }

  @GetMapping("track/{id}")
  public ResponseEntity<?> getTrackById(@PathVariable int id) {
    System.out.println(id);
    Track retrivedTrackById = trackService.getTrackById(id);
    return new ResponseEntity<Track>(retrivedTrackById, HttpStatus.OK);
  }



  @GetMapping("track")
  public ResponseEntity<?> getAllTracks() {
    List<Track> retrieveTrack = trackService.getAllTracks();
    return new ResponseEntity<>(retrieveTrack, HttpStatus.OK);
  }

  @DeleteMapping("track/{id}")
  public ResponseEntity<?> deleteTrackById(@PathVariable int id){
    Track deleteTrack = trackService.deleteTrackById(id);
    return new ResponseEntity<>(deleteTrack,HttpStatus.OK);
  }
  @PutMapping("track/{id}")
  public ResponseEntity<?> updateTrackById(@PathVariable int id,@RequestBody Track track){
    Track updateTrack = trackService.updateTrackById(id,track);
    return new ResponseEntity<>(updateTrack,HttpStatus.OK);
  }

}
