package com.philodroid.vacationspots;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class Explore_WithGridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_wtih_grid_layout);
        setupGridView(4,2);
    }
    /*
      @param
      mode = 1 GridLayoutManager Vertical
      mode = 2 GridLayoutManager Horizontal
      mode = 3 StaggeredGridLayoutManager Vertical
      mode = 4 StaggeredGridLayoutManager Horizontal
     */
    void setupGridView(int mode, int spanCount) {
        ExploreAdapter exploreAdapter = new ExploreAdapter(this, Task.getCategories());
        RecyclerView recyclerView = findViewById(R.id.exploreRecyclerView);
        GridLayoutManager gridLayoutManager = null;
        StaggeredGridLayoutManager staggeredLayoutManager = null;

        switch (mode) {
            case 1:
                gridLayoutManager = new GridLayoutManager(this, spanCount);
                gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
                break;
            case 2:
                GridLayoutManager layoutManager = new GridLayoutManager(this,spanCount);
                layoutManager.setOrientation(RecyclerView.HORIZONTAL);
                break;
            case 3:
                staggeredLayoutManager = new StaggeredGridLayoutManager(spanCount, RecyclerView.VERTICAL);
                staggeredLayoutManager.setOrientation(RecyclerView.VERTICAL);
                break;
            default:
                staggeredLayoutManager = new StaggeredGridLayoutManager(spanCount, RecyclerView.HORIZONTAL);
                staggeredLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        }

        if (gridLayoutManager != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        } else {
            recyclerView.setLayoutManager(staggeredLayoutManager);
        }
        recyclerView.setAdapter(exploreAdapter);
    }
}
