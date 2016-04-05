import java.util.*;

class Retangulo {

  private double base;
  private double altura;

  // Construtores
  public Retangulo() {
    setBase(0);
    setAltura(0);
  }

  public Retangulo(double valor) {
    setBase(valor);
    setAltura(valor);
  }

  public Retangulo(double base, double altura) {
    setBase(base);
    setAltura(altura);
  }

  // Seta Base
  public void setBase(double base) {
    this.base = base;
  }

  // Seta Altura
  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Retorna area do triangulo
  public double getArea() {
    return (this.base * this.altura);
  }

  // Retorna perimetro do triangulo
  public double getPerimetro() {
    return ((this.base + this.altura) * 2);
  }

  // Retorna diagonal do triangulo
  public double getDiagonal() {
    double powBase = Math.pow(this.base, 2);
    double powAltura = Math.pow(this.altura, 2);
    return Math.sqrt(powBase + powAltura);
  }

  // Main
  public static void main(String[] args) {
    Retangulo meuRetangulo = new Retangulo(10);
    System.out.println("Area do retangulo: " + meuRetangulo.getArea());
    System.out.println("Perimetro do retangulo: " + meuRetangulo.getPerimetro());
    System.out.println("Diagonal do retangulo: " + meuRetangulo.getDiagonal());
  }
}
