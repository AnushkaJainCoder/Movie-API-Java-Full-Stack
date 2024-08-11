package dev.anushka.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    private MovieRepository movieRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Reviews createReview(String reviewBody, String imdbId){
        Reviews rev = reviewRepository.insert(new Reviews(reviewBody));


        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(rev)).first();
        return rev;

    }

//    public List<Reviews> getReviewsByImdbId(String imdbId){
//        Optional<Movie> movieOpt = movieRepository.findMovieByImdbId(imdbId);
//        if(movieOpt.isPresent()){
//            Movie movie = movieOpt.get();
//            return movie.getReviewIds();
//        }
//        return List.of();
//    }

//    public Optional<Reviews> singleMovie(String imdb){
//        return reviewRepository.findMovieByImdbId(imdb);
//    }
}
