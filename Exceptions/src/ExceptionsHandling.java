public class ExceptionsHandling {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("1235k"); //would cause NumberFormatException
            System.out.println("Execute only if not exceptions");//not execute if cause exceptions
        }catch (NumberFormatException e)
        {
            System.out.println("Fail to convert to int"); //only execute
        }
        finally {
            //Always execute if throw a exception or not
            //not execute if vm fails o surge un error aqui en este bloque de finally
            System.out.println("Finally would use to close a connection like file or database connections");
        }
    }
}
