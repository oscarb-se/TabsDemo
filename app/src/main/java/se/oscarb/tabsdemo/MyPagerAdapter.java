package se.oscarb.tabsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /*
      Metoden som hämtar/skapar ett Fragment beroende på vilken tabb (position) som visas
     */
    @Override
    public Fragment getItem(int position) {
        // Skapa olika fragment
        Fragment fragment = null;

        if(position == 0) {
            fragment = new HomeFragment();
        } else if (position == 1) {
            fragment = new FavoritesFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        // Ställ in hur många flikar/tabbar det finns totalt
        return 2;
    }

    /*
        Titeln på tabbarna
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Favorites";
        }
        return null;
    }
}
