package boop.backend;

import java.util.List;

public class Group {
    
    private Long id;

    private String name;
    private Boolean isPublic;

    private List<User> members;

    private User createdBy;

}
