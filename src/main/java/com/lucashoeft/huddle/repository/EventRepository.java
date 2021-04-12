package com.lucashoeft.huddle.repository;

import com.lucashoeft.huddle.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findEventsByEventOwner_UserId(Long userId);
}
