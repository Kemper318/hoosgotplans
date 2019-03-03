package android.com.hoosgotplans.munchmadness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EventListActivity extends AppCompatActivity {

    private RecyclerView eventListView;
    private List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event_list);

        eventList = getEvents();

        eventListView = findViewById(R.id.event_list_view);
    }


/*    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Get event that was clicked on.
        Event event = eventList.get(position);

        // Open the detail view for that event.
    }*/

    public List<Event> getEvents() {
        return new ArrayList<>();
    }
}