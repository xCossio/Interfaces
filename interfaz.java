public class interfaz implements aritmeticos{
    public static void main(String[] args) {
        interfaz obj = new interfaz();
        System.out.println(obj.suma(1, 3));
        System.out.println(obj.resta(4, 2));
        System.out.println(obj.multi(2, 3));
        System.out.println(obj.div(10, 5));
    }

     public int suma (int x, int y) 
     {
        return x + y;
     }

     public int resta (int x, int y){
        return x - y;
     }

     public int multi (int x, int y){
        return x*y;
     }
     
     public int div (int x, int y){
        if (y==0) {
            return 0;
        }
        else { 
            return x/y;
        }
     }
    
}

/**
 * Innerinterfaz
 */
interface aritmeticos {

    public int suma (int x, int y) ;

    public int resta (int x, int y);

    public int multi (int x, int y);

    public int div (int x, int y);
    
}