package liga.medical.queueconsumer.api;

public interface RabbitConsumerService {

    void logDailyMessage(String message);

    void logAlertMessage(String message);

    void logErrorMessage(String message);
}
