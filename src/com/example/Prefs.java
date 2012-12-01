package com.example;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created with IntelliJ IDEA.
 * User: ABI
 * Date: 12/1/12
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Prefs extends PreferenceActivity    {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }

}
