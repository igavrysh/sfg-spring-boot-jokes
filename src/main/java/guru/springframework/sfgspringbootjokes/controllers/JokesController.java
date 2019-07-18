package guru.springframework.sfgspringbootjokes.controllers;

import guru.springframework.sfgspringbootjokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {

        model.addAttribute("joke", jokesService.getRandomQuote());

        return "chucknorris";
    }

}
