package radiobutton.studio.com.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton radioChoosed;
    private Button buttonChoose;
    private TextView textViewShowed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        buttonChoose = findViewById(R.id.buttonChooseId);
        textViewShowed = findViewById(R.id.textViewShowId);

        buttonChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroup.getCheckedRadioButtonId() > 0){
                    radioChoosed = findViewById(radioGroup.getCheckedRadioButtonId());
                    textViewShowed.setText(radioChoosed.getText());
                }else{
                    textViewShowed.setText("Por favor, selecione um item.");
                }
            }
        });
    }
}
