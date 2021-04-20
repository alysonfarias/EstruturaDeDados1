public class LDESemOrdenadoComRepetidos<T extends Comparable<T>> {

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
    
        public void inserirValorFinal(T value) {
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
                System.err.println("Nenhum valor a ser removido!");
            } else if (this.qtd == 1) {
                ult = null;
                prim = null;
                qtd--;
                System.out.println("Único valor da lista foi removido");
            } else {
                ult = ult.getAnt();
                ult.setProx(null);
                qtd--;
                System.out.println("Valor removido!");
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
    
    }
