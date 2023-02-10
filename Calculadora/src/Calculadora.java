/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Calculadora {

    private int op1;
    private int op2;
    private int resultado;

    public Calculadora(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getResultado() {
        return resultado;
    }

    int suma(int op1, int op2) {
        return resultado = this.op1 + this.op2;
    }

    int resta(int op1, int op2) {
        return resultado = this.op1 - this.op2;
    }

    int multiplicion(int op1, int op2) {
        return resultado = this.op1 * this.op2;
    }

    int division(int op1, int op2) {
        return resultado = this.op1 / this.op2;
    }

}
