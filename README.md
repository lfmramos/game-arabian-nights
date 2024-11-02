## Java Fantasy Lamp Simulation

This repository contains code for a fun and imaginative Java simulation of magic lamps and genies.

**The Classes:**

* **MagicLamp.java:** This class represents a magical lamp with a limited number of genies it can release. It keeps track of released genies, recharges (when a recyclable demon is used), and can compare itself to another lamp.
* **Genie.java:** This is the base class for all genies. It holds the maximum number of wishes it can grant and the number of wishes already granted. It also provides methods to check if wishes are available and grant wishes (with limitations).
* **FriendlyGenie.java:** This subclass of Genie represents a friendly genie who grants all the wishes within its limit.
* **GrumpyGenie.java:** This subclass represents a grumpy genie who only grants one wish.
* **RecyclableDemon.java:** This subclass represents a special genie that cannot grant wishes but allows the lamp to be recharged (resetting the release count) when recycled.

**The Main Program (Main.java):**

This program demonstrates the functionalities of the lamp and genie classes. It creates two magic lamps with different maximum genie capacities. It then rubs the lamps multiple times, encountering different genie types based on the lamp's state and the number of rubs. The program also demonstrates genie wish granting and lamp recharging using a recyclable demon. Finally, it compares the two lamps to see if they are in the same state.

**Running the Simulation:**

1. Clone this repository or download the source code files.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java classes using a command like `javac *.java` (replace with your compiler command if needed).
4. Run the program with `java Main`.

**Expected Output:**

The program will simulate rubbing the lamps, encountering different genies, granting wishes (with limitations), and recharging a lamp using a recyclable demon. Finally, it will show a message indicating whether the two lamps are in the same state.

**Note:**

This code is for entertainment and educational purposes. It demonstrates basic object-oriented concepts and inheritance in Java.

**Next Steps:**

* You can modify the program to allow setting the maximum wishes for friendly genies.
* Add functionalities to the genie classes to represent different types of wishes they can grant.
* Consider implementing a user interface for interacting with the lamps and genies.

This repository provides a starting point for exploring object-oriented programming and creating imaginative simulations in Java. Feel free to experiment and extend the code to create your own magical adventures.
