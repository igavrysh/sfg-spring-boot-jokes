package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokesService;

    @Autowired
    public JokesController(JokeService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
