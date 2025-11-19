package com.example.krylov_is_09_10112025;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Calculator calculatorState;
    private TextView displayView;


    private static final String CALCULATOR_STATE_KEY = "calculator_state";

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

        if (savedInstanceState != null) {
            calculatorState = savedInstanceState.getParcelable(CALCULATOR_STATE_KEY);
        }

        if (calculatorState == null) {
            calculatorState = new Calculator();
        }

        initView();
        updateDisplay();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(CALCULATOR_STATE_KEY, calculatorState);
    }

    private void initView() {
        displayView = findViewById(R.id.textView);

        initButton0ClickListener();
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButtonClearClickListener();
    }

    private void updateDisplay() {
        displayView.setText(calculatorState.getDisplayText());
    }

    private void initButton0ClickListener() {
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("0");
                updateDisplay();
            }
        });
    }

    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("1");
                updateDisplay();
            }
        });
    }

    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("2");
                updateDisplay();
            }
        });
    }

    private void initButton3ClickListener() {
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("3");
                updateDisplay();
            }
        });
    }

    private void initButton4ClickListener() {
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("4");
                updateDisplay();
            }
        });
    }

    private void initButton5ClickListener() {
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("5");
                updateDisplay();
            }
        });
    }

    private void initButton6ClickListener() {
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("6");
                updateDisplay();
            }
        });
    }

    private void initButton7ClickListener() {
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("7");
                updateDisplay();
            }
        });
    }

    private void initButton8ClickListener() {
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("8");
                updateDisplay();
            }
        });
    }

    private void initButton9ClickListener() {
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.appendNumber("9");
                updateDisplay();
            }
        });
    }

    private void initButtonClearClickListener() {
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorState.clear();
                updateDisplay();
            }
        });
    }
}