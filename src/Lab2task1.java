public class Lab2task1 {

        static float earthWeightJunaidSiddiqui = 100f;
        static float marsGravityRatioJunaidSiddiqui = 0.38f;
        static double marsWeightDoubleJunaidSiddiqui;
        static int marsWeightIntJunaidSiddiqui;
        static char marsWeightCharJunaidSiddiqui;
        static int charMathResultJunaidSiddiqui;

        public static void main(String[] args) {
            System.out.println("My weight on Earth (float): " + earthWeightJunaidSiddiqui + " kg");
            System.out.println("Mars gravity compared to Earth (float): " + marsGravityRatioJunaidSiddiqui);

            marsWeightDoubleJunaidSiddiqui = earthWeightJunaidSiddiqui * marsGravityRatioJunaidSiddiqui;
            System.out.printf("Weight on Mars stored as double, 4 decimal places: %.4f kg%n", marsWeightDoubleJunaidSiddiqui);

            marsWeightIntJunaidSiddiqui= (int) marsWeightDoubleJunaidSiddiqui;
            System.out.println("Cast double to int (decimals removed): " + marsWeightIntJunaidSiddiqui);

            marsWeightCharJunaidSiddiqui= (char) marsWeightIntJunaidSiddiqui;
            System.out.println("Cast int to char (character with that code): " + marsWeightCharJunaidSiddiqui);

            charMathResultJunaidSiddiqui =marsWeightCharJunaidSiddiqui + 1;
            System.out.println("Char + 1 stored as int: " + charMathResultJunaidSiddiqui);
        }

}
