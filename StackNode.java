package br.unicap.ed.TAD;

public class StackNode<T> {

    private T info;
    private StackNode<T> prox;

    StackNode (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public StackNode<T> getProx() {
        return prox;
    }

    public void setProx(StackNode<T> novoProx) {
        this.prox = novoProx;
    }

}
