public class Deque<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeDeque;
    private int tamanho;

public Deque(String nomeDeque)  {
    this.nomeDeque = nomeDeque;
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanho = 0;
}
public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }
    
    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(ultimoNo ==  null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        ultimoNo.setIndice(tamanho);
        tamanho++;
}
public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Listavazia!");
        }else{
            System.out.println("Dado: " + primeiroNo.getDado() + " removido!");
            //T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
                atualizaIndice();
            }else{
                ultimoNo = null;
            }
            tamanho--;
        }
    }
    public void removeFinal(){
         if(ultimoNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.println("Dado: " + ultimoNo.getDado() + " removido!");
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
              primeiroNo = null;
            }
            tamanho--;
        }
        
    }
}

public void peekInicio(){
    if(primeiroNo == null){
        System.out.println("Deque vazio!");
        return;
    }else{
        System.out.println("Dado Inicio:" + primeiroNo.toString());
    }
}

    public void peekFinal(){
    if(ultimoNo == null){
        System.out.println("Deque vazio!");
        return;
    }else{
        System.out.println("Dado Inicio:" + ultimoNo.toString());
    }
}

    public void atualizaIndice(){
        NoDuplo<T> aux = primeiroNo;
        int indice =0;

        while (aux != null) {
            aux.setIndice(indice);
            aux = aux.getProximoNo();
            indice++;
        }
    }

    public int tamanhoDeque(){

        if(ultimoNo ==null){
            return 0;
         }else{
            return ultimoNo.getIndice() +1;
         }
    }

public void destruirDeque(){
    primeiroNo = null;
    ultimoNo = null;
}

