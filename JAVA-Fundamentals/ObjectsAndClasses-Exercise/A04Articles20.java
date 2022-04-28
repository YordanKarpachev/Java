package ObjekteUndKLassenExercisse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A04Articles20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            //{title}, {content}, {author}
            Article article = new Article(data[0],data[1],data[2] );
            articles.add(article);


        }
        String command = scanner.nextLine();
        //title", "content", "author

        switch (command){
            case "title":
                articles.stream().sorted((e, e1) -> e.getTitle().compareTo(e1.getTitle())).forEach(a -> System.out.println(a.toString()));
                break;
            case "content":
                articles.stream().sorted((a1 , a2) -> a1.getContent().compareTo(a2.getContent())).forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                articles.stream().sorted((author1, author2) -> author1.getAuthor().compareTo(author2.getAuthor())).forEach(a -> System.out.println(a.toString()));
                break;
        }
    }






    static class Article{
        String title;
        String content;
        String author;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;

        }
        private String getTitle(){
            return  this.title;
        }
        private void setTitle(String title){
            this.title = title;

        }
        @Override
       public String toString(){
            return String.format("%s - %s: %s",getTitle(), getContent(),getAuthor());
        }
    }
}
