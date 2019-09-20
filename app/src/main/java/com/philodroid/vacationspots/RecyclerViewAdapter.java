package com.philodroid.vacationspots;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/*
 CONS of Using RecyclerView.Adapter
 -Load data set all at one
    . Requests data that arent needed
    . Consumes user's battery
    . Consumes internet bandwith
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Destination_Bean> destinationList = null;
    private int currentPosition = 0;

    //Constructor
    public RecyclerViewAdapter(Context context, List<Destination_Bean> destinationList) {
        this.context = context;
        this.destinationList = destinationList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Destination_Bean destination = destinationList.get(position);
        currentPosition = position;
        holder.setData(destination);
    }

    @Override
    //Return the number of list items
    public int getItemCount() {
        return destinationList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        private void setData(final Destination_Bean destination) {
            ImageView imageView = itemView.findViewById(R.id.imvPlace);
            imageView.setOnClickListener(this);
            imageView.setImageResource(destination.getImageId());
            TextView textView = itemView.findViewById(R.id.tvPlaceName);
            textView.setText(destination.getPlaceName());
            ImageView imvDelete = itemView.findViewById(R.id.imvDelete);
            ImageView imvMakeCopy = itemView.findViewById(R.id.imvMakeCopy);

            imvDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (currentPosition == destinationList.size()) {
                        currentPosition--;
                    }
                    try {
                        destinationList.remove(currentPosition);
                        notifyItemRemoved(currentPosition);
                        notifyItemRangeChanged(currentPosition, destinationList.size());
                    } catch (IndexOutOfBoundsException ex) {
                        Log.e("MyViewHolder", "position: " + currentPosition + " " + ex.getMessage());
                    }
                }
            });

            imvMakeCopy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //destinationList.add(destination);
                    destinationList.add(currentPosition, destination);
                    notifyItemInserted(currentPosition);
                    notifyItemRangeChanged(currentPosition, destinationList.size());
                }
            });
        }

        @Override
        public void onClick(View view) {
            openExploreActivity();
        }
    }

    private void openExploreActivity() {
        Intent intent = new Intent(context, Explore_WithGridLayout.class);
        context.startActivity(intent);
    }
}
