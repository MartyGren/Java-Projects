# Ceilling Fan

To implement the ceiling fan we can create a class CeilingFan that maintains the speed, direction, and includes the logic for handling the pull cords. We'll also need to incorporate a check for December 25th to ensure the fan is off on that day.

Attributes:

`speed`: An integer representing the current speed of the fan (0 to 3).

`isReversed`: A boolean representing the current direction of the fan.

Constructor:

Initializes the fan with speed 0 (off) and direction not reversed.

Methods:

`pullSpeedCord()`: Increments the speed. If the speed is at 3 and the cord is pulled, it resets to 0 (off). It checks if it's December 25th to ensure the fan remains off on that day.

`pullDirectionCord()`: Reverses the direction of the fan. It checks if it's December 25th to ensure the fan remains off on that day.

`isChristmas()`: Checks if today is December 25th.

`getSpeed()`: Returns the current speed. If it's December 25th, it always returns 0.

`isReversed()`: Returns the current direction state.

Main Method:

Demonstrates the usage of the CeilingFan class by pulling the cords and printing the state of the fan.
This implementation ensures that the fan operates according to the specified behavior, including the special condition for December 25th.
