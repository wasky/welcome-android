package com.stephentuso.welcome.ui;

import android.view.View;

/**
 * Created by stephentuso on 11/15/15.
 */
public class DoneButton extends WelcomeScreenViewWrapper {

    public DoneButton(View button) {
        super(button);
        hideImmediately();
    }

    @Override
    public void onPageSelected(int pageIndex, int lastPageIndex) {
        setVisibility(pageIndex == lastPageIndex);
    }


}
