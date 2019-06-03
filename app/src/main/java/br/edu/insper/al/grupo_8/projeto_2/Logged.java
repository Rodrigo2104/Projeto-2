package br.edu.insper.al.grupo_8.projeto_2;

import android.app.Application;
import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Logged extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseAuth authentication = FirebaseAuth.getInstance();
        FirebaseUser user = authentication.getCurrentUser();

//        if(user!=null) {
//            Intent intent = new Intent(this,HomeActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(intent);
//        }
    }
}
