package Exception;

public class ThrowKeyword{
    static void validateAge(int age) throws AgeNotValidException {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            throw new AgeNotValidException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(18);
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}