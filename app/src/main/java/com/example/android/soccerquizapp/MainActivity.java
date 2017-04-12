package com.example.android.soccerquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Start Quiz button is clicked.
     */
    public void startQuiz(View view) {
        //Show question number 1
        setContentView(R.layout.question_1);

        //Check if a radio button has been clicked, and, if so, display Next button
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.r_group_1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup group, int checkedId) {
                   switch (checkedId) {
                       case R.id.radio_button_a_q1:
                           View nb1 = findViewById(R.id.nb1);
                           nb1.setVisibility(View.VISIBLE);
                           break;
                       case R.id.radio_button_b_q1:
                           nb1 = findViewById(R.id.nb1);
                           nb1.setVisibility(View.VISIBLE);
                           break;
                       case R.id.radio_button_c_q1:
                           nb1 = findViewById(R.id.nb1);
                           nb1.setVisibility(View.VISIBLE);
                           break;
                   }
               }
           }
        );

    }

    /**
     * This method is called when the Next button below Question 1 is clicked.
     */
    public void nextQuestion(View view) {
        //Checks whether the correct radio button is clicked in Question 1
        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.radio_button_b_q1);
        boolean checkedOne = radioButtonOne.isChecked();

        //If correct radio button has been clicked, increase score by 1
        if (checkedOne)
            score += 1;

        //Show question number 2
        setContentView(R.layout.question_2);

        //Check if a radio button has been clicked, and, if so, display Next button
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.r_group_2);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(RadioGroup group, int checkedId) {
                                               switch (checkedId) {
                                                   case R.id.radio_button_a_q2:
                                                       View nb2 = findViewById(R.id.nb2);
                                                       nb2.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_b_q2:
                                                       nb2 = findViewById(R.id.nb2);
                                                       nb2.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_c_q2:
                                                       nb2 = findViewById(R.id.nb2);
                                                       nb2.setVisibility(View.VISIBLE);
                                                       break;
                                               }
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 2 is clicked.
     */
    public void nextQuestion2(View view) {
        //Checks whether the correct radio button is clicked in Question 2
        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.radio_button_a_q2);
        boolean checkedTwo = radioButtonTwo.isChecked();

        //If correct radio button is clicked, increase score by 1
        if (checkedTwo)
            score += 1;

        //Show question number 3
        setContentView(R.layout.question_3);

        //Check for user input. If text has been put in, show Next button.
        EditText answer3 = (EditText) findViewById(R.id.answer_question_3);
        answer3.addTextChangedListener(new TextWatcher() {
                                           @Override
                                           public void afterTextChanged(Editable s) {
                                           }

                                           @Override
                                           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                           }

                                           @Override
                                           public void onTextChanged(CharSequence s, int start, int before, int count) {
                                               View nb3 = findViewById(R.id.nb3);
                                               nb3.setVisibility(View.VISIBLE);
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 3 is clicked.
     */
    public void nextQuestion3(View view) {
        //Get answer text
        EditText minutes = (EditText) findViewById(R.id.answer_question_3);
        String answer3 = minutes.getText().toString();

        /*
        Check whether the input equals 90, which is the correct answer.
        If so, increase score by 1.
        */
        if (answer3.equals("90")) {
            score += 1;
        }

        //Show question number 4
        setContentView(R.layout.question_4);

        //Check if a radio button has been clicked, and, if so, display Next button
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.r_group_4);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(RadioGroup group, int checkedId) {
                                               switch (checkedId) {
                                                   case R.id.radio_button_a_q4:
                                                       View nb4 = findViewById(R.id.nb4);
                                                       nb4.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_b_q4:
                                                       nb4 = findViewById(R.id.nb4);
                                                       nb4.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_c_q4:
                                                       nb4 = findViewById(R.id.nb4);
                                                       nb4.setVisibility(View.VISIBLE);
                                                       break;
                                               }
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 4 is clicked.
     */
    public void nextQuestion4(View view) {
        //Checks whether the correct radio button is clicked in Question 4
        RadioButton radioButtonFour = (RadioButton) findViewById(R.id.radio_button_c_q4);
        boolean checkedFour = radioButtonFour.isChecked();

        //If correct radio button has been clicked, increase score by 1
        if (checkedFour)
            score += 1;

        //Show question number 5
        setContentView(R.layout.question_5);

        //Check if a radio button has been clicked, and, if so, display Next button
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.r_group_5);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(RadioGroup group, int checkedId) {
                                               switch (checkedId) {
                                                   case R.id.radio_button_a_q5:
                                                       View nb5 = findViewById(R.id.nb5);
                                                       nb5.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_b_q5:
                                                       nb5 = findViewById(R.id.nb5);
                                                       nb5.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_c_q5:
                                                       nb5 = findViewById(R.id.nb5);
                                                       nb5.setVisibility(View.VISIBLE);
                                                       break;
                                               }
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 5 is clicked.
     */
    public void nextQuestion5(View view) {
        //Checks whether the correct radio button is clicked in Question 5
        RadioButton radioButtonFive = (RadioButton) findViewById(R.id.radio_button_a_q5);
        boolean checkedFive = radioButtonFive.isChecked();

        //If correct radio button has been clicked, increase score by 1
        if (checkedFive)
            score += 1;

        //Show question number 6
        setContentView(R.layout.question_6);

        //Check if a radio button has been clicked, and, if so, display Next button
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.r_group_6);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(RadioGroup group, int checkedId) {
                                               switch (checkedId) {
                                                   case R.id.radio_button_a_q6:
                                                       View nb6 = findViewById(R.id.nb6);
                                                       nb6.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_b_q6:
                                                       nb6 = findViewById(R.id.nb6);
                                                       nb6.setVisibility(View.VISIBLE);
                                                       break;
                                                   case R.id.radio_button_c_q6:
                                                       nb6 = findViewById(R.id.nb6);
                                                       nb6.setVisibility(View.VISIBLE);
                                                       break;
                                               }
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 6 is clicked.
     */
    public void nextQuestion6(View view) {
        //Checks whether the correct radio button is clicked in Question 6
        RadioButton radioButtonSix = (RadioButton) findViewById(R.id.radio_button_b_q6);
        boolean checkedSix = radioButtonSix.isChecked();

        //If correct radio button has been clicked, increase score by 1
        if (checkedSix)
            score += 1;

        //Show question number 7
        setContentView(R.layout.question_7);

        //Check for user input. If text has been put in, show Next button.
        EditText answer3 = (EditText) findViewById(R.id.answer_question_7);
        answer3.addTextChangedListener(new TextWatcher() {
                                           @Override
                                           public void afterTextChanged(Editable s) {
                                           }

                                           @Override
                                           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                           }

                                           @Override
                                           public void onTextChanged(CharSequence s, int start, int before, int count) {
                                               View nb7 = findViewById(R.id.nb7);
                                               nb7.setVisibility(View.VISIBLE);
                                           }
                                       }
        );
    }

    /**
     * This method is called when the Next button below Question 7 is clicked.
     */
    public void nextQuestion7(View view) {
        //Get answer text
        EditText colors = (EditText) findViewById(R.id.answer_question_7);
        String answer7 = colors.getText().toString();

        /*
        Check whether the input equals either "red and yellow" or "yellow and red",
        which are the correct answers. If so,increase score by 1.
        */
        if (answer7.equals("red and yellow") || answer7.equals("yellow and red")) {
            score += 1;
        }

        //Show question number 8
        setContentView(R.layout.question_8);

        //Check if a checkbox has been marked, and, if so, display Next button
        final CheckBox cb1 = (CheckBox) findViewById(R.id.goalkeeper_checkbox);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.quarterback_checkbox);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.defender_checkbox);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.center_checkbox);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.striker_checkbox);

        CheckBox.OnCheckedChangeListener checker = new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked() || cb4.isChecked() || cb5.isChecked()) {
                    View savr = findViewById(R.id.savr_button);
                    savr.setVisibility(View.VISIBLE);
                }
            }
        };

        cb1.setOnCheckedChangeListener(checker);
        cb2.setOnCheckedChangeListener(checker);
        cb3.setOnCheckedChangeListener(checker);
        cb4.setOnCheckedChangeListener(checker);
        cb5.setOnCheckedChangeListener(checker);
    }

    /**
     * This method is called when then Submit and view results button below Question 8 is clicked.
     */
    public void submitAndViewResults(View view) {
        //Checks whether the correct checkboxes are marked in Question 8
        CheckBox checkBoxEightGoalkeeper = (CheckBox) findViewById(R.id.goalkeeper_checkbox);
        boolean checkedGoalkeeper = checkBoxEightGoalkeeper.isChecked();
        CheckBox checkBoxEightDefender = (CheckBox) findViewById(R.id.defender_checkbox);
        boolean checkedDefender = checkBoxEightDefender.isChecked();
        CheckBox checkBoxEightStriker = (CheckBox) findViewById(R.id.striker_checkbox);
        boolean checkedStriker = checkBoxEightStriker.isChecked();

        //If the correct answers have been selected, increase score by 1
        if (checkedGoalkeeper && checkedDefender && checkedStriker) {
            score += 1;
        }

        //Prevents the Submit method from being pressed more than once
        Button savrButton = (Button) findViewById(R.id.savr_button);
        savrButton.setClickable(false);

        //Displays toast message with the score
        Toast.makeText(this, getString(R.string.score_message, score), Toast.LENGTH_LONG).show();
    }
}
