package com.lucashoeft.huddle.friendRequest;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "friendRequest")
public class FriendRequest {

    @EmbeddedId
    private FriendRequestId friendRequestId;
    private LocalDateTime localDateTime;

    public FriendRequest() {
    }

    public FriendRequest(FriendRequestId friendRequestId, LocalDateTime localDateTime) {
        this.friendRequestId = friendRequestId;
        this.localDateTime = localDateTime;
    }

    public FriendRequestId getFriendRequestId() {
        return friendRequestId;
    }

    public void setFriendRequestId(FriendRequestId friendRequestId) {
        this.friendRequestId = friendRequestId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
