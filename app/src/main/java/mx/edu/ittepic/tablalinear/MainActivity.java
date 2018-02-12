package mx.edu.ittepic.tablalinear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView resultado;
EditText numero;
Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=findViewById(R.id.resultado);
        numero=findViewById(R.id.nume);
        calcular=findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena="";
                String result12="";
                cadena=numero.getText().toString();
                int num=Integer.parseInt(cadena);
                for (int i=0;i<=10;i++){
                    int result=i*num;
                    result12 += i+ " x " + num + " = " + String.valueOf(result) + '\n';
                }
                resultado.setText(result12);
            }
        });
    }
}
