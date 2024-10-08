package dev.anushka.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getallMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdb){
        return movieRepository.findMovieByImdbId(imdb);
    }

}
