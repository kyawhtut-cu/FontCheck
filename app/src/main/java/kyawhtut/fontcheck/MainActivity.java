package kyawhtut.fontcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.kyawhtut.FontUtil;

public class MainActivity extends AppCompatActivity {

    FontUtil fontUtil;

    EditText user_input;
    TextView result, final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fontUtil = new FontUtil();

        user_input = (EditText) findViewById(R.id.user_input);
        result = (TextView) findViewById(R.id.result);
        final_text = (TextView) findViewById(R.id.final_text);

        user_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (user_input.getText().toString().length() > 0) {
                    result.setVisibility(View.VISIBLE);
                    if (fontUtil.isZawgyi(user_input.getText().toString())) {
                        result.setText("This input text is Zawgyi");
                        final_text.setText(fontUtil.zawgyi2unicode(user_input.getText().toString()));
                    } else {
                        result.setText("This input text is Unicode");
                        final_text.setText(fontUtil.unicode2zawgyi(user_input.getText().toString()));
                    }
                } else {
                    result.setVisibility(View.GONE);
                    final_text.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
