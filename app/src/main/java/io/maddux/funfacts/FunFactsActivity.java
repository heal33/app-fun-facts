package io.maddux.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View Variables and assign the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {
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


                //The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random();  // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(facts.length);

                fact = facts[randomNumber];


                //Update the label with out dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
