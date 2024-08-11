package dev.anushka.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Reviews, ObjectId> {
//    Optional<Reviews> findMovieByImdbId(String imdbId);
}

