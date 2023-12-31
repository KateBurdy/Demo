package com.example.payments.repositories;

import com.example.payments.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository <Payment, UUID> {
    Optional<Payment> findByUserIdAndOrderId(UUID userId, UUID orderId);
}
