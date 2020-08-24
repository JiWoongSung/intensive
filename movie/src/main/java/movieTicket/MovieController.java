package movieTicket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


 @RestController
 public class MovieController {

  @Autowired
  PolicyHandler policyHandler;

  @GetMapping("/samples")
  public List<Movie> sampleController() {
   return policyHandler.findAll();
  }

  @PostMapping("/movies")
  public Long saveController(@RequestBody MovieSaveRequestDto movieSaveRequestDto) {
   System.out.println(movieSaveRequestDto.getMovieName());
   System.out.println(movieSaveRequestDto.getRunTime());
    return Long.valueOf(1);
  }
 }
