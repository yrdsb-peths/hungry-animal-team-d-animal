public class Cherry extends Food {

    public Coin() {
        // Automatically set image based on class name
        speed = 1;  // Default speed
    }

    @Override
    public int getScoreValue() {
        return 5;  // Carry increases score by 5
    }
}
