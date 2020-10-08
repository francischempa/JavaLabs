package Exceptions_labs;

public class TradeIDException extends Exception {
    public TradeIDException() {
    }

    public TradeIDException(String message) {
        super(message);
    }

    public TradeIDException(String message, Throwable cause) {
        super(message, cause);
    }

    public TradeIDException(Throwable cause) {
        super(cause);
    }

    public TradeIDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
