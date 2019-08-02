package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.exceptions.TrackAlreadyExistsException;
import com.stackroute.trackservice.exceptions.TrackNotFoundException;

import java.util.List;


public interface TrackService {
  public Track saveTrack(Track track) throws TrackAlreadyExistsException;
  public Track getTrackById(int id);
  public List<Track> getAllTracks();
  public Track deleteTrackById(int id);
  public Track updateTrackById(int id,Track track);
  public List<Track> getTrackByName(String name);
}
