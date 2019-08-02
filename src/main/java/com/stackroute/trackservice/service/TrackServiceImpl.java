package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.repository.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService{
  private TrackRepository trackRepository;
  public TrackServiceImpl(TrackRepository trackRepository){
    this.trackRepository=trackRepository;
  }

  @Override
  public Track saveTrack(Track track) {
    Track savedTrack=trackRepository.save(track);
    return savedTrack;
  }

  @Override
  public Track getTrackById(int id) {
    Track retrieveTrackById=trackRepository.findById(id).get();
    return retrieveTrackById;
  }

  @Override
  public List<Track> getAllTracks() {
    List<Track> retrieveTrack=trackRepository.findAll();
    return retrieveTrack;

  }
  @Override
  public Track deleteTrackById(int id) {
    Optional<Track> optionalTrack= trackRepository.findById(id);
    trackRepository.deleteById(id);
    return optionalTrack.get();
  }
  @Override
  public Track updateTrackById(int id,Track track) {
    Optional<Track> optionalTrack = trackRepository.findById(id);
    Track updateTrack= trackRepository.save(track);
    return updateTrack;
  }




}
