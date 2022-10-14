package liga.medical.queueconsumer.serviceImpl;

import liga.medical.queueconsumer.api.RabbitConsumerService;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumerServiceImpl implements RabbitConsumerService {

    @Override
    public void logDailyMessage(String message) {
        //some special logic for daily messages
        System.out.println(String.format("Message [%s] received from queue for daily messages.", message));
    }

    @Override
    public void logAlertMessage(String message) {
        //some special logic for alert messages
        System.out.println(String.format("Alert!!! Message [%s] received from queue for alert messages.", message));
    }

    @Override
    public void logErrorMessage(String message) {
        //some special logic for error messages
        System.out.println(String.format("Error! Message [%s] received from queue for error messages.", message));
    }
}
