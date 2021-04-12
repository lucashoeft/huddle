package com.lucashoeft.huddle.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {

    @Id
    private Long imageId;
    private String imageUrl;

    @OneToOne(mappedBy = "image")
    private Event event;

    public Image() {
    }

    public Image(Long imageId, String imageUrl) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
    }

    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
