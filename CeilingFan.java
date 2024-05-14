import java.time.LocalDate;

public class CeilingFan {

    private int speed;
    private boolean isReversed;

    public CeilingFan() {
        this.speed = 0;  // Fan is initially off
        this.isReversed = false;  // Initial direction is not reversed
    }

    // Method to handle the speed cord pull
    public void pullSpeedCord() {
        if (isChristmas()) {
            return;  // On December 25th, the fan should remain off
        }

        speed = (speed + 1) % 4;  // Cycle through speeds 0 to 3
    }

    // Method to handle the direction cord pull
    public void pullDirectionCord() {
        if (isChristmas()) {
            return;  // On December 25th, the fan should remain off
        }

        isReversed = !isReversed;  // Toggle the direction
    }

    // Method to check if today is December 25th
    private boolean isChristmas() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == 12 && today.getDayOfMonth() == 25;
    }

    // Getter methods for testing or external use
    public int getSpeed() {
        if (isChristmas()) {
            return 0;  // On December 25th, always return speed as 0
        }
        return speed;
    }

    public boolean isReversed() {
        return isReversed;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();

        fan.pullSpeedCord();  // Speed: 1
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());

        fan.pullSpeedCord();  // Speed: 2
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());

        fan.pullDirectionCord();  // Direction: reversed
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());

        fan.pullSpeedCord();  // Speed: 3
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());

        fan.pullSpeedCord();  // Speed: 0 (off)
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());

        fan.pullDirectionCord();  // Direction: not reversed
        System.out.println("Speed: " + fan.getSpeed() + ", Direction Reversed: " + fan.isReversed());
    }
}
