package br.unicap.LDE.listas;

class LDENode<T extends Comparable<T>> {

    private T info;
    private LDENode<T> ant;
    private LDENode<T> prox;

    LDENode(T valor) {
        this.info = valor;
    }

    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

     LDENode<T> getAnt() {
        return ant;
    }

    void setAnt(LDENode<T> ant) {
        this.ant = ant;
    }

     LDENode<T> getProx() {
        return prox;
    }

    void setProx(LDENode<T> prox) {
        this.prox = prox;
    }

}
