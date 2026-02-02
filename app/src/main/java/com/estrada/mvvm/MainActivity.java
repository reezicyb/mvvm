package com.estrada.mvvm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<UserItem> items = new ArrayList<>();
        items.add(new UserItem(R.drawable.user1, "Raiko Rainer Jones Estrada", "Last seen: 2 mins ago"));
        items.add(new UserItem(R.drawable.user2, "Mar Neil Jardenico", "Last seen: 1 hour ago"));
        items.add(new UserItem(R.drawable.user3, "Jay Mary Ompad", "Last seen: Dec 30"));
        items.add(new UserItem(R.drawable.user4, "Quiela Marie Tacugue", "Last seen: Jan 15"));
        items.add(new UserItem(R.drawable.user5, "Delmar Sosmena", "Last seen: 12 hours ago"));
        items.add(new UserItem(R.drawable.user6, "Karlo Andrei Saren", "Active now"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserAdapter(this, items));
    }
}