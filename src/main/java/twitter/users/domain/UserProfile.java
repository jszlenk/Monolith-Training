package twitter.users.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserProfile {

    @Id
    @GeneratedValue
    UUID id;
    String firstName;
    String lastName;
    String email;
    Object lastActivity;

    public UserProfile(UUID id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        lastActivity = null;
    }
}
