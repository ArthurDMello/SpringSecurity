package com.example.springSecurity.model;

public record RegisterDTO (String login, String password, UsersRole role) {
}
