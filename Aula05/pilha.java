public class Pilha<T>{
    private No<T>topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha;
        this.topo =null;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);

        if(topo == nul){
            topo = novoNo;
        }else{
            novoNo.setNextNo(topo);
            topo = novoNo;
        }

    }

}