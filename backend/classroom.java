package boop.backend;

import java.util.List;

public class Classroom {
    
    private Long id;

    private String name;

    @ManyToMany
    private List<User> members;

}
