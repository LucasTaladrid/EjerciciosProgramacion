package contarDias;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ContarDias {
    /*
    La forma más sencilla de afrontar este problema es usando los métodos propios que nos ofrece java, de forma deberíamos de tener en cuenta, años bisiestos,
    meses con 30 días y otros con 31 además de Febrero.
    Así no es necesario hacer una expresión regular, ya que podemos definir un formato correcto para las fechas, por otra parte, tampoco hay que válidar si es una fecha correcta o no(30 de Febrero)
    El cálculo de días también es posible realizarlo con métodos de LocalDate
     */

    public static boolean validarFecha(String fecha) {
        try {

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT); //Se asegura que la fecha exista
            LocalDate.parse(fecha, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("La fecha introducida no existe o no está en un formato válido.");
            return false;
        }
    }

    public static int diferenciaDias(String fechaUno,String fechaDos){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Aunque las fechas son correctas ya que lo válidamos con el método anterior sigue siendo necesario darle un formato, de otra forma vamos a tener una excepción
       LocalDate primeraFecha= LocalDate.parse(fechaUno,dateTimeFormatter);
       LocalDate segundaFecha= LocalDate.parse(fechaDos,dateTimeFormatter);
        long diferenciaDias = ChronoUnit.DAYS.between(primeraFecha,segundaFecha);

        return Math.abs((int)diferenciaDias);//Usamos Math.abs para aseguranos que el valor siempre sea positivo

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primeraFecha,segundaFecha;
        int diferenciaDias;

        System.out.println("Introduce dos fechas y te muestro la diferencia de días:");

        while (true){
            System.out.println("Introduce la primera fecha(dd/mm/aaaa)");
            primeraFecha=scanner.next();
            if(validarFecha(primeraFecha)){
                break;
            }
            System.out.println("Respeta el formato, si un día o un mes solo tiene un dígito es necesario añadir un 0 delante");
        }

        while (true){
            System.out.println("Introduce la segunda fecha(dd/mm/aaaa)");
            segundaFecha=scanner.next();
            if(validarFecha(segundaFecha)){
                break;
            }
            System.out.println("Respeta el formato, si un día o un mes solo tiene un dígito es necesario añadir un 0 delante");
        }

        diferenciaDias=diferenciaDias(primeraFecha,segundaFecha);

        System.out.println("Entre las fechas "+primeraFecha+" y "+ segundaFecha+" hay una diferencia de días de: "+diferenciaDias);

    }
}
