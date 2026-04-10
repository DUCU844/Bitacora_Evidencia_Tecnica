package dosw.bitacora.corte2.semana2.notifySystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotification implements NotificationStrategy{

    private static final Logger logger = LoggerFactory.getLogger(EmailNotification.class);

    @Override
    public void send(String message) {
        logger.info("Enviando Email...");
        logger.info("Asunto: Notificación del Sistema");
        logger.info("Cuerpo: {}", message);
        logger.info("Email enviado exitosamente");
    }

    @Override
    public String getChannelName() {
        return "Email";
    }
}
