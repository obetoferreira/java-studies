/**
*
* Exemplo MyIO
* Para usar as funções do MyIO, basta copiar o arquivo MyIO.java para o mesmo diretório da classe que deseja utilizar.
*
**/
class Soma {
   public static int soma(int a, int b){
      int resp;
      resp = a + b;
      return resp;
   }

   public static void main (String[] args){
      //declarar as variaveis
      int num1, num2, s;

      //ler o valor das variaveis
      num1 = MyIO.readInt("Digite uma variavel: ");
      num2 = MyIO.readInt("Digite outra variavel: ");

      //chamar o metodo soma
      s = soma(num1, num2);

      //Mostrar na tela
      MyIO.println("Soma" + s);
   }//fim main
}//fim class
