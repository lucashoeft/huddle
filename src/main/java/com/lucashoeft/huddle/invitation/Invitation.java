package com.lucashoeft.huddle.invitation;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "invitations")
public class Invitation {

    @EmbeddedId
    private InvitationId invitationId;

    private InvitationStatus invitationStatus;

    public Invitation() {
    }

    public Invitation(InvitationId invitationId, InvitationStatus invitationStatus) {
        this.invitationId = invitationId;
        this.invitationStatus = invitationStatus;
    }

    public InvitationId getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(InvitationId invitationId) {
        this.invitationId = invitationId;
    }

    public InvitationStatus getInvitationStatus() {
        return invitationStatus;
    }

    public void setInvitationStatus(InvitationStatus invitationStatus) {
        this.invitationStatus = invitationStatus;
    }
}
