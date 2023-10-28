package com.example.projectonejfx;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.text.FontWeight;
import javafx.scene.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Stack;

public class gameInterface {
    gameLogic gL = new gameLogic();
    Font retroFont = Font.loadFont(getClass().getResourceAsStream("/fonts/retro.ttf"),35);
    Font retro2 = Font.loadFont(getClass().getResourceAsStream("/fonts/retro.ttf"),13);


    public Scene getScene(){

        GridPane gPSections = new GridPane();
        gPSections.setStyle("-fx-background-color: #aaaaaa");
        gPSections.setVgap(70);
        gPSections.setAlignment(Pos.TOP_CENTER);

        StackPane sPAll = new StackPane();
        sPAll.setAlignment(gPSections, Pos.CENTER);
        sPAll.setMinHeight(750);
        sPAll.setMinWidth(350);
        sPAll.setMaxHeight(750);
        sPAll.setMaxWidth(350);
        sPAll.setStyle("-fx-background-color: #aaaaaa");


        GridPane gPScreen = new GridPane();
        gPScreen.setVgap(20);
        gPScreen.setHgap(30);
        gPScreen.setStyle("-fx-background-color: #9bbc0f");
        gPScreen.setMinWidth(275);
        gPScreen.setMinHeight(275);
        gPScreen.setMaxWidth(275);
        gPScreen.setMaxHeight(275);
        gPScreen.setAlignment(Pos.BASELINE_CENTER);

        StackPane sPScreen = new StackPane();
        sPScreen.setAlignment(gPScreen,Pos.CENTER);
        sPScreen.setMinHeight(300);
        sPScreen.setMinWidth(300);
        sPScreen.setMaxHeight(300);
        sPScreen.setMaxWidth(300);
        sPScreen.setStyle("-fx-background-color: #284646");


        StackPane sPUpper = new StackPane();
        sPUpper.setAlignment(sPScreen,Pos.CENTER);
        sPUpper.setMinHeight(340);
        sPUpper.setMinWidth(340);
        sPUpper.setMaxHeight(340);
        sPUpper.setMaxWidth(340);
        sPUpper.setStyle("-fx-background-color: #949191");

        GridPane gPLower = new GridPane();
        gPLower.setVgap(0);
        gPLower.setHgap(75);
        gPLower.setAlignment(Pos.CENTER);


        GridPane gPDirButtons = new GridPane();

        gPDirButtons.setVgap(0);
        gPDirButtons.setHgap(0);
        gPDirButtons.setAlignment(Pos.CENTER);

        GridPane gPSTRButtons = new GridPane();

        gPSTRButtons.setVgap(25);
        gPSTRButtons.setHgap(-5);
        gPSTRButtons.setAlignment(Pos.CENTER);


        //Labels del gridPane del juego

        Label r0c0 = new Label(String.valueOf(gL.board[0][0]));
        r0c0.setTextFill(Color.DARKSLATEGREY);
        r0c0.setFont(retroFont);

        if (Integer.parseInt(r0c0.getText())==0)
            r0c0.setTextFill(Color.GREENYELLOW);


        Label r0c1 = new Label(String.valueOf(gL.board[0][1]));
        r0c1.setTextFill(Color.DARKSLATEGREY);
        r0c1.setFont(retroFont);

        if (Integer.parseInt(r0c1.getText())==0)
                r0c1.setTextFill(Color.GREENYELLOW);

        Label r0c2 = new Label(String.valueOf(gL.board[0][2]));
        r0c2.setTextFill(Color.DARKSLATEGREY);
        r0c2.setFont(retroFont);

        if (Integer.parseInt(r0c2.getText())==0)
            r0c2.setTextFill(Color.CHARTREUSE);

        Label r0c3 = new Label(String.valueOf(gL.board[0][3]));
        r0c3.setTextFill(Color.DARKSLATEGREY);
        r0c3.setFont(retroFont);

        if (Integer.parseInt(r0c3.getText())==0)
            r0c3.setTextFill(Color.CHARTREUSE);

        Label r1c0 = new Label(String.valueOf(gL.board[1][0]));
        r1c0.setTextFill(Color.DARKSLATEGREY);
        r1c0.setFont(retroFont);

        if (Integer.parseInt(r1c0.getText())==0)
            r1c0.setTextFill(Color.CHARTREUSE);


        Label r1c1 = new Label(String.valueOf(gL.board[1][1]));
        r1c1.setTextFill(Color.DARKSLATEGREY);
        r1c1.setFont(retroFont);

        if (Integer.parseInt(r1c1.getText())==0)
            r1c1.setTextFill(Color.CHARTREUSE);

        Label r1c2 = new Label(String.valueOf(gL.board[1][2]));
        r1c2.setTextFill(Color.DARKSLATEGREY);
        r1c2.setFont(retroFont);

        if (Integer.parseInt(r1c2.getText())==0)
            r1c2.setTextFill(Color.CHARTREUSE);


        Label r1c3 = new Label(String.valueOf(gL.board[1][3]));
        r1c3.setTextFill(Color.DARKSLATEGREY);
        r1c3.setFont(retroFont);

            if (Integer.parseInt(r1c3.getText())==0)
                r1c3.setTextFill(Color.CHARTREUSE);


        Label r2c0 = new Label(String.valueOf(gL.board[2][0]));
        r2c0.setTextFill(Color.DARKSLATEGREY);
        r2c0.setFont(retroFont);

        if (Integer.parseInt(r2c0.getText())==0)
            r2c0.setTextFill(Color.CHARTREUSE);

        Label r2c1 = new Label(String.valueOf(gL.board[2][1]));
        r2c1.setTextFill(Color.DARKSLATEGREY);
        r2c1.setFont(retroFont);

        if (Integer.parseInt(r2c1.getText())==0)
            r2c1.setTextFill(Color.CHARTREUSE);

        Label r2c2 = new Label(String.valueOf(gL.board[2][2]));
        r2c2.setTextFill(Color.DARKSLATEGREY);
        r2c2.setFont(retroFont);

        if (Integer.parseInt(r2c2.getText())==0)
            r2c2.setTextFill(Color.CHARTREUSE);

        Label r2c3 = new Label(String.valueOf(gL.board[2][3]));
        r2c3.setTextFill(Color.DARKSLATEGREY);
        r2c3.setFont(retroFont);

        if (Integer.parseInt(r2c3.getText())==0)
            r2c3.setTextFill(Color.CHARTREUSE);

        Label r3c0 = new Label(String.valueOf(gL.board[3][0]));
        r3c0.setTextFill(Color.DARKSLATEGREY);
        r3c0.setFont(retroFont);

        if (Integer.parseInt(r3c0.getText())==0)
            r3c0.setTextFill(Color.CHARTREUSE);

        Label r3c1 = new Label(String.valueOf(gL.board[3][1]));
        r3c1.setTextFill(Color.DARKSLATEGREY);
        r3c1.setFont(retroFont);

        if (Integer.parseInt(r3c1.getText())==0)
            r3c1.setTextFill(Color.CHARTREUSE);

        Label r3c2 = new Label(String.valueOf(gL.board[3][2]));
        r3c2.setTextFill(Color.DARKSLATEGREY);
        r3c2.setFont(retroFont);

        if (Integer.parseInt(r3c2.getText())==0)
            r3c2.setTextFill(Color.CHARTREUSE);

        Label r3c3 = new Label(String.valueOf(gL.board[3][3]));
        r3c3.setTextFill(Color.DARKSLATEGREY);
        r3c3.setFont(retroFont);

        if (Integer.parseInt(r3c3.getText())==0)
            r3c3.setTextFill(Color.CHARTREUSE);


        //Botones

        Button bttnTop = new Button();
        bttnTop.setGraphic(new ImageView ("up1.png"));
        bttnTop.setPadding(Insets.EMPTY);
        Button bttnBot = new Button();
        bttnBot.setGraphic(new ImageView ("down1.png"));
        bttnBot.setPadding(Insets.EMPTY);
        Button bttnLeft = new Button();
        bttnLeft.setGraphic(new ImageView ("left1.png"));
        bttnLeft.setPadding(Insets.EMPTY);
        Button bttnRight = new Button();
        bttnRight.setGraphic(new ImageView ("right1.png"));
        bttnRight.setPadding(Insets.EMPTY);




        Button bttnStart = new Button();
        bttnStart.setGraphic(new ImageView ("red.png"));
        bttnStart.setPadding(Insets.EMPTY);
        Button bttnReStart = new Button();
        bttnReStart.setGraphic(new ImageView ("red.png"));
        bttnReStart.setPadding(Insets.EMPTY);


        //Labels decorativos

        Label lbBrand = new Label(" NintelliJ - Javaboy TM");
        lbBrand.setFont(retro2);
        lbBrand.setTextFill(Color.PURPLE);

        Label lbInstitution = new Label("UCR-RP/Prog I");
        lbInstitution.setFont(retro2);
        lbInstitution.setTextFill(Color.PURPLE);

        Label lbStart = new Label("Start");
        lbStart.setFont(retro2);
        lbStart.setTextFill(Color.PURPLE);

        Label lbReStart = new Label("Reset   ");
        lbReStart.setFont(retro2);
        lbReStart.setTextFill(Color.PURPLE);

        gPSections.add(sPUpper,0,0);
        gPSections.add(gPLower,0,1);

        sPAll.setAlignment(lbInstitution,Pos.TOP_CENTER);
        sPAll.getChildren().addAll(gPSections,lbInstitution);


        gPScreen.add(r0c0,0,0);
        gPScreen.add(r0c1,0,1);
        gPScreen.add(r0c2,0,2);
        gPScreen.add(r0c3,0,3);
        gPScreen.add(r1c0,1,0);
        gPScreen.add(r1c1,1,1);
        gPScreen.add(r1c2,1,2);
        gPScreen.add(r1c3,1,3);
        gPScreen.add(r2c0,2,0);
        gPScreen.add(r2c1,2,1);
        gPScreen.add(r2c2,2,2);
        gPScreen.add(r2c3,2,3);
        gPScreen.add(r3c0,3,0);
        gPScreen.add(r3c1,3,1);
        gPScreen.add(r3c2,3,2);
        gPScreen.add(r3c3,3,3);

        sPScreen.getChildren().addAll(gPScreen);

        sPUpper.getChildren().addAll(sPScreen,lbBrand);
        sPUpper.setAlignment(lbBrand,Pos.BOTTOM_LEFT);


        gPLower.add(gPDirButtons,0,1);
        gPLower.add(gPSTRButtons,1,1);

        gPDirButtons.add(bttnTop,1,0);
        gPDirButtons.add(bttnBot,1,2);

        gPDirButtons.add(bttnRight,2,1);
        gPDirButtons.add(bttnLeft,0,1);

        gPSTRButtons.add(bttnStart,0,0);
        gPSTRButtons.add(lbStart,1,0);
        gPSTRButtons.add(lbReStart,0,1);
        gPSTRButtons.add(bttnReStart,1,1);

        Scene scene = new Scene(sPAll,350,650);
        return scene;
    }
}
