package com.jewel.listwithanimation.utils;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * Created by Jewel on 9/6/2015.
 */
public class MyAnimation {
    private static int prePos;
   /* public static void animateUpDown(RecyclerView.ViewHolder holder,boolean goesDown){
        ObjectAnimator animator= ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown==true?100:-100, 0);
        animator.setDuration(1000);
        animator.start();

    }*/

    public static  void animateUpDown(RecyclerView.ViewHolder holder, int pos){
        boolean goesDown=pos>prePos?true:false;
        prePos=pos;
        ObjectAnimator animator= ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown?100:-100, 0);
        animator.setDuration(1000);
        animator.start();

    }
    public static void animateAlpha(RecyclerView.ViewHolder holder){
        //ObjectAnimator animator= ObjectAnimator.ofFloat(holder.itemView, "scaleY", 0.5f, 1f);
        ObjectAnimator animator= ObjectAnimator.ofFloat(holder.itemView, "alpha", 0.0f, 1f);
        animator.setDuration(2000);
        animator.start();
    }
    public static void animateLeftRight(RecyclerView.ViewHolder holder,boolean isLeft){
        ObjectAnimator animator= ObjectAnimator.ofFloat(holder.itemView, "translationX", isLeft?100:0, isLeft?0:100);
        animator.setDuration(1000);
        animator.start();
    }
    public static void animateLeftRight(View view,boolean isLeft){
        ObjectAnimator animator= ObjectAnimator.ofFloat(view, "translationX", isLeft?100:0, isLeft?0:100);
        animator.setDuration(1000);
        animator.start();
    }
}
