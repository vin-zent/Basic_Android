
package com.example.module2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;
import java.util.Calendar;

public class DateActivity extends AppCompatActivity {
    DatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        date =(DatePicker) findViewById(R.id.pikerdate);
        Calendar cal =Calendar.getInstance();
        date.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(DateActivity.this, "Date :"+date.getDayOfMonth()+"/"+date.getMonth()+"/"+date.getYear(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}