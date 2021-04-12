package com.lucashoeft.huddle.service;

import com.lucashoeft.huddle.model.Event;
import com.lucashoeft.huddle.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEventsByUser(Long userId) {
        return eventRepository.findEventsByEventOwner_UserId(userId);
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public void createEvent(Event newEvent) {
        eventRepository.save(newEvent);
    }

    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }
}
