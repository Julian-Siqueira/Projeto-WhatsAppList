package com.example.whatsapplist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapplist.Adapter.AdapterUser;
import com.example.whatsapplist.Model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_users;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycler_users = findViewById(R.id.recycle_users);
        recycler_users.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recycler_users.setHasFixedSize(true);
        AdapterUser adapterUser = new AdapterUser(userList);
        recycler_users.setAdapter(adapterUser);
        Users();
    }

    public void Users(){
        User user1 = new User(R.drawable.usuario1, "Ricardo", "Você viu o jogo ontem ?", "10:33", "1");
        userList.add(user1);

        User user2 = new User(R.drawable.usuario2, "Maria", "Boa noite", "Yesterday", "2");
        userList.add(user2);

        User user3 = new User(R.drawable.usuario3, "Alberto", "Enviei o formulário!", "09:11");
        userList.add(user3);

        User user4 = new User(R.drawable.usuario4, "Pedro", "Vai ter uma festa sábado", "4 NOV","3");
        userList.add(user4);

        User user5 = new User(R.drawable.usuario5, "Fernanda", "Vamos sair hoje ?", "11:34");
        userList.add(user5);

        User user6 = new User(R.drawable.usuario6, "Gabriela", "Já fez ?", "Yesterday","7");
        userList.add(user6);

        User user7 = new User(R.drawable.usuario7, "Fabio", "Ainda tem 3 sobrando, vai querer ?", "14:22","1");
        userList.add(user7);

        User user8 = new User(R.drawable.usuario8, "Rebeca", "Como vai ?", "22 SET");
        userList.add(user8);

        User user9 = new User(R.drawable.usuario9, "Carlos", "Já fez o update ?", "11:09");
        userList.add(user9);

        User user10 = new User(R.drawable.usuario10, "Paulo", "Acabou chovendo kkkk", "10:34","1");
        userList.add(user10);

        User user11 = new User(R.drawable.usuario11, "Felipe", "Com certeza não!", "4 NOV");
        userList.add(user11);

        User user12 = new User(R.drawable.usuario12, "Jessica", "Teve bolo de morango", "Yesterday","1");
        userList.add(user12);

        User user13 = new User(R.drawable.usuario13, "Cintia", "Já foi entregue!", "15 DEZ");
        userList.add(user13);

        User user14 = new User(R.drawable.usuario14, "Rafael", "Pneu Furou!", "Yesterday","2");
        userList.add(user14);
    }
}