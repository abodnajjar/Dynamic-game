package application;

import java.io.File;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Main extends Application {
	// this object from class get data to chose the how to fill the data
	Get_Data data=new Get_Data();
	Image backgroundImage = new Image("file:C:/Users/abdal/Downloads/تصميم بدون عنوان.jpg");
	
	BackgroundImage background = new BackgroundImage(
			backgroundImage,
			BackgroundRepeat.NO_REPEAT,
			BackgroundRepeat.NO_REPEAT,
			BackgroundPosition.CENTER,
			new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,  true, true, true, true)
			);
	@Override
	// start method for user interface 
	public void start(Stage pStage) {
		try {
			// fist stage is method return the first stage of the game 
			Stage x= FirstStage(pStage);
			x.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//this method return the first stage of the game to chose two player or computer 
	private Stage FirstStage(Stage pStage) {
		// the first Stage  
		Label la1=new Label(" welcom to the Game ");
		la1.setFont(Font.font(40));
		// la1.setStyle("-fx-background-color: #FFBF00; -fx-text-fill: black; -fx-padding: 10px;");  // Gold background with black text
		Label la2=new Label("You Want to Play as 'Computer' or 'Two Player'");
		la2.setFont(Font.font(20));
		VBox VB1=new VBox( 20,la1,la2);
		VB1.setAlignment(Pos.CENTER);

		// the first the computer play 
		Button computer =new Button(" 'Computer' ");
		computer.setPrefWidth(150);
		computer.setPrefHeight(30);
		computer.setFont(Font.font(15));
		// if you chose the computer to play
		computer.setOnAction(e->{
			pStage.close();
			// to chose the number of data
			Label StatLable=new Label(" ' Enter even Number of coines To Start '");
			StatLable.setFont(Font.font(25));
			TextField numOfCoines=new TextField();
			numOfCoines.setPrefWidth(100);
			numOfCoines.setPrefHeight(40);
			Label ConisLable=new Label();
			// this button clear the text filed to set new number
			Button clearButton=new Button("clear");
			clearButton.setPrefWidth(170);;
			clearButton.setPrefHeight(20);
			// this button go to the next stage 
			Button StartButton=new Button("Next ..");
			StartButton.setPrefWidth(170);;
			StartButton.setPrefHeight(20);
			// this button to exit the game
			Button Exit=new Button("Exit");

			Exit.setPrefWidth(170);;
			Exit.setPrefHeight(20);
			// this button to go back to the previous stage 
			Button Go_Backe=new Button("Go Back");
			HBox cv=new HBox(100,Exit,Go_Backe);
			Go_Backe.setPrefWidth(170);;
			Go_Backe.setPrefHeight(20);
			clearButton.setOnAction(n->{
				numOfCoines.clear();
				numOfCoines.requestFocus();
			});
			HBox hb1 =new HBox(100 ,clearButton,StartButton );
			VBox vb1=new VBox(40,StatLable,numOfCoines,hb1,cv,ConisLable);
			vb1.setAlignment(Pos.CENTER);
			vb1.setPadding(new Insets(30,70,0,80));


			Stage stage=new Stage();
			BorderPane b = new BorderPane();
			b.setBackground(new Background(background));
			b.setCenter(vb1);
			Scene scene1 = new Scene(b,600,400);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene1);
			Exit.setOnAction(w->{
				stage.close();
			});
			Go_Backe.setOnAction(w->{
				pStage.show();
				stage.close();
			});
			stage.setTitle("Number of coines :-");
			stage.show();
			// go to the next sage
			StartButton.setOnAction(q->{
				Stage x=new Stage();
				try {
					// the number that the user entered
					String num=numOfCoines.getText();
					ToggleGroup group=new ToggleGroup();
					// if the user dos't enter any number (Empty)
					if(num.isEmpty()==true) {
						ConisLable.setText(" 'Enter in text Filed (is Empty) !! ' ");
						ConisLable.setFont(Font.font(20));
						ConisLable.setStyle("-fx-text-fill: red;");
					}
					// if the number less than 0 or more than 20 (i can change it just change 20)
					else {
						int n=Integer.parseInt(num);
						if(n<=0 ||n > 20) {
							ConisLable.setText(" ' Enter between 0 and 20  ' ");
							ConisLable.setFont(Font.font(20));
							ConisLable.setStyle("-fx-text-fill: red;");
						}
						// if the number is even go to the next stage
						else if (data.isEven(n)) {
							ConisLable.setText("");
							// close the previous stage
							stage.close();
							// if chose random data
							RadioButton rb1=new RadioButton(" Random Data");
							rb1.setFont(Font.font(25));
							rb1.setOnAction(r->{
								int []array =data.Random_Data(n);
								Algorithm_Dynamic_game ga=new Algorithm_Dynamic_game();
								ga.maximuAmountMatrix(array, n);
								Stage y=computerGame(ga.getDps(),
										ga.getSelectedNumbers(),ga.getSum(),x,pStage);
								y.show();
								group.selectToggle(null);
							});
							// if the user select from file
							RadioButton rb2=new RadioButton(" From File ");
							rb2.setFont(Font.font(25));
							rb2.setOnAction(r->{
								group.selectToggle(null);
								int [] array=file_choos(pStage,n) ;
								if(array!=null) {
									Algorithm_Dynamic_game ga=new Algorithm_Dynamic_game();
									ga.maximuAmountMatrix(array, n);
									Stage y=computerGame(ga.getDps(),
											ga.getSelectedNumbers(),ga.getSum(),x,pStage);
									y.show();

								}
							}
									);
							// if the user want to enter the numbers by the keyBord 
							RadioButton rb3=new RadioButton(" By KeyBoard ");
							rb3.setFont(Font.font(25));
							rb3.setOnAction(r->{
								Stage str=new Stage();
								x.close();
								group.selectToggle(null);
								int[] array=new int[n];
								Label l7=new Label(" Enter the data :");
								l7.setFont(Font.font(40));

								Label l8=new Label();
								l8.setFont(Font.font(20));
								l8.setStyle("-fx-text-fill: red;");

								VBox v2=new VBox(40,l7);
								// the grid pane to enter the numbers in
								GridPane gridPane = new GridPane();
								// the number of text filed in the one row 
								int maxColumns = 8;  
								TextField[] textField = new TextField[n];
								for (int i = 0; i < n; i++) {
									// array of text filed to put the numbers in  
									textField [i] = new TextField();
									int index=i;
									textField[i].setPrefWidth(70);
									textField[i].setPrefHeight(20);
									String i_num=String.valueOf(i);
									Label I_num =new Label( i_num);
									VBox vb3=new VBox(5,I_num,textField[i]); 
									vb3.setAlignment(Pos.CENTER);
									textField[i].setOnAction(event -> {
										// to check if the data in the text filed is int 
										String input = textField[index].getText();
										try {
											Integer.parseInt(input);
											if (index < textField.length - 1) {
												// to put the cursor in the next text filed
												textField[index + 1].requestFocus();	
											}

										} catch (NumberFormatException o) {
											l8.setText("Enetr integer ");
										}
									});
									// Calculate row and column based on the index
									int row = i / maxColumns;
									int col = i % maxColumns;
									// Add TextField to the calculated position
									gridPane.add(vb3, col, row);
									gridPane.setHgap(3);
								}
								// this button to exit the stage
								Button Exit3 =new Button("Exit");
								Exit3.setPrefWidth(100);
								Exit3.setPrefHeight(30);
								Exit3.setOnAction(w->{
									str.close();
								});
								// this button to go to previous stage
								Button Go_Back3 =new Button("Go Back");
								Go_Back3.setPrefHeight(30);
								Go_Back3.setPrefWidth(100);
								Go_Back3.setOnAction(w->{
									x.show();
									str.close();
								});
								// this button to go to the next stage
								Button Next =new Button("Next...");
								Next.setPrefHeight(30);
								Next.setPrefWidth(100);
								HBox hbox30=new HBox(20,Exit3,Go_Back3);
								hbox30.getChildren().add(Next);

								Next.setOnAction(o->{
									// to check that all text filed have integer number 
									boolean allHaveData = true;
									boolean allint = true;
									for (int i=0;i<n;i++) {
										if(textField [i].getText().isEmpty()) {
											allHaveData = false;
											l8.setText(" Enter all Data ");
										}

									}
									if(allHaveData) {
										for(int i=0;i<n;i++) {
											try {
												int number =Integer.parseInt(textField[i].getText());
												array[i]= number ;
												if (number < 0) {
													// if the number is negative
													allint=false;
													l8.setText("The number cannot be negative Check filed num =  "+i);
												
												} else {
													if(allint==true && i==n-1) {
														Algorithm_Dynamic_game ga=new Algorithm_Dynamic_game();
														ga.maximuAmountMatrix(array, n);
														Stage y=computerGame(ga.getDps(),
																ga.getSelectedNumbers(),ga.getSum(),str,pStage);
														y.show();}
												}

											} catch (NumberFormatException z) {
												allint=false;
												l8.setText("Just Enetr integer Check filed num =  "+i);
											}
										}
									}
								});




								hbox30.setAlignment(Pos.CENTER);
								v2.getChildren().add(gridPane);
								v2.getChildren().add(hbox30);
								v2.getChildren().add(l8);
								v2.setAlignment(Pos.CENTER);
								v2.setPadding(new Insets(30,40,0,30));
								BorderPane root = new BorderPane();
								root.setCenter(v2);
								root.setBackground(new Background(background));
								Scene scene = new Scene(root,700,600);
								scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

								str.setScene(scene);
								str.show();
								str.setTitle("Data by KeyBoard :-");

							});



							rb1.setToggleGroup(group);
							rb2.setToggleGroup(group);
							rb3.setToggleGroup(group);
							Label l7=new Label("' Choose How To Fill  The Data '");
							l7.setFont(Font.font(40));
							Button Exit2=new Button("Exit");

							Exit2.setPrefWidth(170);;
							Exit2.setPrefHeight(20);
							Button Go_Backe2=new Button("Go Back");
							Go_Backe2.setPrefWidth(170);
							Go_Backe2.setPrefHeight(20);
							// the Hbox for go to the back screen or Exit this screen
							HBox cv2=new HBox(70,Exit2,Go_Backe2);
							cv2.setAlignment(Pos.CENTER);
							VBox v22=new VBox(40,rb1,rb2,rb3);
							v22.setAlignment(Pos.CENTER);
							VBox v2=new VBox(40,l7,v22,cv2);
							v2.setAlignment(Pos.CENTER);
							v2.setPadding(new Insets(30,40,0,30));
							BorderPane root = new BorderPane();
							root.setCenter(v2);

							root.setBackground(new Background(background));
							Scene scene = new Scene(root,700,600);
							scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

							Go_Backe2.setOnAction(w->{
								stage.show();
								x.close();
							});
							Exit2.setOnAction(w->{
								x.close();
							});

							x.setTitle(" Choose How To Fill  The Data :- ");
							x.setScene(scene);
							x.show();
						}
						// if the number is odd not even
						else {
							ConisLable.setText(" 'Enter Even number you can't enetr odd number ' ");
							ConisLable.setFont(Font.font(20));
							ConisLable.setStyle("-fx-text-fill: red;");
						}

					}
				}

				catch (NumberFormatException d) {
					ConisLable.setText(" 'Just Integer no double or character ' ");
					ConisLable.setFont(Font.font(20));
					ConisLable.setStyle("-fx-text-fill: red;");
					System.out.println("Error: Invalid input string for parsing integer: " + d.getMessage());
				}



			});

		});
		// *******************************    if the select two player  ************************************* //         
		Button Two_Playre =new Button(" 'Two Player '");
		Two_Playre.setPrefWidth(150);
		Two_Playre.setPrefHeight(30);
		Two_Playre.setFont(Font.font(15));
		Two_Playre.setOnAction(r->{
			// close the previous stage
			pStage.close();
			Label StatLable=new Label(" ' Enter even Number of coines To Start '");
			StatLable.setFont(Font.font(25));
			TextField numOfCoines=new TextField();
			numOfCoines.setPrefWidth(100);
			numOfCoines.setPrefHeight(40);
			Label ConisLable=new Label();
			// this button to clear the text filed 
			Button clearButton=new Button("clear");
			clearButton.setPrefWidth(170);;
			clearButton.setPrefHeight(20);
			// this button to go to the next stage
			Button StartButton=new Button("Next...");
			StartButton.setPrefWidth(170);;
			StartButton.setPrefHeight(20);
			// this button to close the current stage 
			Button Exit=new Button("Exit");

			Exit.setPrefWidth(170);;
			Exit.setPrefHeight(20);
			// go to the previous stage
			Button Go_Backe=new Button("Go Back");
			HBox cv=new HBox(100,Exit,Go_Backe);
			Go_Backe.setPrefWidth(170);;
			Go_Backe.setPrefHeight(20);
			clearButton.setOnAction(n->{
				numOfCoines.clear();
				numOfCoines.requestFocus();
			});
			HBox hb1 =new HBox(100 ,clearButton,StartButton );
			VBox vb1=new VBox(40,StatLable,numOfCoines,hb1,cv,ConisLable);
			vb1.setAlignment(Pos.CENTER);
			vb1.setPadding(new Insets(30,70,0,80));

			Stage stage=new Stage();
			Exit.setOnAction(e->{
				stage.close();
			});
			Go_Backe.setOnAction(f->{
				stage.close();
				pStage.show();	
			});

			BorderPane b = new BorderPane();
			b.setBackground(new Background(background));
			b.setCenter(vb1);
			Scene scene1 = new Scene(b,600,500);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene1);
			stage.setTitle("Number of coines :-");
			stage.show();
			// Enter the number of coins stage 
			StartButton.setOnAction(e->{
				Stage x=new Stage();
				// if the text filed is empty 
				try {
					String num=numOfCoines.getText();
					ToggleGroup group=new ToggleGroup();
					if(num.isEmpty()==true) {
						ConisLable.setText(" 'Enter in text Filed (is Empty) !! ' ");
						ConisLable.setFont(Font.font(20));
						ConisLable.setStyle("-fx-text-fill: red;");
					}
					// if the number of coins is between 0 and 20 can changed 
					else {
						int n=Integer.parseInt(num);
						if(n<=0 || n >20) {
							ConisLable.setText(" 'Enter Number Between 0 and 20  ' ");
							ConisLable.setFont(Font.font(20));
							ConisLable.setStyle("-fx-text-fill: red;");
						}
						// if the data is even 
						else if (data.isEven(n)) {
							ConisLable.setText("");
							stage.close();
							// if the user chose the random data
							RadioButton rb1=new RadioButton(" Random Data ");
							rb1.setFont(Font.font(25));
							rb1.setOnAction(t->{
								int []array =data.Random_Data(n);
								Stage y=new Stage();
								two_players_Stage1 (y,x,array,pStage);
								group.selectToggle(null);
							});
							// if the user chose to fill data from file
							RadioButton rb2=new RadioButton(" From File ");
							rb2.setFont(Font.font(25));
							rb2.setOnAction(t->{
								group.selectToggle(null);
								int [] array=file_choos(pStage,n) ;
								if(array!=null) {
									Stage y=new Stage();
									two_players_Stage1 (y,x,array,pStage);
								}
							}
									);
							// if the user chose fill data by Keyboard
							RadioButton rb3=new RadioButton(" By KeyBoard ");
							rb3.setFont(Font.font(25));
							rb3.setOnAction(t->{
								Stage str=new Stage();
								x.close();
								group.selectToggle(null);
								int[] array=new int[n];
								Label l7=new Label(" Enter the data :");
								l7.setFont(Font.font(40));

								Label l8=new Label();
								l8.setFont(Font.font(20));
								l8.setStyle("-fx-text-fill: red;");

								VBox v2=new VBox(40,l7);
								GridPane gridPane = new GridPane();
								int maxColumns = 8;  
								TextField[] textField = new TextField[n];
								for (int i = 0; i < n; i++) {
									textField [i] = new TextField();
									int index=i;
									textField[i].setPrefWidth(70);
									textField[i].setPrefHeight(20);
									String i_num=String.valueOf(i);
									Label I_num =new Label( i_num);
									VBox vb3=new VBox(5,I_num,textField[i]); 
									vb3.setAlignment(Pos.CENTER);
									textField[i].setOnAction(event -> {
										String input = textField[index].getText();
										try {
											Integer.parseInt(input);
											if (index < textField.length - 1) {
												textField[index + 1].requestFocus();	
											}

										} catch (NumberFormatException o) {
											l8.setText("Enetr integer ");
										}
									});
									// Calculate row and column based on the index
									int row = i / maxColumns;
									int col = i % maxColumns;
									// Add TextField to the calculated position
									gridPane.add(vb3, col, row);
									gridPane.setHgap(3);
								}




								// close the current stage
								Button Exit3 =new Button("Exit");
								Exit3.setPrefHeight(30);
								Exit3.setPrefWidth(100);
								Exit3.setOnAction(w->{
									pStage.close();
								});
								// go to the previous stage 
								Button Go_Back3 =new Button("Go Back");
								Go_Back3.setPrefHeight(30);
								Go_Back3.setPrefWidth(100);
								Go_Back3.setOnAction(w->{
									x.show();
									str.close();
								});
								// go to the next stage 
								Button Next =new Button("Next..");
								Next.setPrefHeight(30);
								Next.setPrefWidth(100);
								HBox hbox30=new HBox(20,Exit3,Go_Back3);
								hbox30.getChildren().add(Next);



								Next.setOnAction(o->{
									boolean allHaveData = true;
									boolean allint=true;
									// check that the data is  not empty 
									for (int i=0;i<n;i++) {
										if(textField [i].getText().isEmpty()) {
											allHaveData = false;
											l8.setText(" Enter all Data ");
										}

									}
									if(allHaveData) {
										for(int i=0;i<n;i++) {
											try {
												// check if the data is integer 
												int number =Integer.parseInt(textField[i].getText());
												if (number < 0) {
													allint=false;
													l8.setText("The number cannot be negative Check filed num =  "+i);

												} else {
													array[i]= number;

													if(allint==true && i==n-1) {
														Stage y=new Stage();
														two_players_Stage1 (y,pStage,array,pStage);}

												}

											} catch (NumberFormatException z) {
												allint=false;
												l8.setText("Just Enetr integer Check filed num =  "+i);
											}
										}


									}
								});




								hbox30.setAlignment(Pos.CENTER);
								v2.getChildren().add(gridPane);
								v2.getChildren().add(hbox30);
								v2.getChildren().add(l8);
								v2.setAlignment(Pos.CENTER);
								v2.setPadding(new Insets(30,40,0,30));
								BorderPane root = new BorderPane();
								root.setCenter(v2);
								root.setBackground(new Background(background));
								Scene scene = new Scene(root,700,600);
								scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

								str.setScene(scene);
								str.show();
								str.setTitle("Data by KeyBoard :-");

							});

							rb1.setToggleGroup(group);
							rb2.setToggleGroup(group);
							rb3.setToggleGroup(group);
							Label l7=new Label("' Choose How To Fill  The Data '");
							l7.setFont(Font.font(40));
							// close the current stage 
							Button Exit2=new Button("Exit");
							Exit2.setPrefWidth(170);;
							Exit2.setPrefHeight(20);
							// go to previous stage 
							Button Go_Backe2=new Button("Go Back");
							Go_Backe2.setPrefWidth(170);
							Go_Backe2.setPrefHeight(20);
							// the HBox for go to the back screen or Exit this screen
							HBox cv2=new HBox(70,Exit2,Go_Backe2);
							cv2.setAlignment(Pos.CENTER);
							VBox v22=new VBox(40,rb1,rb2,rb3);
							v22.setAlignment(Pos.CENTER);
							VBox v2=new VBox(40,l7,v22,cv2);
							v2.setAlignment(Pos.CENTER);
							v2.setPadding(new Insets(30,40,0,30));
							BorderPane root = new BorderPane();
							root.setCenter(v2);
							root.setBackground(new Background(background));
							Scene scene = new Scene(root,700,600);
							scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

							Go_Backe2.setOnAction(w->{
								stage.show();
								x.close();
							});
							Exit2.setOnAction(w->{
								x.close();
							});
							x.setTitle(" Choose How To Fill  The Data :- ");
							x.setScene(scene);
							x.show();
						}

						// if the user entered odd number 
						else {
							ConisLable.setText(" 'Enter Even number you can't enetr odd number ' ");
							ConisLable.setFont(Font.font(20));
							ConisLable.setStyle("-fx-text-fill: red;");
						}

					}
				}
				// if the user enter character or double  not integer  
				catch (NumberFormatException d) {
					ConisLable.setText(" 'Just Integer no double or character ' ");
					ConisLable.setFont(Font.font(20));
					ConisLable.setStyle("-fx-text-fill: red;");
					System.out.println("Error: Invalid input string for parsing integer: " + d.getMessage());
				}



			});

		});
		// close the current stage 
		Button exit =new Button("Exit");
		exit.setPrefWidth(250);
		exit.setPrefHeight(30);
		exit.setFont(Font.font(15));
		HBox HB1=new HBox(30,computer,Two_Playre);

		HB1.setAlignment(Pos.CENTER);
		exit.setOnAction(e -> {
			pStage.close();
		});
		VBox VB2 =new VBox(45,VB1,HB1,exit);
		VB2.setAlignment(Pos.CENTER);


		BorderPane root = new BorderPane();
		// Set the background of the BorderPane
		root.setBackground(new Background(background));
		root.setCenter(VB2);
		Scene scene = new Scene(root,800,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		pStage.setScene(scene);
		pStage.setTitle("Welcom To The Game");
		pStage.show();
		return pStage;

	}

	// this method to choose file to read data frome it 
	private int[] file_choos(Stage primaryStage ,int n)  {
		Label messageLabel = new Label("Please select a Excel file .csv");
		messageLabel.setStyle("-fx-text-fill: Red; -fx-font-size: 24px;");
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select File 'Excel file .csv '");

		File file= fileChooser.showOpenDialog(primaryStage);
		if (file != null) {
			if(file.getName().endsWith("csv")) {

				int[] array;
				try {
					array = data.File_Data(file, n);
					return array;
				} catch (FileNotFoundException e) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setContentText("The File doe not contain this number of coines ,it only contains 50 ");
					alert.setTitle("File chooser ");
					alert.show();
				}

			}
			else {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setContentText(" Please select a Excel '.csv' file.");
				alert.setTitle("File chooser ");
				alert.show();
			}
		}
		else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setContentText("No file selected.");
			alert.getDialogPane().setStyle("-fx-text-fill: red;");
			alert.setTitle("File chooser ");
			alert.show();
		}
		return null;
	}

	//this show the stage to fill the Data of players 
	private void two_players_Stage1 (Stage primaryStage,Stage backStage,int [] x,Stage Firststage) {

		backStage.close();
		Label Labe2 = new Label(" Enter The First Player Name ");
		Labe2.setFont(Font.font(25));
		TextField textField1 = new TextField();
		textField1.setPrefWidth(350);
		textField1.setPrefHeight(30);
		HBox hb2=new HBox(textField1);
		VBox vb1=new VBox(30,Labe2,hb2);
		vb1.setAlignment(Pos.TOP_LEFT);

		Label Labe3 = new Label(" Enter The Second Player Name ");
		Labe3.setFont(Font.font(25));
		TextField textField2 = new TextField();
		textField2.setPrefWidth(350);
		textField2.setPrefHeight(30);
		HBox hb3=new HBox(textField2);
		VBox vb2=new VBox(30,Labe3,hb3);
		vb2.setAlignment(Pos.TOP_RIGHT);

		HBox hb4=new HBox(120,vb1,vb2);


		Label Labe4 = new Label(" Select Any Player How Start :- ");
		Labe4.setFont(Font.font(40));
		RadioButton player1= new RadioButton(" Player 1 ");
		player1.setOnAction(r->{

		});
		player1.setFont(Font.font(25));
		RadioButton player2 = new RadioButton(" Player 2 ");
		player2.setOnAction(r->{

		});
		player2.setFont(Font.font(25));
		ToggleGroup group = new ToggleGroup();
		player1.setToggleGroup(group);
		player2.setToggleGroup(group);
		HBox hb=new HBox(80,player1,player2);
		hb.setAlignment(Pos.CENTER);
		VBox vb3=new VBox(10,Labe4,hb);
		vb3.setAlignment(Pos.CENTER);
		Label labe1=new Label();
		Button Button1 = new Button(" Start to The Game ");
		Button1.setPrefWidth(500);
		Button1.setOnAction(d->{
			String player_1=textField1.getText();
			String player_2=textField2.getText();
			RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
			if((textField1.getText().isEmpty()==false ||textField2.getText().isEmpty()==false)&&
					(textField1.getText().isEmpty()==false && textField2.getText().isEmpty()==false)){
				if (selectedRadioButton != null) {
					String selectedText = selectedRadioButton.getText();
					String lk=selectedText;
					Stage f=new Stage();
					two_players_Stage2 (f,primaryStage,x,player_1,player_2,lk,Firststage);

				} else {

					labe1.setText("Select The First Player");
					labe1.setStyle("-fx-text-fill: red; -fx-font-size: 15;");
				} 
			}
			else {
				labe1.setText("Enter The Name for players ");
				labe1.setStyle("-fx-text-fill: red; -fx-font-size: 15;");
			}




		});
		Button Button2 = new Button("Exit");
		Button2.setOnAction(d->{
			primaryStage.close();
		});
		Button Button3 = new Button("Go Back ");
		Button3.setOnAction(d->{
			backStage.show();
			primaryStage.close();
		});
		Button3.setPrefWidth(150);
		Button3.setPrefHeight(30);
		Button3.setFont(Font.font(20));
		Button1.setPrefHeight(30);
		Button2.setPrefWidth(150);
		Button2.setPrefHeight(30);
		Button2.setFont(Font.font(20));
		Button1.setFont(Font.font(20));
		HBox hb5=new HBox(20,Button2,Button3);
		VBox vb77=new VBox(30,Button1,hb5);

		vb77.setAlignment(Pos.CENTER);
		hb5.setAlignment(Pos.CENTER);
		VBox vb4=new VBox(60,hb4,vb3,vb77,labe1);
		vb4.setAlignment(Pos.TOP_CENTER);
		vb4.setPadding(new Insets(20,30,0,30));
		vb4.setBackground(new Background(background));
		Scene scene = new Scene(vb4, 900, 550);
		primaryStage.setScene(scene);
		primaryStage.setTitle(" Enter Players Data :- ");
		primaryStage.show();

	}

	// the second stage for two player game 

	public void two_players_Stage2 (Stage primaryStage,Stage stage, int [] x,String player1,String player2,String Who,Stage firstStage) {
		stage.close(); //close the previous stage
		Label Label = new Label(" Welcom to the Game "); 
		Label.setFont(Font.font(50));
		Label.setPrefWidth(600);
		Label.setPrefHeight(70);
		//Label.setTextFill(Color.GOLD);
		HBox hb7=new HBox(Label);
		hb7.setAlignment(Pos.CENTER);
		hb7.setPadding(new Insets(0,100,10,200));

		Label Labe7 = new Label(); //Label to Know the turn for any Player 
		Label Labe8 = new Label();  // this label just show the text when the game finished
		HBox hb21=new HBox(Labe8);
		hb21.setAlignment(Pos.CENTER);
		HBox hb20=new HBox(Labe7);
		hb20.setAlignment(Pos.CENTER); 

		// to know how started 
		if( Who.equalsIgnoreCase(" Player 1 ")) {  
			Labe7.setText("Player 1 = '"+player1+"'  Turn");
			Labe7.setFont(Font.font(30));
			Labe7.setPrefWidth(600);
			Labe7.setPrefHeight(30);
			Labe7.setAlignment(Pos.CENTER);
		}
		else {
			Labe7.setText("Player 2 = '"+player2+"'  Turn");
			Labe7.setFont(Font.font(30));
			Labe7.setPrefWidth(600);
			Labe7.setPrefHeight(30);
			Labe7.setAlignment(Pos.CENTER);
		}

		// The name of player 1 and color
		Label Labe2 = new Label(player1);
		Labe2.setAlignment(Pos.CENTER_LEFT);
		Labe2 .setFont(Font.font(30));
		Labe2 .setPrefWidth(300);
		Labe2 .setPrefHeight(30);
		Rectangle p1flag= new Rectangle(100,20);
		p1flag.setFill(Color.BLUE);
		VBox t1=new VBox(3,Labe2,p1flag);
		t1.setAlignment(Pos.CENTER_LEFT);

		// The name of player 2 and color
		Label Labe3 = new Label(player2);
		Rectangle p2flag= new Rectangle(100,20);
		p2flag.setFill(Color.RED);
		Labe3 .setFont(Font.font(30));
		Labe3.setAlignment(Pos.CENTER_RIGHT);
		Labe3 .setPrefWidth(300);
		Labe3 .setPrefHeight(30);
		VBox t2=new VBox(3,Labe3,p2flag);
		t2.setAlignment(Pos.CENTER_RIGHT);
		HBox hb8=new HBox(30,t1,t2 );
		hb8.setPadding(new Insets(0,20,0,200));
		hb8.setAlignment(Pos.CENTER);


		BorderPane root3 = new BorderPane( hb8);
		root3.setAlignment(root3, Pos.CENTER);

		HBox hb = new HBox(20);
		hb.setAlignment(Pos.TOP_CENTER);
		hb.setPadding(new Insets(20,30,0,30));

		// this button to go to previous stage
		Button Button3 = new Button(" Go Back ");
		Button3.setPrefWidth(200);
		Button3.setPrefHeight(30);
		Button3.setOnAction(d->{
			primaryStage.close();
			stage.show();

		});

		// this button to close the current stage
		Button Button2 = new Button("Exit");
		Button2.setPrefWidth(200);
		Button2.setPrefHeight(30);
		Button2.setOnAction(d->{
			primaryStage.close();
		});
		Button Button4 = new Button("Play New Game");
		Button4.setAlignment(Pos.CENTER);
		Button4.setPrefWidth(400);
		Button2.setPrefHeight(30);
		Button4.setOnAction(d->{
			primaryStage.close();
			firstStage.show();
		});

		HBox hp=new HBox(50,Button2,Button3);
		hp.setAlignment(Pos.BOTTOM_CENTER);
		VBox hb4 = new VBox(40,hp, Button4);
		hb4.setAlignment(Pos.BOTTOM_CENTER);

		/* i do this arrays to make fi as first the counter and la as last counter 
		because  i can't change the value of fi and la if i in SetOnAction */
		int[] fi= new int [x.length];
		int[] la= new int [x.length];
		for(int i=0;i<fi.length;i++) {
			fi[i]=i;
		}
		for(int i=la.length,j=0;i>0;i--,j++) {
			la[j]=i-1;
		}



		////////////////////////////////////////////
		/* this Grid Pane to show the numbers and set the color 
		 above the number depending on the player*/
		GridPane gridPane = new GridPane();
		gridPane.setHgap(15); 
		gridPane.setVgap(10);
		gridPane.setAlignment(Pos.CENTER);
		int maxColumns = 20; 
		// this stack pane To make it more organized  
		StackPane[] stackPanes = new StackPane[x.length];
		Label[] label = new Label[x.length];
		for (int i =0; i <x.length; i++) {
			String st=String.valueOf(x[i]);
			label[i] = new Label (st);
			label[i].setFont(Font.font(20));
			label[i].setPadding(new Insets(10, 0, 0, 0)); 
			Rectangle flag= new Rectangle(20,10,Color.TRANSPARENT);
			flag.setFill(Color.WHITE);
			StackPane stack = new StackPane(flag,label[i]);
			stack.setAlignment(Pos.TOP_CENTER);

			int index=i;
			// Calculate row and column based on the index
			int row = i / maxColumns;
			int col = i % maxColumns;
			// Add TextField to the calculated position
			gridPane.add(stack, col, row);
			stackPanes[i] = stack;
		}

		VBox vbox = new VBox(25, gridPane);
		vbox.setAlignment(Pos.CENTER);
		// this the string to make the player chose the first or last just 
		String st2=String.valueOf(x[0]);
		String st3=String.valueOf(x[x.length-1]);

		ToggleGroup toggleGroup = new ToggleGroup();
		Label labl80=new Label("Select The Number :  ");
		labl80.setFont(Font.font(25));
		HBox hbox41=new HBox(labl80);
		hbox41.setAlignment(Pos.CENTER_LEFT);
		RadioButton firstButton = new RadioButton(st2);
		RadioButton lastButton = new RadioButton(st3);
		firstButton.setFont(Font.font(20));
		lastButton .setFont(Font.font(20));
		HBox hbox4=new HBox(60,hbox41,firstButton,lastButton);
		hbox4.setAlignment(Pos.CENTER);
		firstButton.setToggleGroup(toggleGroup);
		lastButton.setToggleGroup(toggleGroup);
		// counter b
		int[]b=new int[x.length];
		for(int i=1,j=0;i<=x.length;i++,j++) {
			b[j]=i;
		}
		// this two array list to add the value the player chose
		ArrayList<Integer> firstArray = new ArrayList<>(); // Player one values 
		ArrayList<Integer> SecoundArray = new ArrayList<>();// player two values
		// if the player click (chose)the first number 
		firstButton.setOnAction(e->{
			// if player 1 round
			if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
				String str8=firstButton.getText();
				Integer number = Integer.valueOf(str8);
				firstArray.add(number);
				// if player 2 round
			} else {
				String str8=firstButton.getText();
				Integer number = Integer.valueOf(str8);
				SecoundArray.add(number);
			}
			// if chose the  penultimate number الرقم قبل الاخير  
			if(b[0]<x.length-1 ) {
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					((Rectangle) stackPanes[fi[0]].getChildren().get(0)).setFill(Color.BLUE);
					Labe7.setText("Player 2 = '"+player2+"'  Turn");

				} else { 
					((Rectangle) stackPanes[fi[0]].getChildren().get(0)).setFill(Color.RED);
					Labe7.setText("Player 1 = '"+player1+"'  Turn");
				}
				String str5=String.valueOf(x[fi[0]+1]);
				firstButton.setText(str5);
				fi[0]++;
				toggleGroup.selectToggle(null);
				b[0]++;
			}

			else if(b[0]==x.length-1) {// if it the last one 
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					((Rectangle) stackPanes[fi[0]].getChildren().get(0)).setFill(Color.BLUE);
				} else {
					((Rectangle) stackPanes[fi[0]].getChildren().get(0)).setFill(Color.RED);
				}
				hbox4.getChildren().clear();
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					Labe7.setText("Player 2 = '"+player2+"'  Turn");
				} else {
					Labe7.setText("Player 1 = '"+player1+"'  Turn");
				}
				for(int i=0;i<stackPanes.length;i++) {
					// this to know the remaining values ​​are for any player
					if(Color.WHITE.equals(((Rectangle) stackPanes[i].getChildren().get(0)).getFill())) {
						if(Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
							((Rectangle) stackPanes[i].getChildren().get(0)).setFill(Color.BLUE);
							String str8=((Label)stackPanes[i].getChildren().get(1)).getText();
							Integer number = Integer.valueOf(str8);
							firstArray.add(number);
						}
						else {
							((Rectangle) stackPanes[i].getChildren().get(0)).setFill(Color.RED);
							String str8=((Label)stackPanes[i].getChildren().get(1)).getText();
							Integer number = Integer.valueOf(str8);
							SecoundArray.add(number);
						}
					}
				}

				Labe7.setVisible(false);;
				Labe8.setText("The fished 'click show result to show the result ' ");
				Labe8.setFont(Font.font(20));
				Labe8.setPrefWidth(600);
				Labe8.setPrefHeight(30);
				Labe8.setAlignment(Pos.CENTER);

				// show the result
				Button show=new Button("show result ");
				show.setOnAction(q->{
					Stage r=result(player1,player2,firstArray,SecoundArray,primaryStage);
					r.show();
				});
				show.setPrefWidth(200);
				show.setPrefHeight(30);
				HBox hb12=new HBox(show);
				hb12.setAlignment(Pos.TOP_CENTER);
				hb4.getChildren().add(0, hb12);
				b[0]++;
			}

		});

		// if the player click(chose) last number 
		lastButton.setOnAction(e ->{
			// if player 1 round
			if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
				String str8=lastButton.getText();
				Integer number = Integer.valueOf(str8);
				firstArray.add(number);

			} else {	// if player 2 round
				String str8=lastButton.getText();
				Integer number = Integer.valueOf(str8);
				SecoundArray.add(number);
			}

			if(b[0]<x.length-1) {// if chose the  penultimate number الرقم قبل الاخير 
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					((Rectangle) stackPanes[la[0]].getChildren().get(0)).setFill(Color.BLUE);
					Labe7.setText("Player 2 = '"+player2+"'  Turn");
				} else {
					((Rectangle) stackPanes[la[0]].getChildren().get(0)).setFill(Color.RED);
					Labe7.setText("Player 1 = '"+player1+"'  Turn");
				}
				String str5=String.valueOf(x[la[0]-1]);
				lastButton.setText(str5);
				la[0]--;
				toggleGroup.selectToggle(null);
				b[0]++;
			}
			else if(b[0]==x.length-1) {// the last chose 
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					((Rectangle) stackPanes[la[0]].getChildren().get(0)).setFill(Color.BLUE);
				} else {
					((Rectangle) stackPanes[la[0]].getChildren().get(0)).setFill(Color.RED);
				}
				hbox4.getChildren().clear();
				if (Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
					Labe7.setText("Player 2 = '"+player2+"'  Turn");
				} else {
					Labe7.setText("Player 1 = '"+player1+"'  Turn");
				}
				for(int i=0;i<stackPanes.length;i++) {
					// this to know the remaining values ​​are for any player
					if(Color.WHITE.equals(((Rectangle) stackPanes[i].getChildren().get(0)).getFill())) {
						if(Labe7.getText().equalsIgnoreCase("Player 1 = '"+player1+"'  Turn")) {
							((Rectangle) stackPanes[i].getChildren().get(0)).setFill(Color.BLUE);
							String str8=((Label)stackPanes[i].getChildren().get(1)).getText();
							Integer number = Integer.valueOf(str8);
							firstArray.add(number);
						}
						else {
							((Rectangle) stackPanes[i].getChildren().get(0)).setFill(Color.RED);
							String str8=((Label)stackPanes[i].getChildren().get(1)).getText();
							Integer number = Integer.valueOf(str8);
							SecoundArray.add(number);
						}
					}
				}
				Labe7.setVisible(false);;
				Labe8.setText("The fished 'click show result to show the result ' ");
				Labe8.setFont(Font.font(20));
				Labe8.setPrefWidth(600);
				Labe8.setPrefHeight(30);
				Labe8.setAlignment(Pos.CENTER);
				Button show=new Button("show result ");
				// show the result
				show.setOnAction(q->{
					Stage r=result(player1,player2,firstArray,SecoundArray,primaryStage);
					r.show();
				});
				show.setPrefWidth(200);
				show.setPrefHeight(30);
				HBox hb12=new HBox(show);
				hb12.setAlignment(Pos.TOP_CENTER);
				hb4.getChildren().add(0, hb12);

				b[0]++;

			}
		});



		VBox root = new VBox(30, hb7,hb20,hb21,gridPane,hbox4,root3,hb4);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(20,30,0,30));
		BorderPane root1 = new BorderPane(root);
		root1.setBackground(new Background(background));
		Scene scene = new Scene(root1, 1200, 750);
		primaryStage.setScene(scene);
		primaryStage.setTitle(" Coins Game  :-");
		primaryStage.show();

	}

	// this method to show the winer between the two players 
	private Stage result(String player1,String player2, ArrayList<Integer> list1, ArrayList<Integer> list2,Stage s) {
		Label L1=new Label("The Player one '"+player1+"'coines :- ");
		L1.setFont(Font.font(20));
		StringBuilder result = new StringBuilder();
		// to put all number of player one  in String   
		for (int i = 0; i < list1.size(); i++) {
			result.append(list1.get(i));
			if (i < list1.size() - 1) {
				result.append(",");  // Add a comma after each number except the last one
			}
		}
		// string contain the number that player one chose 
		String resultString = result.toString();  
		Label L3=new Label(resultString);
		L3.setFont(Font.font(20));
		// the sum of number that player one chose 
		int sum = 0;
		for (int i = 0; i < list1.size(); i++) {
			sum += list1.get(i);
		}
		// convert string to integer
		Label L5=new Label("The Sum ="+String.valueOf(sum));
		L5.setFont(Font.font(20));
		VBox vb1=new VBox(30,L1,L3,L5);
		vb1.setAlignment(Pos.CENTER);

		// to put all number of player two  in String   
		StringBuilder result1 = new StringBuilder(); 
		Label L2=new Label("The Player two '"+player2+"'coines :- ");
		L2.setFont(Font.font(20));
		// string contain the number that player two chose 
		for (int i = 0; i < list2.size(); i++) {
			result1.append(list2.get(i));
			if (i < list2.size() - 1) {
				result1.append(",");  // Add a comma after each number except the last one
			}
		}
		// string contain the number that player two chose 
		String resultString1 = result1.toString(); 
		Label L4=new Label(resultString1);
		L4.setFont(Font.font(20));
		// the sum of number that player two chose 
		int sum1 = 0;
		for (int i = 0; i < list2.size(); i++) {
			sum1 += list2.get(i);
		}
		Label L6=new Label("The Sum ="+String.valueOf(sum1));
		L6.setFont(Font.font(20));
		VBox vb2=new VBox(30,L2,L4,L6);
		vb2.setAlignment(Pos.CENTER);
		HBox hb=new HBox(100,vb1,vb2);
		hb.setAlignment(Pos.CENTER);
		Label L10=new Label();
		L10.setAlignment(Pos.CENTER);
		//to check who is the winer 
		if(sum>sum1) {
			L10.setText("The Winer is Player 1 '"+player1+"' "); 
			L10.setFont(Font.font(30));
			L10.setAlignment(Pos.CENTER);
		}
		else {
			L10.setText("The Winer is Player 2 '"+player2+"' "); 
			L10.setFont(Font.font(30));
			L10.setAlignment(Pos.CENTER);
		}
		// to go to the previous stage 
		Button GOBack=new Button("Go Back");
		GOBack.setPrefWidth(150);
		GOBack.setPrefHeight(30);
		// to close the current stage 
		Button Exit=new Button("Exit");
		Exit.setPrefWidth(150);
		Exit.setPrefHeight(30);

		HBox hb100=new HBox(30,Exit,GOBack);
		hb100.setAlignment(Pos.CENTER);
		VBox vb=new VBox(35,hb,L10,hb100);
		vb.setAlignment(Pos.CENTER);
		vb.setBackground(new Background(background));
		StackPane stackPane = new StackPane(vb);
		Scene scene = new Scene(stackPane, 700, 500);
		Stage x=new Stage();
		Exit.setOnAction(e->{
			x.close(); 
		});
		GOBack.setOnAction(e->{
			x.close();
			s.show();

		});
		x.setScene(scene);   
		x.setTitle("The Last Ressult :-");
		return x;
	}


	private Stage computerGame(int [][] dp,StringBuilder labelTextBuilder  ,int r,Stage x, Stage p) {
		x.close();
		Label lb1=new Label("The DP Table :-");
		lb1.setPrefWidth(500);
		lb1.setPrefHeight(35);
		lb1.setStyle("-fx-text-fill: gold;");
		lb1.setAlignment(Pos.CENTER);
		lb1.setFont(Font.font(30));
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		VBox layout = new VBox(20, lb1,gridPane);

		layout.setAlignment(Pos.TOP_CENTER);
		// print the dp(Dynamic Programming) table in the grid pane 
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(i==0&&j==0) { // the fist square in the top right
					Label cell2 = new Label(String.valueOf(j));
					Rectangle square = new Rectangle(40, 40); // Width and height set to make it a square
					square.setFill(Color.BLUE); // Set background color to blue
					square.setStroke(Color.BLACK); // Optional: Add a border
					square.setStrokeWidth(2); // 
					Label cell = new Label("j "+"/"+" i");
					cell.setStyle("-fx-text-fill: Black; -fx-font-size: 10;");
					StackPane squareWithText = new StackPane();
					squareWithText.getChildren().addAll(square,cell); // Add square and text to StackPane
					squareWithText.setPrefSize(20, 20); // Ens
					VBox vb=new VBox(10,cell2,squareWithText);
					Label cell3 = new Label(String.valueOf(j));
					HBox hb=new HBox(10,cell3,vb);
					hb.setAlignment(Pos.CENTER);
					vb.setAlignment(Pos.CENTER);
					gridPane.add(hb, j, i); // Add to GridPane at column=j, row=i
				}
				// the first row  in the table  
				else if(i==0) {
					Label cell2 = new Label(String.valueOf(j));
					Label cell = new Label(String.valueOf(dp[i][j]));
					Rectangle square = new Rectangle(40, 40); // Width and height set to make it a square
					square.setFill(Color.DEEPPINK); // Set background color to blue
					square.setStroke(Color.BLACK); // Optional: Add a border
					square.setStrokeWidth(2); // 
					square.setStyle("-fx-text-fill: Black; -fx-font-size: 10;");
					square.setAccessibleText(String.valueOf(dp[i][j]));
					cell.setStyle("-fx-text-fill: Black; -fx-font-size: 16;");
					StackPane squareWithText = new StackPane();
					squareWithText.getChildren().addAll(square ,cell); // Add square and text  to StackPane
					squareWithText.setPrefSize(20, 20);
					VBox vb=new VBox(10,cell2,squareWithText);
					vb.setAlignment(Pos.CENTER);
					gridPane.add(vb, j, i); // Add to GridPane at column=j, row=i
				}
				else if(j==0) {// the first square in the column  
					Label cell3 = new Label(String.valueOf(i));
					Label cell = new Label(String.valueOf(dp[i][j]));
					Rectangle square = new Rectangle(40, 40); // Width and height set to make it a square
					square.setFill(Color.AQUA); // Set background color to blue
					square.setStroke(Color.BLACK); // Optional: Add a border
					square.setStrokeWidth(2); // 
					square.setStyle("-fx-text-fill: Black; -fx-font-size: 10;");
					square.setAccessibleText(String.valueOf(dp[i][j]));
					cell.setStyle("-fx-text-fill: Black; -fx-font-size: 16;");
					StackPane squareWithText = new StackPane();
					squareWithText.getChildren().addAll(square ,cell); // Add square and text to StackPane
					squareWithText.setPrefSize(20, 20); 
					HBox hb=new HBox(10,cell3,squareWithText);
					hb.setAlignment(Pos.CENTER);
					gridPane.add(hb, j, i); // Add to GridPane at column=j, row=i
				}
				else { // show the dp table 
					Label cell = new Label(String.valueOf(dp[i][j]));
					Rectangle square = new Rectangle(40, 40); // Width and height set to make it a square
					square.setFill(Color.WHITE); // Set background color to blue
					square.setStroke(Color.BLACK); // Optional: Add a border
					square.setStrokeWidth(2); // 
					square.setStyle("-fx-text-fill: Black; -fx-font-size: 10;");
					square.setAccessibleText(String.valueOf(dp[i][j]));
					cell.setStyle("-fx-text-fill: Black; -fx-font-size: 16;");
					StackPane squareWithText = new StackPane();
					squareWithText.getChildren().addAll(square ,cell); // Add square and text to StackPane
					squareWithText.setPrefSize(20, 20); // Ens
					gridPane.add( squareWithText, j, i); // Add to GridPane at column=j, row=i
				}
			}
		}
		// show the numbers that makes The expected result.
		
	
		String labelText = labelTextBuilder.toString();
		Label label = new Label("The coins that give the expected result [] ="+labelText);
		label.setFont(Font.font(20));

		Label labe2 = new Label("Expected result ="+ String.valueOf(r));
		labe2.setPrefWidth(300);
		labe2.setFont(Font.font(20));
		// to close the current stage 
		Button Exit =new Button("Exit");
		Exit.setPrefWidth(150);
		Exit.setPrefHeight(30);
		// go to previous stage
		Button goback =new Button("Go Back");
		goback.setPrefWidth(150);
		goback.setPrefHeight(30);
		HBox hb2=new HBox(40,Exit,goback);
		hb2.setAlignment(Pos.CENTER);
		// this button to start new Game 
		Button newgame =new Button(" Play New Game ");
		newgame.setPrefWidth(150);
		newgame.setPrefHeight(30);
		HBox hb3=new HBox(  newgame);
		hb3.setAlignment(Pos.CENTER);

		VBox vbox=new VBox(40,layout ,label,labe2,hb2,hb3);
		vbox.setAlignment(Pos.CENTER);
		  StackPane root = new StackPane();
		   root.setBackground(new Background(background));
	        root.getChildren().add( vbox); 
	        ScrollPane scrollPane = new ScrollPane();
	        scrollPane.setContent(root);
	        scrollPane.setFitToWidth(true); // 
		Scene scene = new Scene(scrollPane, Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight());
	
		Stage primaryStage=new Stage ();
		Exit.setOnAction(e->{
			primaryStage.close();
		});
		goback.setOnAction(e->{
			primaryStage.close();
			x.show();
		});
		newgame.setOnAction(e->{
			primaryStage.close();
			p.show();
		});
		primaryStage.setTitle("Computer Game :- ");
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

		primaryStage.setTitle("The Optimal Strategy Game  using Dynamic Programming :-");
		primaryStage.setScene(scene);
		primaryStage.setX(screenBounds.getMinX());
		primaryStage.setY(screenBounds.getMinY());
		primaryStage.setWidth(screenBounds.getWidth());
		primaryStage.setHeight(screenBounds.getHeight());

		primaryStage.setMaximized(true);
		primaryStage.show();
		return primaryStage;
	}



	public static void main(String[] args) {
		launch(args);
	}
}
