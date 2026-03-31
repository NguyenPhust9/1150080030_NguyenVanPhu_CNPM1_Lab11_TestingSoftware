package demo;

public class JUnitMessage {
    private String message;

    // ✅ Constructor nhận String
    public JUnitMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
        int divide = 1 / 0;
    }

    public String printHiMessage() {
        message = "Hi!" + message;
        return message;
    }
}
