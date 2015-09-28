package com.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout flCont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        textViewAdd();
    }

    private void initialize() {
        flCont = (LinearLayout)findViewById(R.id.flCont);
    }

    private void textViewAdd() {
        EditText et1 = new EditText(this);
        EditText et2 = new EditText(this);
        EditText et3 = new EditText(this);
        EditText et4 = new EditText(this);
        et1.setHint("Dynamic EditText!");
        et2.setHint("Dynamic EditText!");
        et3.setHint("Dynamic EditText!");
        et4.setHint("Dynamic EditText!");
        et1.setMinLines(1);
        et1.setMaxLines(3);
        flCont.addView(et1);
        flCont.addView(et2);
        flCont.addView(et3);
        flCont.addView(et4);
    }


    //region Menu..
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //endregion
}
