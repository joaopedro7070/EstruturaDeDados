public class Lista<T> {
    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Lista() {
        this("Lista");
    }

    public Lista(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void removeInicio() {
        if (primeiroNo == null) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("DADO: " + primeiroNo.getDado() + " REMOVIDO");

            if (primeiroNo == ultimoNo) {
                primeiroNo = null;
                ultimoNo = null;
            } else {
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }

    public void addFim(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeFim() {
        if (primeiroNo == null) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("DADO: " + ultimoNo.getDado() + " REMOVIDO");
            
            if (primeiroNo == ultimoNo) {
                primeiroNo = null;
                ultimoNo = null;
            } else {
                No<T> aux = primeiroNo;

                while(aux.getNextNo() != ultimoNo){
                    aux = aux.getNextNo();
                }
                ultimoNo = aux;
                aux.setNextNo(null);
            }
        }
    }


    

    public void imprimeLista() {
        if (primeiroNo == null) {
            System.out.println("A lista está vazia");
            return;
        }

        System.out.println("Dados da lista " + nomeLista + ":");
        No<T> atual = primeiroNo;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getNextNo();
        }
    }
}
