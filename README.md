                                                    SWIGGY GAME


Introduction

The Game is a turn-based battle game where two players engage in combat until one of them loses all their health points.

                                                    Features:

Players have attributes such as health, strength, and attack.

Players take turns attacking and defending using dice rolls.

Damage calculation is based on attack and defense rolls.

The game ends when one player's health reaches 0.

                                                Requirements:

Java Development Kit (JDK) 21

Maven

Visual Studio Code (VS Code)

                                            Project Structure:

src/main/java: Contains the main source code files (Main.java).

src/test/java: Contains the test source code files (BattleTest.java).

pom.xml: Maven project configuration file.

                                        How to Build and Run:

Importing into VS Code:

Open Visual Studio Code.

Select "File" -> "Open..." and navigate to your project directory.

Ensure you have the Java Extension Pack installed for VS Code.

                                        Running the Game:

Right-click on Main.java (located in src/main/java).

Choose "Run as" -> "Java Application" to start the game.

                                            How to Play:

Two players are created with initial attributes (health, strength, and attack).

Players take turns attacking and defending.

Each player rolls a 6-sided die for attack and defense.

Damage is calculated based on the dice rolls and player attributes.

The game continues until one player's health reaches 0.

                                        Unit Tests:

Unit tests are provided to ensure the correctness of the code. JUnit 4 and libraries are used for testing.


                                    Running Unit Tests:

Open the integrated terminal in VS Code (Ctrl + ).

Navigate to your project directory.

Type mvn test and press Enter to execute the tests.

                                    To run the tests:

                                        mvn test
                                        
This command will run all unit tests configured in the project using Maven.
