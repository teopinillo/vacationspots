package com.philodroid.vacationspots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExplorerViewHolder> {

    List<Category_Bean> categories;
    Context context;

    public ExploreAdapter(Context context, List<Category_Bean> categories) {
        this.categories = categories;
        this.context = context;
    }

    public ExplorerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new ExplorerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ExplorerViewHolder holder, int position) {
        Category_Bean category = categories.get(position);
        holder.imageView.setImageResource(category.getImageId());
        holder.categoryTitle.setText(category.getTitle());
        holder.cardView.setCardBackgroundColor(category.getColor());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}

class ExplorerViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView categoryTitle;
    CardView cardView;

    public ExplorerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imvCategoryImage);
        categoryTitle = itemView.findViewById(R.id.tvCategoryTitle);
        cardView = itemView.findViewById(R.id.rootCardView);
    }
}


