package ObjekteUndKLassenExercisse;

import java.util.Scanner;

public class A02Articles {
    static class Article {
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String content) {
            Content = content;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        String title;
        String Content;
        String Author;

        @Override
        public String toString() {
            return String.format("%s - %s: %s",getTitle(), getContent(),getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Article articles = new Article();

        String[] line = scanner.nextLine().split(", ");
        articles.setTitle(line[0]);
        articles.setContent(line[1]);
        articles.setAuthor(line[2]);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            line = scanner.nextLine().split(": ");


            switch (line[0]) {
                case "Edit":


                    articles.setContent(line[1]);
                    break;

                case "ChangeAuthor":
                    articles.setAuthor(line[1]);
                    break;
                case "Rename":
                    articles.setTitle(line[1]);
                    break;

            }

        }

        System.out.println(articles.toString());
    }


}


