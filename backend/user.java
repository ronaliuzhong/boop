package boop.backend;

import java.util.List;

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
    
    @ManyToMany
    private List<User> friends;
    
    private Double latitude;
    private Double longitude;
    private Boolean isLocationVisible;

    @ManyToMany
    private List<Classroom> joinedClassrooms;
<<<<<<< HEAD
<<<<<<< HEAD
    @ManyToMany
    private List<Group> groups;
    private University university;
    private String major;


=======
>>>>>>> fdb75d09c39c04bdce233bbbac72ffd305daa026
=======
    private 
>>>>>>> 7141ec4ba2584ee52098aaf72c424e023c72c717
}
