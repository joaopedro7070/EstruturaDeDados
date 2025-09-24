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
        atualizaIndice();
    }



