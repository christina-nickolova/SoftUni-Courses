import java.util.Scanner;

public class Articles_02 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void rename(String title) {
            this.title = title;
        }

        public String toString() {
            return String.format("%s - %s: %s%n", title, content, author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArr = scanner.nextLine().split(", ");
        int commands = Integer.parseInt(scanner.nextLine());

        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);

        for (int command = 1; command <= commands; command++) {
            String currentCommand = scanner.nextLine();

            if (currentCommand.contains("Edit")) {
                String newContent = currentCommand.split(": ")[1];
                article.edit(newContent);
            } else if (currentCommand.contains("ChangeAuthor")) {
                String newAuthor = currentCommand.split(": ")[1];
                article.changeAuthor(newAuthor);
            } else if (currentCommand.contains("Rename")) {
                String newTitle = currentCommand.split(": ")[1];
                article.rename(newTitle);
            }
        }
        System.out.println(article);
    }
}
