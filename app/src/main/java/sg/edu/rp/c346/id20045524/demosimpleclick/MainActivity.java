package sg.edu.rp.c346.id20045524.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //1 - Declare variables
    Button btnDisplay;
    EditText etInputSomething;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 - Link the variables to their respective UI Elements
        btnDisplay = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInputSomething = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);

        // 3 - Handle Click Event To Display
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // 4 - set action
                if (tbtn.isChecked() == true){
                    // grab input from EditText
                    String value = etInputSomething.getText().toString();
                    int checkedRadioId = rgGender.getCheckedRadioButtonId();
                    if(checkedRadioId == R.id.rbMale){
                        // Write the code when male selected
                        //set to TextView
                        tvDisplay.setText("Hello Mr. " + value);
                    }
                    else{
                        // Write the code when female selected
                        //set to TextView
                        tvDisplay.setText("Hello Ms. " + value);
                    }
                }
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tbtn.isChecked() == true){
                    tvDisplay.setEnabled(true);
                } else {
                    tvDisplay.setEnabled(false);
                }
            }
        });


    }
}