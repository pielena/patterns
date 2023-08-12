package com.github.pielena.patterns.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private String username;
    private String email;
    private String phone;
    private String clientToken;

}
