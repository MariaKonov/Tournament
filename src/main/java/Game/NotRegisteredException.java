package Game;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String s) {
        super("Игрок не найден");
    }
}
