package com.project.admin.arkamilkproject.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.project.admin.arkamilkproject.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

public class Login extends AppCompatActivity  implements GoogleApiClient.OnConnectionFailedListener{
    TextView signup;
    Button login;
    LinearLayout loginlayout;
    private GoogleApiClient mGoogleApiClient;
    private final int PLACE_AUTOCOMPLETE_REQUEST_CODE = 11;
    private String TAG = "place";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup=(TextView)findViewById(R.id.Signup);
        login=findViewById(R.id.login);
        loginlayout=findViewById(R.id.loginlayout);

        int resId = R.anim.layoutslidebottom;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(Login.this, resId);
        loginlayout.setLayoutAnimation(animation);
        mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .build();

        //________initialize auto complete place
        autocompletePlace();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,DashBoard.class);
                startActivity(intent);

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login.this,Registration.class);
                startActivity(intent);
            }
        });



    }
    private void autocompletePlace() {

        //______________create object of PlaceAutocompleteFragment.
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);

        //______________add listener to PlaceAutocompleteFragment.
        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {

            //______________Method will be auto call on selection of any place.
            @Override
            public void onPlaceSelected(Place place) {
                // TODO: Get info about the selected place.

                //______________format place name.
                String toastMsgAuto = String.format("Place: %s", place.getName());

                //______________show selected place in massage.
                Toast.makeText(Login.this, toastMsgAuto, Toast.LENGTH_LONG).show();
            }

            //______________Method will be auto call, if error occur on selection of any place.
            @Override
            public void onError(Status status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: " + status);
            }
        });
    }

    //______________Method will be auto call, if connection fail from google server.
    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(this, "Connection failed", Toast.LENGTH_SHORT).show();
    }

}


