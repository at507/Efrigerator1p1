// aat issue #7 : 9/16/2012
// Add tab for navigation with option
// BaseActivity was created and it will have actionbar
// All other activities will inherit this activity
// Ultimately at sometime, we will replace this activity with other activity (mostly calendar)

package com.example.efridgerator1p1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
}
