
package com.example.android.kosmoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup milky_way_quiz;
    RadioGroup closest_planet_quiz;
    RadioGroup sun_revolves_quiz;
    RadioButton yes_answer;
    RadioButton no_answer;
    RadioButton yes_quiz;
    RadioButton no_quiz;
    RadioButton earth_center;
    RadioButton of_course_not;
    RadioButton image_yes;
    RadioButton image_no;
    CheckBox mercury_box;
    CheckBox venus_box;
    CheckBox apes_box;
    CheckBox saturn_box;
    CheckBox neptune_box;
    CheckBox jupiter_box;
    EditText smallest_planet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        int finalScore;
        int quizOne = 0;
        int quizTwo = 0;
        int quizThree = 0;
        int quizFour = 0;
        int quizFive = 0;
        int quizSix ;
        Boolean yesAnswer;
        Boolean noAnswer;
        yes_answer = findViewById(R.id.yes_answer);
        no_answer = findViewById(R.id.no_answer);
        yesAnswer = yes_answer.isChecked();
        noAnswer = no_answer.isChecked();
        if (yesAnswer) {
            quizOne = 5;
        } else if (noAnswer) {
            quizOne = 0;
        }
        Boolean yesQuiz;
        Boolean noQuiz;
        yes_quiz = findViewById(R.id.yes_quiz);
        no_quiz = findViewById(R.id.no_quiz);
        yesQuiz = yes_quiz.isChecked();
        noQuiz = no_quiz.isChecked();
        if (yesQuiz) {
            quizTwo = 0;
        } else if (noQuiz) {
            quizTwo = 5;
        }
        Boolean earthCenter;
        Boolean ofCourseNot;
        earth_center = findViewById(R.id.earth_center);
        of_course_not = findViewById(R.id.of_course_not);
        earthCenter = earth_center.isChecked();
        ofCourseNot = of_course_not.isChecked();
        if (earthCenter) {
            quizThree = 0;
        } else if (ofCourseNot) {
            quizThree = 5;
        }
        Boolean imageYes;
        Boolean imageNo;
        image_yes = findViewById(R.id.image_yes);
        image_no = findViewById(R.id.image_no);
        imageYes = image_yes.isChecked();
        imageNo = image_no.isChecked();
        if (imageYes) {
            quizFour = 0;
        } else if (imageNo) {
            quizFour = 5;
        }
        Boolean mercuryBox;
        Boolean venusBox;
        Boolean apesBox;
        Boolean saturnBox;
        Boolean neptuneBox;
        Boolean jupiterBox;
        mercury_box = findViewById(R.id.mercury_box);
        venus_box = findViewById(R.id.venus_box);
        apes_box = findViewById(R.id.apes_box);
        saturn_box = findViewById(R.id.saturn_box);
        neptune_box = findViewById(R.id.neptune_box);
        jupiter_box = findViewById(R.id.jupiter_box);
        mercuryBox = mercury_box.isChecked();
        apesBox = apes_box.isChecked();
        venusBox = venus_box.isChecked();
        saturnBox = saturn_box.isChecked();
        neptuneBox = neptune_box.isChecked();
        jupiterBox = jupiter_box.isChecked();
        if (neptuneBox) {
            quizFive = 5;
        } else if (mercuryBox || venusBox || apesBox || saturnBox || jupiterBox) {
            quizFive = 0;
        }
        String smallestPlanet;
        smallest_planet = findViewById(R.id.smallest_planet);
        smallestPlanet = smallest_planet.getText().toString();
        if (smallestPlanet.equals("Mercury")) {
            quizSix = 5;
        } else {
            quizSix = 0;
        }
        finalScore = (quizOne + quizTwo + quizThree + quizFour + quizFive + quizSix);

        if (finalScore == 30) {
            Toast.makeText(this, "Perfect!You got all 6 questions right, " + finalScore + " points for you.", Toast.LENGTH_LONG).show();
        } else if (finalScore == 25) {
            Toast.makeText(this, "Very good!You answered 5 questions correctly, " + finalScore + " points for you.", Toast.LENGTH_LONG).show();
        } else if (finalScore == 20) {
            Toast.makeText(this, "Good!You got 4 questions right, " + finalScore + " points for you.", Toast.LENGTH_LONG).show();
        } else if (finalScore == 15) {
            Toast.makeText(this,"Okay, you got 3 questions right, "+finalScore+" points for you", Toast.LENGTH_LONG).show();
        }else if(finalScore == 10){
            Toast.makeText(this,"Just "+finalScore+" points out of 30. You can do better.", Toast.LENGTH_LONG).show();
        }else if(finalScore == 5){
            Toast.makeText(this,+finalScore+" points out of 30. Not too good.", Toast.LENGTH_LONG).show();
        }else if(finalScore == 0) {
            Toast.makeText(this, +finalScore + " points out of 30. Bad day, or geography is just not your thing?", Toast.LENGTH_LONG).show();
        }
    }
    public void startQuiz(View v){

        yes_answer.setChecked(false);
        no_answer.setChecked(false);
        yes_quiz.setChecked(false);
        no_quiz.setChecked(false);
        image_yes.setChecked(false);
        image_no.setChecked(false);
        venus_box.setChecked(false);
        mercury_box.setChecked(false);
        jupiter_box.setChecked(false);
        saturn_box.setChecked(false);
        apes_box.setChecked(false);
        neptune_box.setChecked(false);
        EditText smallestPlanet = findViewById(R.id.smallest_planet);
        smallestPlanet.setText("");
        EditText nameTextView = findViewById(R.id.name_text_view);
        nameTextView.setText("");
    }

}