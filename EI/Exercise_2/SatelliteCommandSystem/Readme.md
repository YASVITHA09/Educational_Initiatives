# Satellite Command System 🛰️

## Overview
Welcome to the Satellite Command System project! This Java-based application simulates controlling a satellite in orbit. The satellite starts in a default initial state and can accept a series of commands to change its orientation, control solar panels, and collect data. This project emphasizes Object-Oriented Programming (OOP), SOLID principles, Command Design Pattern, logging, and robust software design practices.

## Features
- **Satellite Initialization:** Starts with default orientation, solar panel status, and data collected.
- **Satellite Commands:** Supports commands to rotate, activate/deactivate solar panels, and collect data.
- **Conditional Data Collection:** Satellite collects data only when solar panels are active.
- **Logging & Error Handling:** Logs state changes, warnings, and exceptions during command execution.
- **Design Patterns:** Implements the Command Pattern for flexibility and maintainability.
- **State Management:** Maintains and updates satellite state consistently across commands.

## Key Components

### Satellite
Represents the satellite with attributes:
- Orientation (`North` by default)
- Solar Panels (`Inactive` by default)
- Data Collected (`0` by default)

Encapsulates behavior for changing orientation, controlling solar panels, and collecting data.

### Commands
Encapsulates satellite operations using the **Command Pattern**:
- `RotateCommand` — Changes satellite orientation (`North`, `South`, `East`, `West`)
- `ActivatePanelsCommand` — Activates solar panels
- `DeactivatePanelsCommand` — Deactivates solar panels
- `CollectDataCommand` — Increments data collected by 10 units if solar panels are active

### SatelliteController
Invoker that stores and executes commands in a sequential manner. Ensures proper execution order and error handling.

### Logging
Uses Java's built-in logging to log state changes, warnings, and errors during command execution.

## Design Patterns
- **Command Pattern:** Encapsulates operations (rotate, activate, deactivate, collect data) as objects for flexibility.
- **SOLID Principles:** 
  - Single Responsibility: Each class has a focused responsibility.
  - Open/Closed: Easy to extend by adding new commands without modifying existing code.
  - Dependency Inversion: Commands depend on abstractions (`Satellite`).
- **OOP Principles:** Encapsulation, modularity, and maintainability applied across the system.

## Example

### Commands to Execute:
```text
rotate(South)
activatePanels()
collectData()
rotate(East)
collectData()
deactivatePanels()
Output:
text
Copy code
Final Satellite State:
Orientation: East
Solar Panels: Inactive
Data Collected: 20
Code Structure
bash
Copy code
SatelliteCommandSystem/
├── src/
│   ├── models/                  # Satellite model class
│   │   └── Satellite.java
│   ├── commands/                # Command interface and implementations
│   │   ├── Command.java
│   │   ├── RotateCommand.java
│   │   ├── ActivatePanelsCommand.java
│   │   ├── DeactivatePanelsCommand.java
│   │   └── CollectDataCommand.java
│   ├── invoker/                 # SatelliteController (Invoker)
│   │   └── SatelliteController.java
│   └── Main.java                # Entry point of the application
└── out/                         # Compiled .class files
How to Compile and Run
Open terminal in the project root folder SatelliteCommandSystem.

Compile all Java files:

bash
Copy code
javac -d out src/models/*.java src/commands/*.java src/invoker/*.java src/Main.java
Run the program:

bash
Copy code
java -cp out Main