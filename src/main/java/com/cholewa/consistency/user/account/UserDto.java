package com.cholewa.consistency.user.account;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Date created;
    private boolean isParent;
}
