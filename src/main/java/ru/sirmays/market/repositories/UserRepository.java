package ru.sirmays.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sirmays.market.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
