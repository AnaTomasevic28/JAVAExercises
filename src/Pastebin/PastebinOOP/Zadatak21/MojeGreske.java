package Pastebin.PastebinOOP.Zadatak21;

public class MojeGreske {
    //Inner-class -> unutrasnje klase

    public static class EmptyStringException extends Exception{
        public EmptyStringException() {
        }

        public EmptyStringException(String message) {
            super(message);
        }

        public EmptyStringException(String message, Throwable cause) {
            super(message, cause);
        }

        public EmptyStringException(Throwable cause) {
            super(cause);
        }
    }

    public static class NonDefinedCurrancyException extends Exception{
        public NonDefinedCurrancyException() {
        }

        public NonDefinedCurrancyException(String message) {
            super(message);
        }

        public NonDefinedCurrancyException(String message, Throwable cause) {
            super(message, cause);
        }

        public NonDefinedCurrancyException(Throwable cause) {
            super(cause);
        }
    }

    public static class AlreadyInArrayException extends Exception{
        public AlreadyInArrayException() {
        }

        public AlreadyInArrayException(String message) {
            super(message);
        }

        public AlreadyInArrayException(String message, Throwable cause) {
            super(message, cause);
        }

        public AlreadyInArrayException(Throwable cause) {
            super(cause);
        }
    }
}
