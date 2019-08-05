//package com.stackroute.trackservice.seedData;
//
//import com.stackroute.trackservice.domain.Track;
//import com.stackroute.trackservice.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CommandLineListenerImpl implements CommandLineRunner {
//    private TrackRepository trackRepository;
//@Autowired
//    public CommandLineListenerImpl(TrackRepository trackRepository) {
//        this.trackRepository = trackRepository;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        Track track1=new Track(78,"abc","xyz");
//        trackRepository.save(track1);
//        Track track2=new Track(79,"gbh","klk");
//        trackRepository.save(track2);
//        Track track3=new Track(80,"mnb","vbc");
//        trackRepository.save(track3);
//
//
//    }
//}
