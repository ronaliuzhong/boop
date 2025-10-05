package boop.backend;

import java.util.List;

public class Group {
    
    private Long id;

    private String name;
    private Boolean isPublic;

    @ManyToMany
    private List<User> members;

    @ManyToOne
    private User createdBy;

}
