package bending;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            // Example usage
            Voter voter1 = new Voter(1, "John Doe", 20);
            System.out.println("Voter created successfully.");
            
            // Uncomment the line below to see the exception being thrown
            // Voter voter2 = new Voter(2, "Jane Doe", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}