package com.lucashoeft.huddle.model.invitation;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InvitationId implements Serializable {

    private Long eventId;
    private Long inviteeId;

    public InvitationId() {
    }

    public InvitationId(Long eventId, Long inviteeId) {
        this.eventId = eventId;
        this.inviteeId = inviteeId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(Long inviteeId) {
        this.inviteeId = inviteeId;
    }
}
