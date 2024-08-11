package dev.anushka.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/Reviews/")
@RestController
@RequestMapping("/api/vi/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Reviews>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
//
//    @GetMapping("/movie/{imdbId}")
//    public ResponseEntity<List<Reviews>> getReviewsByMovieId(@PathVariable String imdbId) {
//        List<Reviews> reviews = reviewService.getReviewsByImdbId(imdbId);
//        return new ResponseEntity<>(reviews, HttpStatus.OK);
//    }
//    public ResponseEntity<Optional<Reviews>> getSingleMovie(@PathVariable String imdbId){
//        return new ResponseEntity<Optional<Reviews>>(reviewService.singleMovie(imdbId), HttpStatus.OK);
//    }


}
