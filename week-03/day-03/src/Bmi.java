public class Bmi {

        public static void main(String[] args) {
            double massInKg = 81.2;
            double heightInM = 1.78;

            // Print the Body mass index (BMI) based on these values

         /*Body Mass Index is a simple calculation using a person’s height and weight.
         The formula is BMI = kg/m2 where kg is a person’s weight in kilograms and m2 is
         their height in metres squared.*/

         double BMI = massInKg / (heightInM * heightInM);

            System.out.println("Your Body Mass Index is: " + BMI);

        }
}
