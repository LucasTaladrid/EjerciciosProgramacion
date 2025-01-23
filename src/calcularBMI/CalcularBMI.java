package calcularBMI;

public class CalcularBMI {
    public static void main(String[] args) {
        System.out.println(bmi(76,1.7));
    }
    public static String bmi(double weight, double height) {
        double result= weight/(height*height);
        if(result<=18.5){
            return "Underweight";
        }else if(result<=25.0){
            return "Normal";
        }else if(result<=30.0){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
}
