package com.lucashoeft.huddle.controller;

import com.lucashoeft.huddle.model.Event;
import com.lucashoeft.huddle.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public void createEvent(@RequestBody Event newEvent) {
        eventService.createEvent(newEvent);
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @GetMapping(path = "{eventId}")
    public Event getEventById(@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }

    @GetMapping(path = "by-user/{userId}")
    public List<Event> getEventsByUser(@PathVariable Long userId) {
        return eventService.getEventsByUser(userId);
    }
}
