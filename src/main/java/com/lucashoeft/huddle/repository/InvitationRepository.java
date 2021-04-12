package com.lucashoeft.huddle.repository;

import com.lucashoeft.huddle.model.invitation.Invitation;
import com.lucashoeft.huddle.model.invitation.InvitationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, InvitationId> {
}
