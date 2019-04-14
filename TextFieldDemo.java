import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

 public class TextFieldDemo extends Application
{
	TextField tf;
	Lable response;

	public static void main(String[] args)
	{
	 launch(args);
	}
	public void start(Stage myStage)
	{
	 mystage.setTitle("Syed Ali Faheem Naqvi");
	 FlowPane rootNode = new FlowPane(10, 10);
	 rootNode.setAlignment(Pos.CENTRE);
	 Scene myScene = new scene(rootNode, 230, 140);
	 myStage.setScene(myScene);
	 response = new lable("Enter Name");
	 Button btnGetText = new button("Get Name");
	 tf = new TextField();
	 tf.setPromptText("Enter a Name");
	 tf.setPrefColumnCount(15);
	 tf.setonAction( (ae) -> response.setText("Enter pressed. Name is:" + tf.getText()));
	 btnGetText.setonAction( (ae) -> response.setText("Button pressed. Name is:" + tf.getText()));
	 Separator separator = new separator();
	 separator.setPrefWidth(180);
	 rootNode.getChildre().addAll(tf, btnGetText, separator, response);
	 myStage.show();
	}
}
