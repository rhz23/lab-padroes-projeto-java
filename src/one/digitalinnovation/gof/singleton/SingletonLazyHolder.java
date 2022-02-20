package one.digitalinnovation.gof.singleton;


/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia<</a>
 *
 * @author rhz23
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }


    //construtor privado de forma que outras classes não possam instanciar a mesma diretamente
    private SingletonLazyHolder(){
        super();
    }

    //para chamar a instancia é necessário utilizar o método abaixo, que somente cria uma instancia da classe se ela ainda não tiver sido criada.
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
