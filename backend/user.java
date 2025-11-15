package backend;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public class User {
    
    private Long id;

    private String username;
    private String email;
    private String password;
    private int phone_number;

    private String firstName;
    private String lastName;
    private String bio;
    private String profilePictureUrl;
    
    private List<User> friends;
    
    private Double latitude;
    private Double longitude;
    private Boolean isLocationVisible;

    private List<Classroom> joinedClassrooms;

    private List<Group> groups;
    private University university;
    private String major;

    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    }


}
