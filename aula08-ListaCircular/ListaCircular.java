import javax.swing.text.Style;

public class ListaCircular<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeListaCircular;
    private int tamanho;

    public ListaCircular(String nomeListaCircular){
        this.nomeListaCircular = nomeListaCircular;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public int tamanhoLista(){
        return tamanho;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
            novoNo.setNextNo(novoNo);
            tamanho++;
            return;
            }else{
                novo.setNextNo(primeiroNo);
                ultimoNo.setNextNo(novoNo);
                primeiroNo = novoNo;
                tamanho++;
            }  

        public void addFinal(T dado){
            No<T> novoNo = new No<T>(dado);
            if(primeiroNo == null){
                primeiroNo = novoNo;
                ultimoNo = novoNo;
                novoNo.setNextNo(novoNo);
            }else{
                ultimoNo.setNextNo(novoNo);
                novoNo.setNextNo(primeiroNo);
                ultimoNo = novoNo;
            }
            tamanho++;
    }
    
    public T removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
            return null;
        }else{
            T dadoTemp = primeiroNo.getDado();
            if(primeiroNo == primeiroNo.getNextNo()){
                primeiroNo = null;
                ultimoNo = null;
                return dadoTemp;
            }

        public T removeFinal(){
            if(ultimoNo == null){
                Sytem.out.println("Lista vazia!");
                return null;
            }else{
                T dadoTemp = ultimoNo.getDado();
                if(ultimo No == ultimoNo.getNextNo()){
                    primeiroNo = null;
                    ultimoNo = null;
                    tamanho--;
                    return dadoTemp;

                }
                
                No<T> aux = primeiroNo;
                while(aux.getNextNo() != ultimoNo) {
                    aux = aux.getNextNo();
                }

                aux.setNextNo(primeiroNo);
                ultimoNo = aux;
                tamanho--;
                return dadoTemp;
            }
        }

        }
    }
}