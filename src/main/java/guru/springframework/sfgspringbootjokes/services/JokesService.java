package guru.springframework.sfgspringbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokesService {

    ChuckNorrisQuotes chuck;

    public JokesService() {
        chuck = new ChuckNorrisQuotes();
    }

    public String getRandomQuote() {
        return chuck.getRandomQuote();
    }

}
