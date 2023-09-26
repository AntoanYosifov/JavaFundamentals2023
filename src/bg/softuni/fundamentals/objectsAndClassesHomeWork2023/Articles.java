package bg.softuni.fundamentals.objectsAndClassesHomeWork2023;

import java.util.Scanner;

public class Articles {
    public static class Article {
       private String title;
        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }
         private String content;
        private String author;
        public void setTitle(String title){
            this.title = title;
        }
        public void setContent(String content){
            this.content = content;
        }
        public void setAuthor(String author){
            this.author = author;
        }
        public String getTitle(){
            return title;
        }
        public String getContent(){
            return content;
        }
        public String getAuthor(){
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s -%s:%s",
                    this.getTitle(),this.getContent(), this.getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleInformation = scanner.nextLine().split(",");

        String title = articleInformation[0];
        String content = articleInformation[1];
        String author = articleInformation[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++){
            String[] command = scanner.nextLine().split(":");
            if("Edit".equals(command[0])) {
                article.setContent(command[1]);
            } else if("ChangeAuthor".equals(command[0])){
                article.setAuthor(command[1]);
            } else {
                article.setTitle(command[1]);
            }
        }

        System.out.println(article);

    }
}
