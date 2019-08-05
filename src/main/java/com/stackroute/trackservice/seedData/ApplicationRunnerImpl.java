//package com.stackroute.trackservice.seedData;
//import com.stackroute.trackservice.domain.Track;
//import com.stackroute.trackservice.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationRunnerImpl  implements ApplicationListener {
//    @Value("${track.id}")
//    private int id;
//    @Value("${track.name}")
//    private String name;
//    @Value("${track.comments}")
//    private String comments;
//    Track track=new Track();
//    private TrackRepository trackRepository;
//
//    @Autowired
//    public ApplicationRunnerImpl(TrackRepository trackRepository) {
//        this.trackRepository = trackRepository;
//    }
//
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//        track.setId(id);
//        track.setName(name);
//        track.setComments(comments);
//        trackRepository.save(track);
////        Track track1=new Track(78,"abc","xyz");
////        trackRepository.save(track1);
////        Track track2=new Track(79,"gbh","klk");
////        trackRepository.save(track2);
////        Track track3=new Track(80,"mnb","vbc");
////        trackRepository.save(track3);
//    }
//}
//
