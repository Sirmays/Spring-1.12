package ru.sirmays.market.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sirmays.market.model.Category;
import ru.sirmays.market.repositories.CategoryRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Optional<Category> findByTitle(String title) {
        return categoryRepository.findByTitle(title);
    }
}
