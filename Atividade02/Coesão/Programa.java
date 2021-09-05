/* A classe Programa tem responsabilidades que n�o s�o suas, como obter um produto e grav�-lo no banco de dados. 
   Ent�o, dizemos que esta classe n�o est� coesa, ou seja, ela tem responsabilidades demais, e o que � pior, 
   responsabilidades que n�o s�o suas. */

package Coes�o;

public class Programa {
    public void ExibirFormulario() {
        //implementa��o
    }

    public void ObterProduto() {
        //implementa��o
    }

    public void gravarProdutoDB() {
        //implementa��o
    }
}

/* Uma clara separa��o de responsabilidades, o que contribui para um design desacoplado e organizado. 
   O formul�rio n�o assume o papel de cadastrar o produto, ele pede a quem tem a responsabilidade para 
   que fa�a tal tarefa */

/*
 public class Programa {
       public void MostrarFormulario() {
         //Implementa��o
       }

     public void BotaoGravarProduto( ) {
         Produto.gravarProduto();
     }

 }
*/