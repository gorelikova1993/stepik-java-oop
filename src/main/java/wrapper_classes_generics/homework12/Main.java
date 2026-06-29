package wrapper_classes_generics.homework12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        Comment[] comments = new Comment[size];
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            String name = parts[0];
            String text = parts[1];
            int likes = Integer.parseInt(parts[2]);
            Comment comment = new Comment(name, text, likes);
            comments[i] = comment;
        }
        Arrays.sort(comments, Comparator.comparing(Comment::getCountLikes).reversed());
        for (Comment comment : comments) {
            System.out.println(comment);
        }
        System.out.println();
        Arrays.sort(comments, Comparator.comparing(Comment::getAuthor));
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
