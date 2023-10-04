import javafx.application.Application;
import javafx.stage.Stage;
import java.io.*;
import java.io.File;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.geometry.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.*;
import java.io.FileReader;
import java.io.BufferedReader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class Bobby extends Application
{
	final ScrollBar sb=new ScrollBar();
	final StackPane vb=new StackPane();
	final DropShadow ds=new DropShadow();
	public void start(Stage s)
	{
		File f=new File("logic.txt");
		if(!f.exists())
			System.out.println("File Not Exists!!");
		else
		{
		try
		{
		FileReader ff=new FileReader(f);
		BufferedReader bf=new BufferedReader(ff);
		Label l[]=new Label[10];
		RadioButton r[]=new RadioButton[40];
		ToggleGroup t[]=new ToggleGroup[10];
		VBox v=new VBox();
		
		
		FileInputStream fi=new FileInputStream("Coffee.jpg");
		Image img=new Image(fi);
		BackgroundImage bi=new BackgroundImage(img,BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
		Background bg=new Background(bi);
		
		

		ds.setColor(Color.GREY);
        	ds.setOffsetX(2);
        	ds.setOffsetY(2);

		vb.setLayoutX(5);
        	//vb.setSpacing(10);
		vb.setBackground(bg);
		vb.setAlignment(Pos.CENTER);
		
		String hg;
		for(int r1=0,j=0;(hg=bf.readLine())!=null;)
		{
			l[j]=new Label(hg);
			t[j]=new ToggleGroup();
			v.getChildren().add(l[j]);
			for(int i=0;i<4;i++)
			{
				r[r1+i]=new RadioButton(bf.readLine());
				v.getChildren().add(r[r1+i]);
				r[r1+i].setToggleGroup(t[j]);
			}
			j++;
			r1+=4;
		}
		ff.close();
		bf.close();
		Button b=new Button("Submit");
		Label l1=new Label();
		EventHandler<ActionEvent>ev=new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int ans=0;
				if(r[2].isSelected())
					ans++;
				if(r[4].isSelected())
					ans++;
				if(r[8].isSelected())
					ans++;
				if(r[12].isSelected())
					ans++;
				if(r[17].isSelected())
					ans++;
				if(r[21].isSelected())
					ans++;
				if(r[27].isSelected())
					ans++;
				if(r[30].isSelected())
					ans++;
				if(r[35].isSelected())
					ans++;
				if(r[36].isSelected())
					ans++;
				l1.setText("Your  Score:"+ans);
			}
		};
		b.setOnAction(ev);
		v.getChildren().addAll(b,l1);
		vb.getChildren().add(v);
		
		
		Group g=new Group(vb,sb);
		Scene p=new Scene(g,1366,700);
		

		sb.setLayoutX(p.getWidth()-sb.getWidth());
        	sb.setMin(0);
        	sb.setOrientation(Orientation.VERTICAL);
        	sb.setPrefHeight(300);
        	sb.setMax(1366);
		

		s.setScene(p);
		
		p.setFill(Color.rgb(151, 222, 206,1));
		
		s.setTitle("Logic Part");

		 sb.valueProperty().addListener(new ChangeListener<Number>() {
           	 public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    vb.setLayoutY(-new_val.doubleValue());
		}
	});
            
		
		s.show();
		}
		catch(Exception e)
		{
		}
		}
	}
	public static void main(String hm[])
	{
		launch();
	}
}
