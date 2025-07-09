package excursion_hub.demo.models;

import jakarta.persistence.Entity;

@Entity
public class User extends AbstractUser {
    public User(String firstName, String lastName, String email, String username, String pwHash) {
        super(firstName, lastName, email, username, pwHash);
    }

    public User(String username, String password) {
        super(username, password);
    }

    public User() {
    }
}
