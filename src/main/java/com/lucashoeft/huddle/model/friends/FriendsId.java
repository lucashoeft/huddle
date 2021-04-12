package com.lucashoeft.huddle.model.friends;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FriendsId implements Serializable {

    private Long friendsId;
    private Long userId;

    public FriendsId() {
    }

    public FriendsId(Long friendsId, Long userId) {
        this.friendsId = friendsId;
        this.userId = userId;
    }

    public Long getFriendsId() {
        return friendsId;
    }

    public void setFriendsId(Long friendsId) {
        this.friendsId = friendsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
