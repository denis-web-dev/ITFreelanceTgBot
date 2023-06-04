package me.telegram.bot.service;



import lombok.RequiredArgsConstructor;
import me.telegram.bot.model.Reviews;
import me.telegram.bot.repository.ReviewsRepository;

import java.util.List;

@RequiredArgsConstructor
public class ReviewsService {

    private static final ReviewsService INSTANCE = new ReviewsService(
            ReviewsRepository.getInstance()
    );

    private final ReviewsRepository reviewsRepository;

    public List<Reviews> getReviews() {
        return reviewsRepository.getReviews();
    }

    public static ReviewsService getInstance() {
        return INSTANCE;
    }

}