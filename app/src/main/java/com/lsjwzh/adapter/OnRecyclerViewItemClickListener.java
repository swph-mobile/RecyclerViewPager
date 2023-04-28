package com.lsjwzh.adapter;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public interface OnRecyclerViewItemClickListener<VH extends RecyclerView.ViewHolder> {
  void onItemClick(View view, int position, VH viewHolder);
}
