package com.example.haozhang.dabblin.ui;

import android.view.View;
import android.widget.TextView;

import com.example.haozhang.dabblin.R;
import com.example.haozhang.dabblin.ui.Basic.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;

/**
 * Created by haozhang on 6/12/17.
 *
 */

public class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_image) SimpleDraweeView shotImage;
    @BindView(R.id.shot_view_count) TextView viewCount;
    @BindView(R.id.shot_liked_count) TextView likedCount;
    @BindView(R.id.shot_marked_count) TextView markedCount;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
