package one.digitalinnovation.gof.singleton;


/**
 * Singleton "apressado".
 *
 * @author rhz23
 */
public class SingletonEager {

    //na primeira vez que a classe for acionada por alguém, a mesma já é instanciada, então quando alguém chaamr a instancia, ele já estará pronto
    private static SingletonEager instancia = new SingletonEager();

    //construtor privado de forma que outras classes não possam instanciar a mesma diretamente
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
