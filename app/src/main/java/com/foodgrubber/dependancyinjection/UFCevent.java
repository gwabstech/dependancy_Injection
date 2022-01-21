package com.foodgrubber.dependancyinjection;

import android.util.Log;

public class UFCevent {
    private Boxer mBoxer;
    private Judoka mJudoka;

    public UFCevent(Boxer boxer, Judoka judoka) {
        mBoxer = boxer;
        mJudoka = judoka;


    }


    public void figth(){
        mBoxer.figth();
        mJudoka.figth();
    }
}
