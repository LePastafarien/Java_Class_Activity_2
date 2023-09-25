public class CustomException_OutOfRange extends Exception {
    public CustomException_OutOfRange() {
        this("Input value is not in the specified range of numbers");
    }
    public CustomException_OutOfRange(String msg) {
        super(msg);
    }
}