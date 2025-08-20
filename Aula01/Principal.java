import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){
        Pessoa obj1 = new Pessoa ("JP", 19);
        Pessoa obj2 = new Pessoa ("Carlos", 20);
        Pessoa obj3 = new Pessoa ("Victor", 21 );
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>(10);
        listaP.add(obj3);
        listaP.add(obj1);
        listaP.add(obj2);

            System.out.print(listaP.get(0).toString());
        

            ArrayList<Pessoa>ListaP = new ArrayList<Pessoa>();
            listaP.add(new Pessoa("JP", 19));
            listaP.add(new Pessoa("Carlos", 20));
            listaP.add(new Pessoa("Victor", 21));

            for(Pessoa auxP :listaP){
                System.out.println(auxP.toString());
                
            }
        
    }

}