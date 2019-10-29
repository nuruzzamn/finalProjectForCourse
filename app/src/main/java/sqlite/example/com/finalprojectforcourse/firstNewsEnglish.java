package sqlite.example.com.finalprojectforcourse;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class firstNewsEnglish extends AppCompatActivity {


      WebView myWebView = (WebView) findViewById(R.id.webEFirstNews);
      TextView text= (TextView) findViewById(R.id.enews1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_news_english);


        // Calling download task function
        download task = new download();

        // Executing download task and change this " uk&appid=9f681051b003f104ae5e2a0cbef19a02" with your own API KEY
        task.execute("https://newsapi.org/v1/articles?source=techcrunch&apiKey=15c9f63c55664830abfeb3678f9a415b");
    }


    // Creating download method with Async Task ( we r going to use this to get data from internet and parse it )
    static class download extends AsyncTask<String, Void, String> {
        private WebView myWebView;
        private   TextView text;


        // This method execute after doInBackground method and Parse the Json

        @Override
        protected void onPostExecute(String result) {

            Log.i("info",result);
            // Try and catch block to catch any errors
            try {

                //calling  JSONObject as jsonObject
                JSONObject jsonObject = new JSONObject(result);
                //using jsonObject to get String from Json which is tagged as weather
                String articles = jsonObject.getString("articles");
                //calling JSONArray as arr
                JSONArray arr = new JSONArray(articles);
                // using for loop to loop through arr array
                for (int i = 0; i <= arr.length(); i++) {


                    if(i==0) {
                        JSONObject jsonPart = arr.getJSONObject(i);

                        Log.i("infoTitle", jsonPart.getString("title"));
                        Log.i("infoUrl", jsonPart.getString("url"));


                        //String title=jsonPart.getString("title");
                        //String url=jsonPart.getString("url");
                        //WebView myWebView = (WebView) findViewById(R.id.webEFirstNews);
                        myWebView.getSettings().setJavaScriptEnabled(true);
                        myWebView.getSettings().setSupportZoom(true);
                        myWebView.getSettings().setBuiltInZoomControls(true);
                        myWebView.getSettings().setDisplayZoomControls(true);
                        myWebView.loadUrl(jsonPart.getString("url"));
                        text.setText(jsonPart.getString("title"));

                    }else  if(i==1) {
                        JSONObject jsonPart = arr.getJSONObject(i);


                        Log.i("gdfgds", jsonPart.getString("title"));
                         Log.i("gdfgds", jsonPart.getString("url"));
                    }
                }
                //e.printStackTrace will just print a error report like a normal program do when it crashes u can change this with anything u like
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        // do doInBackground method we r using this method to download Json from site.
        @Override
        protected String doInBackground(String... urls) {
            String result = "";
            //  calling url as url
            URL url;
            // calling HttpUrlConnection as urlConnection
            HttpURLConnection urlConnection;
            // Using try and catch block to find any errors
            try {
                // assigning url value of first object in array called urls which is declared in this start of this method
                url = new URL(urls[0]);
                // using urlConnection to open url which we assigning URL before
                urlConnection = (HttpURLConnection) url.openConnection();
                // Using InputStream to download the content
                InputStream inputStream = urlConnection.getInputStream();
                // Using InputStreamReader to read the inputstream or the data we r downloading
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                // using it to check if we reached the end of String / Data
                int Data = inputStreamReader.read();
                // using While loop to assign that data to string called result because InputStreamReader reads only one character at a time
                while (Data != -1) {
                    char current = (char) Data;
                    result += current;
                    Data = inputStreamReader.read();
                }
                // returning value of result
                return result;
                //Try and catch block to catch any errors
            } catch (Exception e) {
                //  e.printStackTrace will just print a error report like a normal program do when it crashes u can change this with anything u like
                e.printStackTrace();
            }
            return null;
        }
    }


}
