package com.accutime.mkemp.fishtracker.main;

/**
 * Contract
 * Defines the contract between
 * the view  {@link MainActivity} and the Presenter {@link MainPresenter}
 */
public interface MainContract {
    interface MvpView {
        void showSignInScreen();
        void showSignUpScreen();
    }
    interface Presenter {
        // Almost always void
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }
}
