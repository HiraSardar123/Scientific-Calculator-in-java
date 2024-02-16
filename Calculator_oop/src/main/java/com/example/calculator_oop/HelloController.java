package com.example.calculator_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private boolean is_first =true;
    private String operators_value="";
    private float num1=0;
    private float num2=0;

    public float getNum2() {
        return num2;
    }


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }


    public void setIs_first(boolean is_first) {
        this.is_first = is_first;
    }

    @FXML
    private Label Output;


    public String getOperators_value() {
        return operators_value;
    }

    public void setOperators_value(String operators_value) {
        this.operators_value = operators_value;
    }
    Calculate calculate=new Calculate();
    @FXML
    private Button ans_button;

    @FXML
    private Button square;

    @FXML
    private Button button_addition;

    @FXML
    private Button button_clear;

    @FXML
    private Button decimal;


    @FXML
    private Button button_e_to_x;

    @FXML
    private Button button_eight;

    @FXML
    private Button button_five;

    @FXML
    private Button button_four;

    @FXML
    private Button button_modulus;

    @FXML
    private Button button_multiply;

    @FXML
    private Button button_nine;

    @FXML
    private Button button_one;

    @FXML
    private Button button_seven;

    @FXML
    private Button button_six;

    @FXML
    private Button button_subtract;

    @FXML
    private Button button_two;

    @FXML
    private Button button_zero;

    @FXML
    private Button buttton_three;

    @FXML
    private Button cube;

    @FXML
    private Button cos;

    @FXML
    private Button divide_button;

    @FXML
    private Button equals;

    @FXML
    private Button sin;

    @FXML
    private Button tan;
    //Providing action events for binary operators.
    @FXML
    void add(ActionEvent event) {
        if(!operators_value.isEmpty())
                return;
        setOperators_value("+");
        setNum1(Float.parseFloat(Output.getText()));
        Output.setText("+");
        setIs_first(true);
    }

    @FXML
    void divide(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("/");
        setNum1(Float.parseFloat(Output.getText()));
        Output.setText("/");
        setIs_first(true);
    }

    @FXML
    void modulus(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("%");
        setNum1(Float.parseFloat(Output.getText()));
        Output.setText("%");
        setIs_first(true);
    }
    @FXML
    void multiply(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("*");
        setNum1(Float.parseFloat(Output.getText()));
        Output.setText("*");
        setIs_first(true);
    }

    @FXML
    void subtract(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "-");
        setIs_first(true);
    }
    //Providing action event for '='.
    @FXML
    void equals(ActionEvent event) {
        if(operators_value.isEmpty())
            return;
        num2=Float.parseFloat(Output.getText());
        float gotten_val=calculate.calculateBinaryNumber(getNum1(), getNum2(), getOperators_value());
        if(gotten_val%1==0) {
            gotten_val = (int) gotten_val;
            Output.setText(String.format("%.0f", gotten_val));
        }
        else{
            gotten_val=(float)gotten_val;
            Output.setText(String.format("%.2f", gotten_val));
        }
        setIs_first(true);
        setOperators_value("");
    }

    //Providing action events for trignometric functions.
    @FXML
    void cosine(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("cos");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        Output.setText(String.valueOf(output));
        setOperators_value("");
        setIs_first(true);
    }
    @FXML
    void sine(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("sin");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        Output.setText(String.valueOf(output));
        setOperators_value("");
        setIs_first(true);
    }

    @FXML
    void tangent(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("tan");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        Output.setText(String.valueOf(output));
        setOperators_value("");
        setIs_first(true);
    }
    @FXML
    void e_exp_x(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("e^x");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        if(output%1==0){
            output=(int)output;
            Output.setText(String.format("%.0f", output));}
        else{
            output=(float)Math.floor(output);
            Output.setText(String.format("%.2f", output));
        }
        setOperators_value("");
        setIs_first(true);
    }

    @FXML
    void delete(ActionEvent event) {
        if (Output != null && (String.valueOf(Output)).length() > 0){
            Output.setText(String.valueOf(Output.getText().substring(0, Output.getText().length() - 1)));
        }
        else {
            Output.setText("0");
        }
    }

    @FXML
    void square(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("x^2");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        if(output%1==0){
            output=(int)output;
            Output.setText(String.format("%.0f", output));}
        else{
            output=(float)Math.floor(output);
            Output.setText(String.format("%.2f", output));
        }
        setOperators_value("");
        setIs_first(true);
    }

    @FXML
    void cube(ActionEvent event) {
        if(!operators_value.isEmpty())
            return;
        setOperators_value("x^3");
        num1=Float.parseFloat(Output.getText());
        Output.setText("");
        float output=calculate.calculateUnaryNumber(getNum1(),getOperators_value());
        if(output%1==0){
            output=(int)output;
            Output.setText(String.format("%.0f", output));}
        else{
            output=(float)Math.floor(output);
            Output.setText(String.format("%.2f", output));;
        }
        setOperators_value("");
        setIs_first(true);
    }

    @FXML
    void clear(ActionEvent event) {
        setOperators_value("");
        setIs_first(true);
        Output.setText("");
    }

    //Action event for numbers.
    @FXML
    void zero(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "0");
    }

    @FXML
    void one(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "1");
    }

    @FXML
    void two(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "2");
    }

    @FXML
    void three(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "3");
    }

    @FXML
    void four(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "4");
    }

    @FXML
    void five(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "5");
    }

    @FXML
    void six(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "6");
    }

    @FXML
    void seven(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "7");
    }

    @FXML
    void eight(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "8");
    }

    @FXML
    void nine(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ "9");
    }
    @FXML
    void decimal(ActionEvent event) {
        if(is_first){
            Output.setText("");
            setIs_first(false);
        }
        Output.setText(Output.getText()+ ".");
    }

}
