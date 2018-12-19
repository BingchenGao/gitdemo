package com.soft1841.oop.jdbc;

import cn.hutool.db.Entity;
import com.soft1841.oop.book.BookDAO;
import com.soft1841.oop.book.BookDAOImpl;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class BookController implements Initializable {

    @FXML
    private FlowPane bookPane;

    private BookDAO bookDAO = new BookDAOImpl();

    List<Entity> bookList = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            bookList = bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showBooks(bookList);

    }
    public void showBooks(List<Entity> bookList) {
        for (Entity entity : bookList) {
            VBox vBox = new VBox();
            vBox.setSpacing(10);
            vBox.setAlignment(Pos.CENTER);
            vBox.setStyle("-fx-background-color: rgb(69,163,200);-fx-pref-width: 180px;");
            vBox.setPadding(new Insets(10,10,10,10));
            Label nameLabel = new Label(entity.getStr("name"));
            Label authorLabel = new Label(entity.getStr("author"));
            Label priceLabel = new Label("售价：" + String.valueOf(entity.getDouble("price")));
            ImageView woc = new ImageView(new Image(entity.getStr("cover")));
            woc.setFitHeight(150);
            woc.setFitWidth(120);
            vBox.getChildren().addAll(nameLabel,authorLabel,priceLabel,woc);
            bookPane.getChildren().add(vBox);
        }
    }
    public void showAddBookStage() throws Exception {
        Stage addBookStage = new Stage();
        VBox root = new FXMLLoader(getClass().getResource("/fxml/add_book.fxml")).load();
        Scene scene = new Scene(root);
        addBookStage.setTitle("新增图书界面");
        addBookStage.setScene(scene);
        addBookStage.show();
    }
    public void reload(){
        ObservableList list = bookPane.getChildren();
        bookPane.getChildren().removeAll(list);
        try {
            bookList = bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showBooks(bookList);
    }
}
