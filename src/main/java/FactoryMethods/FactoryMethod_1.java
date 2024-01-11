package FactoryMethods;

public class FactoryMethod_1 {
//    Criado Abstrato
//    Produto Abstrato
//    Criador Concreto => Classe que cria o objeto
//    Produto Concreto => Instância do objeto criado

    @SuppressWarnings("unused")public static void main(String[] args){
        Categoria categoria = new Digital();
        Produto produto = categoria.novoProduto();
    }
}


interface Produto {
}

class ProdutoDigital1 implements Produto{}
class ProdutoFisico1 implements Produto{}

interface Categoria {
    Produto novoProduto();
}

class Digital implements Categoria{
    @Override
    public Produto novoProduto(){
        return new ProdutoDigital1();
    }
}
class Fisico implements Categoria{
    @Override
    public Produto novoProduto(){
        return new ProdutoFisico1();
    }
}