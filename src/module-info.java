module Workshop_Udemy_App_Desktop_JavaFX_JDBC {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
