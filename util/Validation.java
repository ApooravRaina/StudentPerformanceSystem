package util;

import java.util.Scanner;

public class Validation {

    public static String getNonEmptyString(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty. Please try again."
            );
        }
    }

    public static int getPositiveInt(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            try {

                int value = Integer.parseInt(
                        scanner.nextLine()
                );

                if (value > 0) {
                    return value;
                }

                System.out.println(
                        "Please enter a positive number."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Enter a valid number."
                );
            }
        }
    }

    public static int getIntInRange(
            Scanner scanner,
            String message,
            int min,
            int max) {

        while (true) {

            System.out.print(message);

            try {

                int value = Integer.parseInt(
                        scanner.nextLine()
                );

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println(
                        "Enter a value between "
                                + min + " and " + max + "."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Enter a valid number."
                );
            }
        }
    }

    public static double getDoubleInRange(
            Scanner scanner,
            String message,
            double min,
            double max) {

        while (true) {

            System.out.print(message);

            try {

                double value = Double.parseDouble(
                        scanner.nextLine()
                );

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println(
                        "Enter a value between "
                                + min + " and " + max + "."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Enter a valid number."
                );
            }
        }
    }
}