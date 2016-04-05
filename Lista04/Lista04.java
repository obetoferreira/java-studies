import java.util.*;

class Lista04 {

  /**
  *
  * 01) Multiplicação sem usar multiplicação
  *
  **/
  public static int multiply(int foo, int bar){
    int output = 0;
    for (int i = 0; i < foo; i++){
      output = output + bar;
    }
    return output;
  }

  /**
  *
  * 02) Soma dos elementos do array
  *
  **/
  public static int arraySum(int[] arr){
    int output = 0;
    for (int i = 0; i < arr.length; i++){
      output = output + arr[i];
    }
    return output;
  }

  /**
  *
  * 03) Média dos elementos do array
  *
  **/
  public static int arrayAverage(int[] arr){
    int output = 0;
    for (int i = 0; i < arr.length; i++){
      output = output + arr[i];
    }
    output = (output / arr.length);
    return output;
  }

  /**
  *
  * 04) Maior elemento do array
  *
  **/
  public static int largerFromArray(int[] arr){
    int larger = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > larger) {
        larger = arr[i];
      }
    }
    return larger;
  }

  /**
  *
  * 05) Menor elemento do array
  *
  **/
  public static int smallestFromArray (int[] arr) {
    int smallest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  /**
  *
  * 06) Segundo maior do array
  *
  **/
  public static int secondLargerFromArray (int[] arr) {
    int larger = arr[0];
    int secondLarger = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > larger) {
        if (larger >= secondLarger) {
          secondLarger = larger;
        }
        larger = arr[i];
      } else if (arr[i] > secondLarger) {
        secondLarger = arr[i];
      }
    }
    return secondLarger;
  }

  /**
  *
  * 07) Caracteres substituidos por "@"
  *
  **/
  public static String replaceCharByAt (String str, char chr) {
    String output = str.replaceAll(Character.toString(chr), "@");
    return output;
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
    while (userChoice < 0 || userChoice > 14) {
      System.out.println("Fala maluco! Digite um número entre 01 a 14 (Digite 0 se deseja sair do programa).");
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
        System.out.println("Informe dois números inteiros: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = multiply(x, y);
        System.out.println("O número " + x + " multiplicado por " + y + " é igual a: " + z);
        break;
      }
      case 2: {
        System.out.println("Quantos números quer somar?");
        int num = scan.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
          System.out.println("Valor do " + (i + 1) + "º número: ");
          numArr[i] = scan.nextInt();
        }
        System.out.println("Soma dos elementos do array: " + arraySum(numArr));
        break;
      }
      case 3: {
        System.out.println("Quer saber a média de quantos números?");
        int num = scan.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
          System.out.println("Valor do " + (i + 1) + "º número: ");
          numArr[i] = scan.nextInt();
        }
        System.out.println("Média dos elementos do array: " + arrayAverage(numArr));
        break;
      }
      case 4: {
        System.out.println("Quantos números deseja guardar na memória?");
        int num = scan.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
          System.out.println("Valor do " + (i + 1) + "º número: ");
          numArr[i] = scan.nextInt();
        }
        System.out.println("O maior número do array é: " + largerFromArray(numArr));
        break;
      }
      case 5: {
        System.out.println("Quantos números deseja guardar na memória?");
        int num = scan.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
          System.out.println("Valor do " + (i + 1) + "º número: ");
          numArr[i] = scan.nextInt();
        }
        System.out.println("O menor número do array é: " + smallestFromArray(numArr));
        break;
      }
      case 6: {
        System.out.println("Quantos números deseja guardar na memória?");
        int num = scan.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
          System.out.println("Valor do " + (i + 1) + "º número: ");
          numArr[i] = scan.nextInt();
        }
        System.out.println("O segundo maior número do array é: " + secondLargerFromArray(numArr));
        break;
      }
      case 7: {
        System.out.println("Informe uma string:");
        String str = scan.nextLine();
        System.out.println("Informe um caractere:");
        char chr = scan.next().charAt(0);
        System.out.println("Resultado: " + replaceCharByAt(str, chr));
      }
    }
  }
}
