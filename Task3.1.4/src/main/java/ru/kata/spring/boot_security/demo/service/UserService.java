package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService  extends UserDetailsService {
    public void saveUser(User user);
    public List<User> listUsers();
    public User getUser(Long id);

    public void updateUser(User user);

    public void deleteUser(Long id);

    UserDetails loadUserByUsername(String email);
}
