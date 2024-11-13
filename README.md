# Magic Lamp Simulator

A Java implementation of a magical lamp system that simulates the interaction between magical lamps and different types of genies.

## Overview

This project implements a fantasy-based object-oriented system where users can interact with magic lamps that produce different types of genies. Each genie has unique characteristics and wish-granting capabilities.

## Classes

### MagicLamp
The main container class that manages genie creation and lamp functionality.
- Can be initialized with a maximum number of genies it can release
- Produces different types of genies based on certain conditions
- Keeps track of how many genies have been released
- Can be recharged by recycling a demon
- Supports comparison with other lamps

### Genie (Base Class)
The parent class for all genie types with basic wish-granting functionality.
- Initialized with a maximum number of wishes it can grant
- Tracks granted wishes
- Provides wish-granting verification

### Genie Types

#### FriendlyGenie
- Extends the base Genie class
- Grants multiple wishes as specified during creation
- Released when the lamp is rubbed an even number of times

#### GrumpyGenie
- Extends the base Genie class
- Only grants exactly one wish
- Released when the lamp is rubbed an odd number of times

#### RecyclableDemon
- Extends the base Genie class
- Released when the lamp has exceeded its maximum genie limit
- Can be recycled to recharge the lamp
- Cannot grant wishes after being recycled

## Features

- Dynamic genie creation based on lamp usage
- Wish-granting system with limits
- Lamp recharging mechanism
- Lamp comparison functionality

## Usage Example

```java
// Create a magic lamp with maximum 2 genies
MagicLamp lamp = new MagicLamp(2);

// Rub the lamp to get a genie (first rub - will be a GrumpyGenie)
Genie genie1 = lamp.rub(5);
genie1.grantsWishes(); // Can only grant one wish

// Rub again (second rub - will be a FriendlyGenie)
Genie genie2 = lamp.rub(3);
genie2.grantsWishes(); // Can grant multiple wishes

// Third rub will produce a RecyclableDemon since max genies is exceeded
Genie demon = lamp.rub(5);

// Recycle the demon to recharge the lamp
lamp.recyclesGenie(demon);
```

## Class Hierarchy

```
Genie (Base Class)
├── FriendlyGenie
├── GrumpyGenie
└── RecyclableDemon
```

## Technical Details

- Written in Java
- Uses inheritance and polymorphism for genie types
- Implements type checking for recycling mechanism
- Package: `io.codeforall.fanstatics`

## Design Patterns

- Factory Pattern: Used in the `MagicLamp` class for creating different types of genies
- Template Pattern: Base `Genie` class defines the structure for specific genie types
- Strategy Pattern: Different wish-granting behaviours for each genie type

## Limitations

- Once a genie is created, its maximum wishes cannot be modified
- RecyclableDemon can only be recycled once
- GrumpyGenie is hard coded to grant exactly one wish
