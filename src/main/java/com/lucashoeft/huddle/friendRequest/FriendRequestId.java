package com.lucashoeft.huddle.friendRequest;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FriendRequestId implements Serializable {

    private Long requestedId;
    private Long requesterId;

    public FriendRequestId() {
    }

    public FriendRequestId(Long requestedId, Long requesterId) {
        this.requestedId = requestedId;
        this.requesterId = requesterId;
    }

    public Long getRequestedId() {
        return requestedId;
    }

    public void setRequestedId(Long requestedId) {
        this.requestedId = requestedId;
    }

    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }
}
