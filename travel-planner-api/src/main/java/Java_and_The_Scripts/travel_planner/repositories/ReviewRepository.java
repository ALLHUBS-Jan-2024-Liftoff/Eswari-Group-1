package Java_and_The_Scripts.travel_planner.repositories;

import Java_and_The_Scripts.travel_planner.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByActivityId(Long activityId);


}