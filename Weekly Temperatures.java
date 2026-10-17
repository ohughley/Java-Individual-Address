import java.util.ArrayList;
import java.util.Scanner;

class WeeklyTemperatures {
    public static void main(String[] args) {

        // Store days and temperatures in matching positions.
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        temperatures.add(91.0);
        temperatures.add(96.0);
        temperatures.add(101.0);
        temperatures.add(93.0);
        temperatures.add(87.0);
        temperatures.add(77.0);
        temperatures.add(97.0);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a day of the week or type 'week': ");
            String choice = input.nextLine().trim();

            if (choice.equalsIgnoreCase("week")) {
                double total = 0.0;

                System.out.println("\nWeekly Average Temperatures");

                for (int i = 0; i < days.size(); i++) {
                    System.out.printf(
                            "%s: %.1f\u00B0F%n",
                            days.get(i),
                            temperatures.get(i)
                    );

                    total += temperatures.get(i);
                }

                double average = total / temperatures.size();
                System.out.printf(
                        "Weekly average: %.2f\u00B0F%n", average
                );

            } else {
                boolean found = false;

                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equalsIgnoreCase(choice)) {
                        System.out.printf(
                                "%s: %.1f\u00B0F%n",
                                days.get(i),
                                temperatures.get(i)
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(
                            "Invalid input. Enter Monday through Sunday or 'week'."
                    );
                }
            }
        }
    }
}