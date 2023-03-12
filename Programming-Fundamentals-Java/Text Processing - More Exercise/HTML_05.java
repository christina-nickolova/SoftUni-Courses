import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputTitle = scanner.nextLine();
        String inputContent = scanner.nextLine();
        String inputComment = scanner.nextLine();

        List<String> title = new ArrayList<>();
        title.add("<h1>");
        title.add(inputTitle);
        title.add("</h1>");

        List<String> contest = new ArrayList<>();
        contest.add("<article>");
        contest.add(inputContent);
        contest.add("</article>");

        List<String> comments = new ArrayList<>();

        while (!inputComment.equals("end of comments")) {
            comments.add("<div>");
            comments.add(inputComment);
            comments.add("</div>");
            inputComment = scanner.nextLine();
        }
        title.forEach(e -> {

            if (title.indexOf(e) == 1) {
                System.out.println("    " + e);
            } else {
                System.out.println(e);
            }
        });
        contest.forEach(e -> {

            if (contest.indexOf(e) == 1) {
                System.out.println("    " + e);
            } else {
                System.out.println(e);
            }
        });
        AtomicInteger counter = new AtomicInteger(1);
        comments.forEach(e -> {

            if (comments.indexOf(e) == counter.get()) {
                System.out.println("    " + e);
                counter.addAndGet(3);
            } else {
                System.out.println(e);
            }
        });
    }
}
