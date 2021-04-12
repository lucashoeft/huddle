package com.lucashoeft.huddle.model.friends;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class Friends {

    @EmbeddedId
    private FriendsId friendsId;

    public Friends() {
    }

    public Friends(FriendsId friendsId) {
        this.friendsId = friendsId;
    }

    public FriendsId getFriendsId() {
        return friendsId;
    }

    public void setFriendsId(FriendsId friendsId) {
        this.friendsId = friendsId;
    }
}
