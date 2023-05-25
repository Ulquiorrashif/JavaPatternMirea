package com.example.asdf;

import com.example.asdf.entity.Users;
import com.example.asdf.repi.RepUser;
import com.example.asdf.service.UserServicce;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@RequiredArgsConstructor
class UserServiceImplTest {
//    private  final PasswordEncoder passen;
    @Mock
    private RepUser userRepository;
    @Captor
    ArgumentCaptor<Users> captor;
    @Test
    void getUsers() {
        Users user = new Users();
        user.setEmail("Vasya");
        Users user2 = new Users();
        user2.setEmail("Dima");
        Mockito.when(userRepository.findAll()).thenReturn(List.of(user,
                user2));
        UserServicce userService = new
                UserServicce(userRepository,new BCryptPasswordEncoder(8));


        Assertions.assertEquals("Vasya",
                userService.getUsers().get(0).getEmail());
    }
    @Test
    void saveOrUpdate() {
        Users user = new Users();
        user.setEmail("Vitya");
        UserServicce userService = new
                UserServicce(userRepository,new BCryptPasswordEncoder(8));
        userService.createUser(user);
        Mockito.verify(userRepository).save(captor.capture());
        Users captured = captor.getValue();
        Assertions.assertEquals("Vitya", captured.getEmail());
    }
}
