package ru.mirea.boretskiyib.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Связываем переменные с элементами на экране
        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        // Обработчик для первой кнопки (через слушатель)
        View.OnClickListener whoAmIListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку № X"); // Вставь свой номер
                checkBox.setChecked(true);
            }
        };
        btnWhoAmI.setOnClickListener(whoAmIListener);

        // Обработчик для второй кнопки (через метод)
    }

    // Метод для второй кнопки (вызывается по onClick в XML)
    public void onItIsNotMeClick(View view) {
        tvOut.setText("Это не я сделал!");
        checkBox.setChecked(false);
    }
}