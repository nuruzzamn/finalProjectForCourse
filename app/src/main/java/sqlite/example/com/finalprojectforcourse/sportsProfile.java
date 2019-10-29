package sqlite.example.com.finalprojectforcourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class sportsProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_profile);

        TextView news1= (TextView) findViewById(R.id.snews1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,firstNewsSports.class);
                startActivity(sports);

            }
        });


        TextView news2= (TextView) findViewById(R.id.snews2);
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,secondNewsSports.class);
                startActivity(sports);

            }
        });


        TextView news3= (TextView) findViewById(R.id.snews3);
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,thirdNewsSports.class);
                startActivity(sports);

            }
        });


        TextView news4= (TextView) findViewById(R.id.snews4);
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,fourNewsSports.class);
                startActivity(sports);

            }
        });


        ImageButton youtube1= (ImageButton) findViewById(R.id.simageButton1);
        youtube1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,firstSportsYoutube.class);
                startActivity(sports);

            }
        });


        ImageButton youtube2= (ImageButton) findViewById(R.id.simageButton2);
        youtube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(sportsProfile.this,secondSportsYoutube.class);
                startActivity(sports);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.id_bangla) {

            Intent intentBangla = new Intent(sportsProfile.this, DashboardActivity.class);
            startActivity(intentBangla);
            return true;
        }
        if (id == R.id.id_english) {

            Intent intentEnglish = new Intent(sportsProfile.this, englishProfile.class);
            startActivity(intentEnglish);
            return true;
        }
        if (id == R.id.id_sports) {

            Intent intentSports = new Intent(sportsProfile.this, sportsProfile.class);
            startActivity(intentSports);
            return true;
        }


        return true;
    }

}
