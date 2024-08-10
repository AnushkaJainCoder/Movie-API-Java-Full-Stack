package dev.anushka.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository extends MongoRepository<Review, ObjectId> {

}
