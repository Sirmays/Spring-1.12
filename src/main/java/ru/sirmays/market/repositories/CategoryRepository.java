package ru.sirmays.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sirmays.market.model.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByTitle(String title);
}
