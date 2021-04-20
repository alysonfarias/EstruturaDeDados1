public class LDESemOrdenadoSemRepetidos<T extends Comparable<T>> {

    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    // métodos publicos para manipular a lista
    public boolean isEmpty() {
        return qtd == 0;
    }

    public void inserirValorInicio(T value) {
        LDENode<T> newValue = new LDENode(value);
        if (isEmpty()) {
            this.prim = newValue;
            this.ult = newValue;
            qtd++;
            System.out.println("Valor inserido!");

        } else {
            newValue.setProx(prim);
            prim.setAnt(newValue);
            this.prim = newValue;
            qtd++;
            System.out.println("Valor inserido!");
        }
    }

    public void inserirValorFinal(T value) { // insere sem repetidos
        LDENode<T> newValue;
        newValue = new LDENode(value);
        if (isEmpty() == true) {
            prim = newValue;
            ult = newValue;
            qtd++;
            System.out.println("Valor inserido!");

        } else {
            ult.setProx(newValue);
            newValue.setAnt(ult);
            ult = newValue;
            qtd++;
            System.out.println("Valor inserido!");

        }

    }

    public void removePrimeiro() {
        if (isEmpty()) {
            System.err.println("Nenhum valor a ser removido!");
        } else if (this.qtd == 1) {
            ult = null;
            prim = null;
            qtd--;
            System.out.println("Único valor da lista foi removido");
        } else {
            prim = prim.getProx();
            prim.setAnt(null);
            qtd--;
            System.out.println("Valor removido!");
        }
    }

    public void removeUltimo() {
        if (isEmpty()) {
            System.err.println("Nenhuma pessoa a ser removida!");
        } else {
            if (this.qtd == 1) {
                ult = null;
                prim = null;

            } else {
                ult = ult.getAnt();
                ult.setProx(null);
            }
            qtd--;
            System.err.println("Pessoa removida!");
        }
    }

    public void exibirLista() {
        LDENode<T> aux;
        if (isEmpty() == true) {
            System.err.println("Lista vázia");
        } else {
            aux = this.prim;
            System.out.println("LISTA de DADOS");
            System.out.print("[ ");
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println(" ]");
        }
    }

    public void remover(T valor) {
        LDENode<T> aux, ant, prox;
        if (isEmpty()) {
            System.err.println("Lista vazia");
        } else if (qtd == 1) {
            if (valor.compareTo(prim.getInfo()) == 0) {
                prim = null;
                ult = null;
                qtd = 0;
                System.err.println("Pessoa removida");
            } else {
                System.err.println("Pessoa não encontrada");

            }

        } else {
            aux = buscarElemento(valor);
            if (aux == null) {
                System.err.println("Pessoa não encontrada");
            } else {
                if (aux == prim) { //remocao inicio
                    prim = prim.getProx();
                    prim.setAnt(null);
                } else if (aux == ult) { // remocao no ultimo
                    ult = ult.getAnt();
                    ult.setProx(null);
                } else { // remocao no meio
                    ant = aux.getAnt();
                    prox = aux.getProx();
                    ant.setProx(prox);
                    ant.setAnt(ant);

                }
                qtd--;
                System.err.println("Pessoa removida!");
            }

        }

    }

    public LDENode<T> buscarElemento(T valor) {
        LDENode<T> aux = this.prim;
        T auxCliente;
        for (int i = 0; i < qtd; i++) {
            auxCliente = aux.getInfo();
            if (auxCliente.compareTo(valor) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public T buscarPessoa(T c) {
        LDENode<T> resp;
        if (qtd == 0) {
            return null;
        } else {
            resp = buscarElemento(c);
            if (resp == null) {
                return null;
            } else {
                return resp.getInfo();
            }
        }
    }

    public void numeroPessoas() {
        if (isEmpty()) {
            System.err.println("0 pessoas");
        } else {
            System.out.println("Total de pessoas no prédio: " + this.qtd);
        }
    }

}
