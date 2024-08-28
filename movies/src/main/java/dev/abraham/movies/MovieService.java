package dev.abraham.movies;

import dev.abraham.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String id){
        return movieRepository.findMovieByImdbId(id);
    }
}
