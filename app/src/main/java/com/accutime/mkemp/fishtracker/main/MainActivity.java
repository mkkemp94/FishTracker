package com.accutime.mkemp.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.accutime.mkemp.fishtracker.R;

/**
 * View
 * Should have handle on presenter to let presenter know when interactions have taken place
 * Displays the main screen
 *
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    // Have a handle on presenter
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }

    ////////        MVP View Methods

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the sign in screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the sign up screen", Toast.LENGTH_SHORT).show();

    }
}
