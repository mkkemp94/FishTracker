package com.accutime.mkemp.fishtracker.main;

/**
 * Presenter
 * Should have a handle on view so that the view can update as necessary
 * Responsible for handling actions from the view and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {

    // Have a handle on view
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view) {
        mView = view;
    }

}
