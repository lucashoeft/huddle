package com.lucashoeft.huddle.model;

import com.lucashoeft.huddle.model.Image;
import com.lucashoeft.huddle.model.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    private Long eventId;

    @ManyToOne
    private User eventOwner;
    private String eventName;
    private Double latitude;
    private Double longitude;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imageId", nullable = false)
    private Image image;
    private LocalDateTime creationTime;

    public Event() {
    }

    public Event(Long eventId, User eventOwner, String eventName, Double latitude, Double longitude, String description, Image image, LocalDateTime creationTime) {
        this.eventId = eventId;
        this.eventOwner = eventOwner;
        this.eventName = eventName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.image = image;
        this.creationTime = creationTime;
    }
}
