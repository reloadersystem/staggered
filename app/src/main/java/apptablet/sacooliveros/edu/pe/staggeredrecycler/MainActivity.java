package apptablet.sacooliveros.edu.pe.staggeredrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private StaggeredRecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager lManager;
    private ArrayList<mImagenes> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adListimagenes();
        startRecycler();

        StaggeredGridLayoutManager lmStaggeredVertical = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recycler.setLayoutManager(lmStaggeredVertical);
    }

    private void adListimagenes() {

        mImagenes image1 = new mImagenes(R.drawable.geometria1, "imagen 1");
        mImagenes image2 = new mImagenes(R.drawable.geometria2, "imagen 2");
        mImagenes image3 = new mImagenes(R.drawable.geometria3, "imagen 3");
        mImagenes image4 = new mImagenes(R.drawable.geometria4, "imagen 4");
        mImagenes image5 = new mImagenes(R.drawable.geometria5, "imagen 5");
        mImagenes image6 = new mImagenes(R.drawable.geometria6, "imagen 6");
        mImagenes image7 = new mImagenes(R.drawable.geometria7, "imagen 7");

        listitems = new ArrayList<mImagenes>();
        listitems.add(image1);
        listitems.add(image2);
        listitems.add(image3);
        listitems.add(image4);
        listitems.add(image5);
        listitems.add(image6);
        listitems.add(image7);
    }

    private void startRecycler() {
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter = new StaggeredRecyclerViewAdapter(this, listitems);
        recycler.setAdapter(adapter);
    }
}
