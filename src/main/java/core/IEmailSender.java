package core;

@FunctionalInterface
public interface IEmailSender {
     void sendEmail(Reservation reservation);
}
