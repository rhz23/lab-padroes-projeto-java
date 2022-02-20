package one.digitalinnovation.gof.singleton;


/**
 * Singleton preguiçoso.
 *
 * @author rhz23
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    //construtor privado de forma que outras classes não possam instanciar a mesma diretamente
    private SingletonLazy(){
        super();
    }

    //para chamar a instancia é necessário utilizar o método abaixo, que somente cria uma instancia da classe se ela ainda não tiver sido criada.
    public static SingletonLazy getInstancia(){
        if (instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
