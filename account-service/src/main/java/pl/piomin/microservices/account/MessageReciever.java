package pl.piomin.microservices.account;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class MessageReciever {
    private CountDownLatch latch = new CountDownLatch(1);

    public void recieveMessage(String message) {
        System.out.println("Recieved: " + message);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
