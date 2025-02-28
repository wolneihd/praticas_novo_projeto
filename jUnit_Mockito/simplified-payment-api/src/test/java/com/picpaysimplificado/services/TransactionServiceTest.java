package com.picpaysimplificado.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.picpaysimplificado.repositories.TransactionRepository;

public class TransactionServiceTest {

    @Mock
    private UserService userService;

    @Mock
    private TransactionRepository repository;

    @Mock
    private AuthorizationService authService;

    @Mock
    private NotificationService notificationService;

    @Autowired
    @InjectMocks
    private TransactionService transactionService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    } 

    @Test
    @DisplayName("Should create transaction successfully when Everything is OK")
    void testCreateTransaction1() {

    }

    @Test
    @DisplayName("Should throw Exception then Transaction is not allowed")
    void testCreateTransaction2() {

    }

}
