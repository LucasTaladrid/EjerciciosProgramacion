package notacionExpandida;

public class NotacionExpandida {
    public static String expandedForm(int num) {
        String result="";
        for(int i = (int) (Math.pow(10,String.valueOf(num).length()-1)); i>=1; i/=10){
            if(((num/i)*i)!=0){
                result+=(num/i)*i+" + ";
            }
            num=num%i;
            if(num==0){
                break;
            }
        }
        return result.substring(0,result.length()-3);
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(104));
    }
}

/*
Como la división entre un entero da como resultado un entero luego hay que multiplicar otra vez por el número de la divisón
Por ejemplo, tenemos el número 124, dividimos entre 100, el resultado sería 1,24
Pero java solo nos da 1, por lo tanto multiplicamos entre 100 y así ya tenemos otra vez el 100
Luego capturamos el resto de esa división, en este caso 24, y será el nuevo número a trabajar
24/10=2,4 Como ya dijimos Java quita el decimal, por lo tanto nos queda un 2, y para tener el formato correcto 2*10=20
 */
