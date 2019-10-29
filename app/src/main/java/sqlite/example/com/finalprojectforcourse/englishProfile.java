package sqlite.example.com.finalprojectforcourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class englishProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_profile);

        TextView news1= (TextView) findViewById(R.id.enews1);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,firstNewsEnglish.class);
                startActivity(sports);
            }
        });

        TextView news2= (TextView) findViewById(R.id.enews2);
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,secondNewsEnglish.class);
                startActivity(sports);
            }
        });

        TextView news3= (TextView) findViewById(R.id.enews3);
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,thirdNewsEnglish.class);
                startActivity(sports);
            }
        });

        TextView news4= (TextView) findViewById(R.id.enews4);
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,fourNewsEnglish.class);
                startActivity(sports);
            }
        });

        ImageButton youtube1= (ImageButton) findViewById(R.id.eimageButton1);
        youtube1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,firstEnglishYoutube.class);
                startActivity(sports);

            }
        });

        ImageButton youtube2= (ImageButton) findViewById(R.id.eimageButton2);
        youtube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sports=new Intent(englishProfile.this,secondEnglishYoutube.class);
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

                Intent intentBangla = new Intent(englishProfile.this, DashboardActivity.class);
                startActivity(intentBangla);
                return true;
            }
            if (id == R.id.id_english) {

                Intent intentEnglish = new Intent(englishProfile.this, englishProfile.class);
                startActivity(intentEnglish);
                return true;
            }
            if (id == R.id.id_sports) {

                Intent intentSports = new Intent(englishProfile.this, sportsProfile.class);
                startActivity(intentSports);
                return true;
            }


            return true;
        }

}
