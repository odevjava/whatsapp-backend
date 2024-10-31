package fr.odevjava.whatsapp_clone_back.messaging.domain.user.aggregate;

import fr.odevjava.whatsapp_clone_back.messaging.domain.user.vo.*;
import fr.odevjava.whatsapp_clone_back.shared.error.domain.Assert;
import org.jilt.Builder;

import java.time.Instant;
import java.util.Set;

@Builder
public class User {

    private UserLastName lastName;

    private UserFirstName firstName;

    private UserEmail email;

    private UserPublicId publicId;

    private UserImageUrl imageUrl;

    private Instant lastModifiedDate;

    private Instant createdDate;

    private Instant lastSeen;

    private Set<Authority> authorities;

    private Long dbId;

    public User(UserLastName lastName, UserFirstName firstName, UserEmail email,
                UserPublicId publicId, UserImageUrl imageUrl, Instant lastModifiedDate,
                Instant createdDate, Instant lastSeen, Set<Authority> authorities, Long dbId) {
        assertMandatoryFields(lastName, firstName, email, authorities);
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.publicId = publicId;
        this.imageUrl = imageUrl;
        this.lastModifiedDate = lastModifiedDate;
        this.createdDate = createdDate;
        this.lastSeen = lastSeen;
        this.authorities = authorities;
        this.dbId = dbId;
    }

    private void assertMandatoryFields(UserLastName lastName, UserFirstName firstName,
                                       UserEmail userEmail, Set<Authority> authorities) {

        Assert.notNull("lastName", lastName);

    }

    public void updateFromUser(User user) {
        this.email = user.email;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.imageUrl = user.imageUrl;
    }

    public void initFieldForSignup(){
        this.lastSeen = Instant.now();
    }

    public UserLastName getLastName() {
        return lastName;
    }

    public UserFirstName getFirstName() {
        return firstName;
    }

    public UserEmail getEmail() {
        return email;
    }

    public UserPublicId getPublicId() {
        return publicId;
    }

    public UserImageUrl getImageUrl() {
        return imageUrl;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public Instant getLastSeen() {
        return lastSeen;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Long getDbId() {
        return dbId;
    }
}
