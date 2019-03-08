package com.accutime.mkemp.fishtracker.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Local Unit Test for the Main Presenter.
 */
public class MainPresenterTest {

    // Mock view
    @Mock
    private MainContract.MvpView mView;

    // What we're testing
    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {

        // Initialize mockito annotations boilerplate
        MockitoAnnotations.initMocks(this);

        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
        mPresenter.handleSignInButtonClick();

        // Import from mockito
        // Verify that this method is called
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        mPresenter.handleSignUpButtonClick();

        // Should fail at first because we have not written any code
        // Make it pass -- TDD!!
        // This is called
        verify(mView).showSignUpScreen();
    }
}