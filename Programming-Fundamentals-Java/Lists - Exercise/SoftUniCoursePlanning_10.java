import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.contains("course start")) {
            String lessonTitle = command.split(":")[1];
            String lessonExercise = lessonTitle + "-Exercise";

            if (command.contains("Add")) {

                if (!schedule.contains(lessonTitle)) {
                    schedule.add(schedule.size(), lessonTitle);
                }
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(":")[2]);

                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }
            } else if (command.contains("Remove")) {

                if (schedule.contains(lessonTitle) && schedule.contains(lessonExercise)) {
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonExercise);
                } else {
                    schedule.remove(lessonTitle);
                }
            } else if (command.contains("Swap")) {
                String secondLessonTitle = command.split(":")[2];
                String secondLessonExercise = secondLessonTitle + "-Exercise";

                if (schedule.contains(lessonTitle) && schedule.contains(secondLessonTitle)) {
                    int firstLessonIndex = schedule.indexOf(lessonTitle);
                    int secondLessonIndex = schedule.indexOf(secondLessonTitle);

                    if (schedule.contains(lessonExercise) && schedule.contains(secondLessonExercise)) {
                        schedule.set(firstLessonIndex, secondLessonTitle);
                        schedule.set(firstLessonIndex + 1, secondLessonExercise);
                        schedule.set(secondLessonIndex, lessonTitle);
                        schedule.set(secondLessonIndex + 1, lessonExercise);
                    } else if (schedule.contains(lessonExercise) && !schedule.contains(secondLessonExercise)) {
                        schedule.set(firstLessonIndex, secondLessonTitle);
                        schedule.set(secondLessonIndex, lessonTitle);
                        schedule.remove(lessonExercise);
                        schedule.add(secondLessonIndex + 1, lessonExercise);
                    } else if (!schedule.contains(lessonExercise) && schedule.contains(secondLessonExercise)) {
                        schedule.set(secondLessonIndex, lessonTitle);
                        schedule.set(firstLessonIndex, secondLessonTitle);
                        schedule.remove(secondLessonExercise);
                        schedule.add(firstLessonIndex + 1, secondLessonExercise);
                    } else {
                        schedule.set(firstLessonIndex, secondLessonTitle);
                        schedule.set(secondLessonIndex, lessonTitle);
                    }
                }
            } else if (command.contains("Exercise")) {

                if (schedule.contains(lessonTitle) && !schedule.contains(lessonExercise)) {
                    schedule.add(schedule.indexOf(lessonTitle) + 1, lessonExercise);
                } else if (!schedule.contains(lessonTitle)) {
                    schedule.add(schedule.size(), lessonTitle);
                    schedule.add(schedule.size(), lessonExercise);
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(i + 1 + "." + schedule.get(i));
        }
    }
}
