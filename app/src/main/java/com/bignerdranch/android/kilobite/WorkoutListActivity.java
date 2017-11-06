package com.bignerdranch.android.kilobite;

import android.support.v4.app.Fragment;

/**
 * This shows the
 */

public class WorkoutListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new WorkoutListFragment();
    }
}
