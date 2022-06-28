package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.ls.LSOutput;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator{
    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // == Fields ==
    @Autowired
    private Game game;
    private int guessCount = 10;

    // == Init ==
    @PostConstruct
    public void init() {
        log.debug("game = {}", game);
    }

    // == Public methods ==
    @Override
    public String getMainMessage() {
        return "Calling getMainMessage method";
    }

    @Override
    public String getResultMessage() {
        return "Calling getResultMessage method";
    }
}
