package com.bignerdranch.android.kilobite;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by kent on 11/5/17.
 */

public class WorkoutLab {
    private static WorkoutLab sWorkoutLab;
    private List<Workout> mWorkouts;

    public static WorkoutLab get(Context context){
        if(sWorkoutLab == null) sWorkoutLab = new WorkoutLab(context);
        return  sWorkoutLab;
    }

    public List<Workout> getWorkouts(){
        return mWorkouts;
    }
//This is where we'll build the routines. Right now it just plugs in burpees and divides 100 by i
    private WorkoutLab(Context context){
        mWorkouts = new ArrayList<>();
        for (int i=1;i<=100;i++){
            Workout workout = new Workout();
            workout.setReps((100/i));
            mWorkouts.add(workout);
        }
    }

    public Workout getWorkout(UUID id){
        for(Workout workout:mWorkouts){
            if(workout.getWorkoutID().equals(id)){
                return workout;
            }
        }
        return null;
    }
}
