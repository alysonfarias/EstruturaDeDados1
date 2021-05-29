package br.unicap.ed.TAD;

public class Stack<T> {

    private StackNode<T> topo;

    public boolean isEmpty() { // verifica se a pilha está vazia
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // verifica se a pilha está cheia (abstrato)
        return false;
    }

    public void push(T valor) { //insere valor no topo da pilha
        StackNode<T> novo = new StackNode(valor);
        if (isEmpty()) {
            topo = novo;
        } else {
            novo.setProx(topo);
            topo = novo;
        }
    }

    public T pop() {  // desempilhar
        T valor = topo.getInfo();
        topo = topo.getProx();
        return valor;
    }

    public T top() { // informa o topo
        return topo.getInfo();
    }

}
