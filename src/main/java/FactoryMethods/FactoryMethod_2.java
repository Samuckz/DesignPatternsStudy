package FactoryMethods;

public class FactoryMethod_2 {

    //    Produto Abstrato
    //    Criador Concreto => Classe que cria o objeto
    //    Produto Concreto => Instância do objeto criado

    /*
    * Netse exemplo é ginorado a interface para os criados, apenas são implementados os criadores concretos
    * */

    @SuppressWarnings("unused")
    public static void main(String[] args){
        Categoria2 categoria = new Categoria2();
        Produto2 produto2 = categoria.novoProduto();;
    }
}

// Interface que descreve o produto a ser criado
interface Produto2{

}

class ProdutoDigital implements Produto2 {}

class ProdutoFisico implements Produto2{}

class Categoria2 {
    public Produto2 novoProduto(){
        return new ProdutoFisico();
    }
}

class CategoriaDigital extends Categoria2{
    public Produto2 novoProduto(){
        return new ProdutoDigital();
    }
}
