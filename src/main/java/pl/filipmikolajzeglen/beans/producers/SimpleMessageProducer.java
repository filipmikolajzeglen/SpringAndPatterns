package pl.filipmikolajzeglen.beans.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.filipmikolajzeglen.beans.printers.Message;

@Component
@Message(type = Message.MessageType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

    @Autowired
    @Qualifier("randomNumber")
    private int random;

    @Override
    public String getMessage() {
        return "Simple Message: " + this + " : " + random;
    }
}