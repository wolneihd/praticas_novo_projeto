package com.picpaysimplificado.repositories;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.domain.user.UserType;
import com.picpaysimplificado.dtos.UserDTO;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.persistence.EntityManager;

@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("Should get User successfully from DB")
    void findUserByDocumentCase1() {       
        UserDTO data = new UserDTO(
            "Rodrigo", 
            "Almeida", 
            "123456", 
            new BigDecimal(10), 
            "rodrigo@teste.com.br", 
            "4444", 
            UserType.COMMON
            );
        this.createUser(data);

        Optional<User> result = this.userRepository.findUserByDocument(data.document());

        assertThat(result.isPresent()).isTrue();
    }

    private User createUser(UserDTO data) {
        User newUser = new User(data);
        this.entityManager.persist(newUser);
        return newUser;        
    }
}
