package ru.mirea.boretskiyib.intentfilter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Открыть браузер
    public void onClickOpenBrowser(View view) {
        Uri address = Uri.parse("https://www.mirea.ru");
        Intent intent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(intent);
    }

    // Поделиться текстом
    public void onClickShare(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        intent.putExtra(Intent.EXTRA_TEXT, "Борецкий Илья Богданович");
        startActivity(Intent.createChooser(intent, "Поделиться"));
    }
}