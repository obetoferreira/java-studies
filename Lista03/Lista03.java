import java.util.*;

class Lista03 {

  /**
  *
  * 01) Retorna booleano se for positivo
  *
  **/
  public static boolean isPositive(Double foo){
    boolean output = false;
    if (foo > 0){
      output = true;
    }
    return output;
  }

  /**
  *
  * 02) Retorna booleano se for nulo
  *
  **/
  public static boolean isNull(Double foo){
    boolean output = false;
    if (foo == null){
      output = true;
    }
    return output;
  }

  /**
  *
  * 04) Retorna um numero aleatorio de 0 a 10
  *
  **/
  public static int randomNumber(){
    int foo = (int) (Math.random() * 11);
    // foo = foo % 11;
    return foo;
  }

  /**
  *
  * 05) Executa o método randomNumber um milhão de vezes
  *
  **/
  public static int runRandomMillion(){
    int[] list = new int[10];
    for (int i = 0; i < 100; i++) {
      int index = randomNumber();
      list[index]++;
    }
    return list[index]
  }

  public static double convertFarenheit (double celsius) {
    double farenheit = ((9 * celsius) / 5 ) + 32;

    return farenheit;
  }

  public static double convertCelsius (double farenheit) {
    double celsius =

    return celsius;

  }

  /**
  *
  * Main method
  *
  **/
  public static void main(String[] args) {

    /**
    *
    * Variáveis
    *
    **/
    Scanner scan = new Scanner(System.in); // Scanner
    int userChoice = -1;

    /**
    *
    * Segue o jogo
    *
    **/
    while (userChoice < 0 || userChoice > 37) {
      System.out.println("Fala maluco! Digite um número entre 01 a 37 (Digite 0 se deseja sair do programa).");
      userChoice = scan.nextInt();
    }

    if (userChoice == 0) {
      System.out.println("Flws, vlws!");
      return;
    } else {
      System.out.println("Massa, aí vai a questão " + userChoice + "...");

    }

    switch ((int) userChoice) {
      case 1: {
        System.out.println("Informe um número real: ");
        Double x = scan.nextDouble();
        if(isPositive(x)){
          System.out.println("O número informado é positivo.");
        } else {
          System.out.println("O número informado é negativo.");
        }
        break;
      }
      case 2: {
        System.out.println("Informe um número real: ");
        Double x = scan.nextDouble();
        if(isNull(x)){
          System.out.println("O número informado é nulo.");
        } else {
          System.out.println("O número informado não é nulo.");
        }
        break;
      }
      case 3: {
        System.out.println("Informe três números reais: ");
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        break;
      }
      case 4: {
        System.out.println("Um número aleatório, de 0 a 10 é: " + randomNumber());
        break;
      }
      case 5: {

      }
    }
  }
}
