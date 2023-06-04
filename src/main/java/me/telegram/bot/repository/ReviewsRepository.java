package me.telegram.bot.repository;

        import com.fasterxml.jackson.databind.JsonNode;
        import com.fasterxml.jackson.databind.ObjectMapper;
        import lombok.RequiredArgsConstructor;
        import lombok.SneakyThrows;
        import me.telegram.bot.config.ObjectMapperConfig;
        import me.telegram.bot.model.Reviews;

        import java.io.InputStream;
        import java.util.ArrayList;
        import java.util.List;

@RequiredArgsConstructor
public class ReviewsRepository {
    private static final ReviewsRepository INSTANCE = new ReviewsRepository(
            ObjectMapperConfig.getInstance()
    );
    private final ObjectMapper objectMapper;
    @SneakyThrows
    public List<Reviews> getReviews() {
        List<Reviews> reviews = new ArrayList<>();
        try (InputStream reviewsStream = getClass().getClassLoader()
                .getResourceAsStream("reviews.json")) {
            JsonNode rootNode = objectMapper.readTree(reviewsStream);
            if (rootNode.hasNonNull("reviews")) {
                JsonNode reviewsNode = rootNode.get("reviews");
                reviews.addAll(List.of(objectMapper.convertValue(reviewsNode, Reviews[].class)));
            }
        }
        return reviews;
    }
    public static ReviewsRepository getInstance() {
        return INSTANCE;
    }
}