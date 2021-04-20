package com.parkho.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.parkho.recyclerview.PhRecyclerViewAdapter.OnItemLongClickEventListener;

public class PhRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;
    ImageView ivIcon;

    public PhRecyclerViewHolder(View a_itemView, final OnItemLongClickEventListener a_itemLongClickListener) {
        super(a_itemView);

        // long Click event
        a_itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View a_view) {
                final int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    a_itemLongClickListener.onItemLongClick(a_view, position);
                }

                return false;
            }
        });

        tvName = a_itemView.findViewById(R.id.tv_name);
        ivIcon = a_itemView.findViewById(R.id.iv_icon);
    }
}