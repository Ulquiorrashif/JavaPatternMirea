package com.example.asdf.repi;

import com.example.asdf.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RepUser extends CrudRepository<Users,Long> {
    Users findByEmail(String email);

}
