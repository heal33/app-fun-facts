package io.maddux.funfacts;

import java.util.Random;

/**
 * Created by babodxll on 10/27/2015.
 */
public class FactBook {

    //Member variable (properties about the object)
    public String[] mFacts = {
            "All of the Boeing 747s have traveled a collective 35 billion miles. That’s equivalent to 75,000 trips to the moon and back!",
            "Every day, there are approximately 200,000 flights around the world.",
            "Food tastes different under pressure (like in an airplane!). For example, our ability to perceive salty tastes is weakened, so tomato juice tastes sweet.",
            "The first time Amelia Earhart saw an airplane, she wasn’t impressed and declined a ride!",
            "As a plane moves, air travels over the top of the wing faster than it flows beneath the wing. This creates higher pressure beneath the wing and forces it up into the lower pressure area. This process is called “lift.”",
            "Orville and Wilbur Wright, America’s aviation pioneers, designed the first successful airplane.",
            "Most of a plane is made from lightweight aluminum. Mercury, the chemical found in thermometers, can destroy aluminum in minutes. This is why it’s forbidden to bring it on flights!",
            "In the 1920s, a plane ticket cost just $5!",
            "Air travel is the second safest form of travel. The first safest method is the elevator/escalator, although you wouldn’t get very far!",
            "A plane’s life is measured in the number of times it undergoes pressurization. Every time it’s pressured, stress is caused on the fuselage, which adds up to tiny cracks that can’t be repaired.",
    };

    //Method (abilities: things te object can do)
    public String getFact() {

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
