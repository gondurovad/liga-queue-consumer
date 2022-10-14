package liga.medical.queueconsumer.service;

import liga.medical.medicalmonitoring.dto.QueueNames;
import liga.medical.queueconsumer.api.RabbitConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitQueueListener {

    private final RabbitConsumerService rabbitConsumerService;

    public RabbitQueueListener(RabbitConsumerService rabbitConsumerService) {
        this.rabbitConsumerService = rabbitConsumerService;
    }

    @RabbitListener(queues = QueueNames.DAILY_QUEUE_NAME)
    public void receiveDailyMessage(String message) {
        rabbitConsumerService.logDailyMessage(message);
    }

    @RabbitListener(queues = QueueNames.ALERT_QUEUE_NAME)
    public void receiveAlertMessage(String message) {
        rabbitConsumerService.logAlertMessage(message);
    }

    @RabbitListener(queues = QueueNames.ERROR_QUEUE_NAME)
    public void receiveErrorMessage(String message) {
        rabbitConsumerService.logErrorMessage(message);
    }
}
