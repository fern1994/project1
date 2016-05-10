package com.example.fern_computer.antidrugvolunteer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetAddictphase extends AppCompatActivity {
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_select);
        // Permission StrictMode
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        showInfo();

    }

    public void showInfo(){

        final TextView tPhaseID = (TextView)findViewById(R.id.txtID);
        final TextView tPhaseName = (TextView)findViewById(R.id.txtName);
        final TextView tPhaseDetail = (TextView)findViewById(R.id.txtDetail);
        ImageView image = (ImageView)findViewById(R.id.image);


        String url = "http://192.168.1.38/Anti%20Drug%20Webservice2/getAddictPhaseByID.php";

        Intent intent= getIntent();

        final String PhaseID = intent.getStringExtra("phaseID");

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("sPhaseID", PhaseID));

        String resultServer = getHttpPost(url,params);

        String strPhaseID = "";
        String strPhaseName = "";
        String strPhaseDetail = "";


        JSONObject c;

        try{
            c = new JSONObject(resultServer);
            strPhaseID = c.getString("phaseID");
            strPhaseName = c.getString("phaseName");
            strPhaseDetail = c.getString("phaseDetail");


            if(!strPhaseID.equals("")){
                tPhaseID.setText(strPhaseID);
                tPhaseName.setText(strPhaseName);
                tPhaseDetail.setText(strPhaseDetail);

                int t = Integer.parseInt(tPhaseID.getText().toString());
                if(t == 1){
                    image.setImageResource(R.drawable.phase1);
                }else if(t == 2){
                    image.setImageResource(R.drawable.phase2);
                }else if(t == 3){
                    image.setImageResource(R.drawable.phase3);
                }else if(t == 4){
                    image.setImageResource(R.drawable.phase4);
                }else if(t == 5){
                    image.setImageResource(R.drawable.d5);
                }else if(t == 6){
                    image.setImageResource(R.drawable.d6);
                }else if(t == 7){
                    image.setImageResource(R.drawable.d7);
                }else if(t == 8){
                    image.setImageResource(R.drawable.d8);
                }else if(t == 9){
                    image.setImageResource(R.drawable.d9);
                }else if(t == 10){
                    image.setImageResource(R.drawable.d10);
                }else if(t == 11){
                    image.setImageResource(R.drawable.d11);
                }else if(t == 12){
                    image.setImageResource(R.drawable.d12);
                }else if(t == 13){
                    image.setImageResource(R.drawable.d13);
                }

            }else{
                tPhaseID.setText("-");
                tPhaseName.setText("-");
                tPhaseDetail.setText("-");

            }
        }catch(JSONException e){
            e.printStackTrace();
        }
    }

    public String getHttpPost(String url,List<NameValuePair> params){
        StringBuilder str = new StringBuilder();
        HttpClient client = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = client.execute(httpPost);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();

            if (statusCode == 200) { // Status OK
                HttpEntity entity = response.getEntity();
                InputStream content = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(content));
                String line;

                while ((line = reader.readLine()) != null) {
                    str.append(line);
                }
            } else {
                Log.e("Log", "Failed to download result..");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}
