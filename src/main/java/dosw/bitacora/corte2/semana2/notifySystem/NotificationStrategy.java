package dosw.bitacora.corte2.semana2.notifySystem;

/**
 * Strategy Interface - Define el contrato para todas las estrategias de notificación.
 * Cada implementación representa un canal diferente de envío.
 */
public interface NotificationStrategy {

    /**
     * Envía una notificación usando el canal específico de la estrategia.
     * Send notify using specific channel
     *
     * @param message El mensaje a enviar
     */
    void send(String message);

    /**
     * Obtiene el nombre del canal de notificación.
     * Obtain name to notify channel
     *
     * @return Nombre del canal (Email, SMS, Push)
     */
    String getChannelName();


}
