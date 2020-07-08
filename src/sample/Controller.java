package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    public TextField numero1;
    @FXML
    public TextField numero2;
    @FXML
    public TextField numero3;
    @FXML
    public Label resultadoDelta;
    @FXML
    public Label resultadoConcavidade;
    @FXML
    public Label resultadoX1;
    @FXML
    public Label resultadoX2;
    @FXML
    public Label erro;

    @FXML
    private void btnCalcular(){
        if ("".equals(numero1.getText()) || "".equals(numero1.getText()) || "".equals(numero1.getText())){
            erro.setText("Não deixe os campos vazios");
        }else{
            erro.setText("");
        }

        float n1 = Float.parseFloat(numero1.getText());
        float n2 = Float.parseFloat(numero2.getText());
        float n3 = Float.parseFloat(numero3.getText());

        resultadoDelta.setText(String.valueOf((Math.pow(n2, 2)) - (4 * n1 * n3) ));

        if(n1 > 0){
            resultadoConcavidade.setText("Concavidade para cima");
        }else{
            resultadoConcavidade.setText("Concavidade para baixo");
        }

        float vD = Float.parseFloat(resultadoDelta.getText());
        float valorX1 = (- n2 + vD) / (2 * n1);
        float valorX2 = (- n2 - vD) / (2 * n1);

        if(vD < 0){
            resultadoX1.setText("Não possui raizes reais");
            resultadoX2.setText("Não possui raizes reais");
        } else {
            resultadoX1.setText(String.valueOf(valorX1));
            resultadoX2.setText(String.valueOf(valorX2));
        }
    }
    @FXML
    private void btnLimpar(){
        resultadoDelta.setText("");
        resultadoConcavidade.setText("");
        resultadoX1.setText("");
        resultadoX2.setText("");
        numero1.setText("");
        numero2.setText("");
        numero3.setText("");
        erro.setText("");
    }
}
