package com.example.tppersonne;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Personne personne1 = new Personne("zehma", "rachid", 18);
        Personne personne2 = new Personne("kamel", "ancien", 41);
        Personne personne3 = new Personne("miloud", "boulboul", 13);

        System.out.print(personne1);
        System.out.printf(" est ");
        System.out.println(verifierAge(personne1));
        System.out.print(personne2);
        System.out.printf(" est ");
        System.out.println(verifierAge(personne2));
        System.out.print(personne3);
        System.out.printf(" est ");
        System.out.println(verifierAge(personne3));


    }

    public static String verifierAge(Personne personne) {
        if (personne.getAge() >= 18) {
            return "majeur";

        } else {
            return "mineur";
        }
    }

}

