package andriyklus.footballmanager.exception;

public class TransferSameTeamException extends RuntimeException {
    public TransferSameTeamException(String message) {
        super(message);
    }
}