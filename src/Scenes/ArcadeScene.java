package Scenes;

import DataModels.GameLevel;
import DataModels.Player;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import sample.Glob;
import sample.Main;

public class ArcadeScene extends QuadScene {

    private boolean colorBlind;

    public ArcadeScene(boolean isColorBlind) {
        //super(new Pane(), Glob.windowWidth(), Glob.windowHeight());
        super(new Pane(), 1600, 900);
        VBox mainLayout = new VBox();
        setRoot(mainLayout);

        colorBlind = isColorBlind;

        for (int i = 1; i <= 40; i++) {
            Button levelButton = new Button("Level " + i);
            mainLayout.getChildren().add(levelButton);
            final int level = i;
            levelButton.setOnAction(e -> {
                Main.mainStage.setScene(new ArcadeGameScene(new GameLevel(level), true, colorBlind));
            });
        }
    }
}
