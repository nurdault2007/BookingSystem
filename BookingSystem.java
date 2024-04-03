import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;


public class BookingSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Nurdaulet's kitchen"); 

        Scene scene = new Scene(new HomePage(), 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class HomePage extends BorderPane {

    public HomePage() {
        Label welcomeLabel = new Label("Welcome!");
        welcomeLabel.setStyle("-fx-font-size: 24px;");

        Button menuBttn = new Button("Menu");
        Button bookingBttn = new Button("Booking");
        Button contactUsBttn = new Button("Contact Us");
        Button galleryBttn = new Button("Gallery");

        menuBttn.setOnAction(event -> {
            this.setCenter(new Menu());
        });

        bookingBttn.setOnAction(event -> {
            this.setCenter(new Booking());
        });

        contactUsBttn.setOnAction(event -> {
            this.setCenter(new ContactUs());
        });

        galleryBttn.setOnAction(event -> {
            this.setCenter(new Gallery());
        });

        HBox buttonBox = new HBox(10, menuBttn, bookingBttn, contactUsBttn, galleryBttn);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(20));

        this.setBottom(buttonBox);

        this.setTop(welcomeLabel);
        BorderPane.setAlignment(welcomeLabel, Pos.CENTER);

    }
}

class Menu extends VBox {

    public Menu() {

        Label titleLabel = new Label("Menu");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label theFirstCourse = new Label("The first course:");
        Label fCourse1 = new Label("Borsch");
        Label fCourse2 = new Label("Vegetable Soup");
        Label fCourse3 = new Label("Сhicken Soup");


        Label theSecondCourse = new Label("The second course");
        Label sCourse1 = new Label("Roast");
        Label sCourse2 = new Label("Pilaf");
        Label sCourse3 = new Label("Beshbarmak");
        Label sCourse4 = new Label("Manty");

        Label desserts = new Label("Desserts: ");
        Label dessert1 = new Label("Chocolate-covered strawberries");
        Label dessert2 = new Label("Icecream");
        
        Label drinks = new Label("Drinks: ");
        Label drink1 = new Label("Kumys");
        Label drink2 = new Label("Cocktails");
        

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setSpacing(6);

     
        this.getChildren().addAll(
            titleLabel ,
            theFirstCourse , fCourse1 , fCourse2 , fCourse3 ,
            theSecondCourse , sCourse1 , sCourse2 , sCourse3 , sCourse4 ,
            desserts , dessert1 , dessert2 , 
            drinks , drink1 , drink2
        );
    }
}



class Booking extends GridPane {
    

    public Booking() {
        ArrayList<String> bookingDates = new ArrayList<>();
        
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label phoneLabel = new Label("Phone:");
        Label dateLabel = new Label("Date:");
        Label timeLabel = new Label("Time:");
        Label sizeLabel = new Label("Size:");
        Label specialRequestsLabel = new Label("Special Requests:");

        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField phoneField = new TextField();
        TextField dateField = new TextField();
        TextField timeField = new TextField();
        TextField sizeField = new TextField();
        TextField specialRequestsField = new TextField();

        Button submitButton = new Button("Submit");

        
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(10);

        
        this.add(nameLabel, 0, 0);
        this.add(nameField, 1, 0);
        this.add(emailLabel, 0, 1);
        this.add(emailField, 1, 1);
        this.add(phoneLabel, 0, 2);
        this.add(phoneField, 1, 2);
        this.add(dateLabel, 0, 3);
        this.add(dateField, 1, 3);
        this.add(timeLabel, 0, 4);
        this.add(timeField, 1, 4);
        this.add(sizeLabel, 0, 5);
        this.add(sizeField, 1, 5);
        this.add(specialRequestsLabel, 0, 6);
        this.add(specialRequestsField, 1, 6);
        this.add(submitButton, 1, 7);

        submitButton.setOnAction(event -> {
            
            bookingDates.add(nameField.getText());
            bookingDates.add(emailField.getText());
            bookingDates.add(phoneField.getText());
            bookingDates.add(dateField.getText());
            bookingDates.add(timeField.getText());
            bookingDates.add(sizeField.getText());
            bookingDates.add(specialRequestsField.getText());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Booking Confirmation");
            alert.setHeaderText("Booking has been completed");
            alert.setContentText("Thank you for your reservation!");
            alert.showAndWait();

            
            System.out.println("Booking has been completed");
            nameField.clear();
            emailField.clear();
            phoneField.clear();
            dateField.clear();
            timeField.clear();
            sizeField.clear();
            specialRequestsField.clear();
            
        });

    }

}

class ContactUs extends GridPane {

    public ContactUs() {
    
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label messageLabel = new Label("Message:");

        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextArea messageArea = new TextArea();

        Button submitButton = new Button("Submit");

        
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(10);

        
        this.add(nameLabel, 0, 0);
        this.add(nameField, 1, 0);
        this.add(emailLabel, 0, 1);
        this.add(emailField, 1, 1);
        this.add(messageLabel, 0, 2);
        this.add(messageArea, 1, 2);
        this.add(submitButton, 1, 3);

        
        submitButton.setOnAction(event -> {
            
            String name = nameField.getText();
            String email = emailField.getText();
            String message = messageArea.getText();

            
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Message: " + message);

            
            nameField.clear();
            emailField.clear();
            messageArea.clear();
        });
    }
}
class Gallery extends FlowPane {

    private List<Image> images;

    public Gallery() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(10);

        this.images = loadImages();

        displayRandomImages();
    }

    private List<Image> loadImages() {
        List<Image> images = new ArrayList<>();
        
        images.add(new Image(getClass().getResourceAsStream("image1.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image2.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image3.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image4.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image5.jpeg")));
        images.add(new Image(getClass().getResourceAsStream("image6.jpeg")));
        images.add(new Image(getClass().getResourceAsStream("image7.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image8.jpeg")));
        images.add(new Image(getClass().getResourceAsStream("image9.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image10.jpg")));
        images.add(new Image(getClass().getResourceAsStream("image11.jpg")));
        return images;
    }

    private void displayRandomImages() {
        Random random = new Random();
        int numImagesToShow = 6;

        for (int i = 0; i < numImagesToShow; i++) {
            ImageView imageView = new ImageView();
            imageView.setImage(images.get(random.nextInt(images.size())));
            imageView.setFitWidth(200);
            imageView.setFitHeight(150);
            this.getChildren().add(imageView);
        }
    }
}