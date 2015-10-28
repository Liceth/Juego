package licethovalles.administrador.mijuego;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;



public class MainActivity2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar mToolbar;
    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mdrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

            mNavigationView = (NavigationView) findViewById(R.id.menuitems);
            mNavigationView.setNavigationItemSelectedListener(this);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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




    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Intent intent = null;
        if( menuItem.getItemId() == R.id.navigation_item_1){
//            mDrawerLayout.closeDrawer(GravityCompat.START);
            intent = new Intent (getApplicationContext(),facil.class);
            startActivity(intent);return true;

        }
        if( menuItem.getItemId() == R.id.navigation_item_2){
            //        mDrawerLayout.closeDrawer(GravityCompat.START);
            intent = new Intent (getApplicationContext(),medio.class);
            startActivity(intent);return true;
        }

        if( menuItem.getItemId() == R.id.navigation_item_3){
    //        mDrawerLayout.closeDrawer(GravityCompat.START);
            intent = new Intent (getApplicationContext(),dificil.class);
            startActivity(intent);return true;
            }
            return true;
    }
}


