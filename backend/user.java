package boop.backend;

import java.util.List;

public class User {
    
    private Long id;

    private String username;
    private String email;
    private String password;
    private int phone_number;

    
    private List<User> friends;
    
    private Double latitude;
    private Double longitude;
    private Boolean isLocationVisible;

    private List<Classroom> joinedClassrooms;
}
