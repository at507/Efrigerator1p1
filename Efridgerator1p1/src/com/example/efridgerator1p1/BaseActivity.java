// aat issue #7 : 9/16/2012
// Add tab for navigation with option
// BaseActivity was created and it will have actionbar
// All other activities will inherit this activity

package com.example.efridgerator1p1;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BaseActivity extends SherlockFragmentActivity implements ActionBar.TabListener{
	
	EfridgeApplication efridge;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
        for (int i = 1; i <= 3; i++) {
           
            switch (i)
            {
            
            case (1): 
            	ActionBar.Tab tab1 = getSupportActionBar().newTab();
            	tab1.setText("Home ");
            	tab1.setTabListener(this);
            	getSupportActionBar().addTab(tab1);
            	break;
            
            case (2): 
            	ActionBar.Tab tab2 = getSupportActionBar().newTab();
            	tab2.setText("Display All");
            	tab2.setTabListener(this);
            	getSupportActionBar().addTab(tab2);
            	break;
            
            case (3):
            	ActionBar.Tab tab3 = getSupportActionBar().newTab();
            	tab3.setText("Preferences");
            	tab3.setTabListener(this);
            	getSupportActionBar().addTab(tab3);
            	break;
            
        	default : 
            }
           
        }	
	
	}
	
	@Override
	public void onTabSelected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		Toast.makeText(this, tab.getText(), Toast.LENGTH_LONG).show();	
	}
	
	@Override
	public void onTabUnselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTabReselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
