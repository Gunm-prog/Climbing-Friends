package Climbing;

public class Singleton {
    //Le singleton
    private volatile static Singleton single;
    //variable d'instance
    private String name="";

    //Constructeur privé
    private Singleton() {
        this.name="Mon singleton";
        System.out.println( "\t\tCREATION DE L'INSTANCE ! ! !" );
    }

    //Méthode d'accès au singleton
    public static Singleton getInstance() {
        if (single == null) {
            synchronized (Singleton.class) {
                if (single == null)
                    single=new Singleton();
            }
        }
        return single;
    }

    //Accesseur
    public String getName(){
        return this.name;
    }
}

