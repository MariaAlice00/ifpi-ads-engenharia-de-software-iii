/* A classe Programa tem responsabilidades que não são suas, como obter um produto e gravá-lo no banco de dados. 
   Então, dizemos que esta classe não está coesa, ou seja, ela tem responsabilidades demais, e o que é pior, 
   responsabilidades que não são suas. */

package Coesão;

public class Programa {
    public void ExibirFormulario() {
        //implementação
    }

    public void ObterProduto() {
        //implementação
    }

    public void gravarProdutoDB() {
        //implementação
    }
}

/* Uma clara separação de responsabilidades, o que contribui para um design desacoplado e organizado. 
   O formulário não assume o papel de cadastrar o produto, ele pede a quem tem a responsabilidade para 
   que faça tal tarefa */

/*
 public class Programa {
       public void MostrarFormulario() {
         //Implementação
       }

     public void BotaoGravarProduto( ) {
         Produto.gravarProduto();
     }

 }
*/