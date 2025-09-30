package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos {
  private double [] vector;
  private final int TAMANIO = 5;

  public OperacionesArreglos(){
      this.vector= new double[TAMANIO];
  }
  public OperacionesArreglos(int tamanio){
      this.vector= new double[tamanio];
  }
  public OperacionesArreglos(double[] vector){
      this.vector=new double[vector.length];
      this.LlenarArreglo(vector);
  }
  public void LlenarArreglo(double[]vector){
        int i=0;
        while (i<this.vector.length){
            this.vector[i]=vector[i];
            i++;
        }
  }
  public void LlenarArreglo(){
      for (int i = 0; i < vector.length; i++) {
          vector[i]= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posicion [ " + i + " ]"));
      }
  }
  public double sumarValores(){
      double total=0.0;
      for (double valor: vector){
         total+=valor;
      }
      return total;
  }
  public double obtenerValorMaximo(){
      double valorM=0.0;
      for (int i = 1; i < vector.length; i++) {
          if (vector[i] > valorM) {
              valorM = vector[i];
          }
      }
      return valorM;
  }
    public double obtenerValorMinimo(){
        double valorM=0.0;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < valorM) {
                valorM = vector[i];
            }
        }
        return valorM;

  }
  public boolean compararArreglos( double[]vector){
         boolean isEquals= true;

         if (vector.length!=this.vector.length){
             isEquals=false;
         }else {
             for (int i = 0; i < this.vector.length && isEquals; i++) {
                 if (this.vector[i]!= vector[i])
                     isEquals=false;
             }

         }
         return isEquals;
  }
  public void cambiarTamanioArreglo(int tamanio){
    double temp[]=new double[tamanio];
      for (int i = 0; i < this.vector.length; i++) {
          temp[i]=this.vector[i];
      }
      this.vector=temp;
      temp=null;
  }
  public String buscarValor(double valor){
      String salida="";
      boolean sentinel=false;
      for (int i = 0; i < this.vector.length; i++) {
          if (valor==this.vector[i]){
              sentinel=true;
              salida="El valor" + valor + "se encuentra en la pisicion " + i;
              break;
          }
      }
      if (!sentinel)
          salida= "El valor no se encontro en el arreglo";
      return salida;
  }

  public void imprimir(){
      String salida="";
      for (double valor: vector){
          salida+="| " + valor + " |";
      }
      JOptionPane.showMessageDialog(null, salida);
  }
}
