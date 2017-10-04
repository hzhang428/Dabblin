package com.example.haozhang.dabblin.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.haozhang.dabblin.model.Shot;

import java.util.List;

/**
 * Created by haozhang on 6/12/17.
 */

public class ShotListAdapter extends RecyclerView.Adapter {

    private List<Shot> data;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
