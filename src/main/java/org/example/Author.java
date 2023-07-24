package org.example;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class Author {
    @Setter(AccessLevel.PROTECTED)
    private String firstName;

    private String lastName;

    private String biography;

}
