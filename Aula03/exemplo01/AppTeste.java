package exemplo01;

public class AppTeste {
   public static void main(String args[]){
      TesteStatic t1, t2;

      t1 = new TesteStatic();
      t2 = new TesteStatic();

      t1.atributo1 = 10;
      t1.atributo2 = 100;

      t2.atributo1 = 20;
      t2.atributo2 = 200;

      TesteStatic.ATRIBUTO3 = 500;

      t1.exibirAtributos("t1");

      t1.ATRIBUTO3 = 300;

      t2.exibirAtributos("t2");

   }
}
