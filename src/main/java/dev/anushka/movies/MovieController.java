package dev.anushka.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity allMovies(){
        return new ResponseEntity("All movies", HttpStatus.OK);
    }
}
