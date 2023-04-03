public class MistakeTypeException extends Exception{
    public MistakeTypeException(String type) {
        super(String.format("Type %s is not comparable", type));
    }
}