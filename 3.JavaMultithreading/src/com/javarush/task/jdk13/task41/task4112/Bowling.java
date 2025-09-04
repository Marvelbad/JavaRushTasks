package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bowling {
    private final Queue<Track> tracks;
    private final Queue<PairOfShoes> shoesShelf;


    public Bowling(int tracksNumber) {
        this.tracks = IntStream.rangeClosed(1, tracksNumber)
                .mapToObj(i -> new Track(i))
                .collect(Collectors.toCollection(ConcurrentLinkedQueue::new));

        shoesShelf = IntStream.range(0, 50)
                .mapToObj(i -> new PairOfShoes(ThreadLocalRandom.current().nextInt(38, 46)))
                .collect(Collectors.toCollection(() -> new ConcurrentLinkedQueue<>()));
    }

    public synchronized Track acquireTrack() {
        if (tracks.isEmpty()) return null;
        Track track = tracks.poll();
        if (track != null) {
            int price = 100 - tracks.size() * 10;
            track.setPrice(price);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        tracks.offer(track);
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) return null;
        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}


//        IntStream.rangeClosed(1, tracksNumber)
//                .mapToObj(i -> new Track(i))
//                .collect(Collectors.toCollection(
//                        new Supplier<ConcurrentLinkedQueue<Track>>() {
//                            @Override
//                            public ConcurrentLinkedQueue<Track> get() { //() -> new CLQ<>() // CLQ::new
//                                return new ConcurrentLinkedQueue<>();
//                            }
//                        }
//                        ));
