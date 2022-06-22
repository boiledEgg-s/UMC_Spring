package com.example.demo.src.auth.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PostLoginReq {
    private String email;
    private String pwd;
}