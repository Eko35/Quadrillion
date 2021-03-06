package ViewModels.PieceViews;

import DataModels.PieceDataModels.FPiece;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.geometry.Point3D;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.util.Duration;
import sample.Glob;

public class FPieceView extends PieceView {

    boolean colorBlind;

    public FPieceView(boolean isColorBlind){
        // Create the piece
        p = new FPiece();

        colorBlind = isColorBlind;

        // Draw the shape
        this.getPoints().addAll(gl*-1, gl*-2,
                gl*1, gl*-2,
                gl*1, gl*-1,
                gl*0, gl*-1,
                gl*0, gl*1,
                gl*-1, gl*1,
                gl*-1, gl*0,
                gl*-2, gl*0,
                gl*-2, gl*-1,
                gl*-1, gl*-1);

        // Paint the piece
        if(colorBlind){
            this.setFill(Glob.FPieceCBColor);
            this.setStroke(Glob.FPieceCBColor);

        }else {
            // Paint the piece
            this.setFill(Glob.FPieceDisplacedColor);
            this.setStroke(Glob.FPiecePlacedColor);
        }
    }

    public void rotate(){
        RotateTransition rot = new RotateTransition();
        rot.setDuration(Duration.seconds(animationTime));
        rot.setByAngle(90);
        rot.setAxis(new Point3D(0, 0, 1));
        rot.setNode(this);
        p.rotate();
        rot.play();
        rotating = true;
        rot.setOnFinished(e -> {
            if (p.getRotationEnum() == 4 || p.getRotationEnum() == 0) {
                ScaleTransition sca = new ScaleTransition();
                sca.setDuration(Duration.seconds(animationTime / 2));
                sca.setToX(p.getRotationEnum() == 4 ? -1 : 1);
                sca.setNode(this);
                sca.play();
                sca.setOnFinished(e2 ->
                        rotating = false
                );
            }
            else
                rotating = false;
        });
    }

    public void rotateWOAnimating(){
        // Rotate the visual
        this.getTransforms().add(new Rotate(p.getRotationEnum() <= 3 ? 90 : -90));

        // Compensate for incorrect rotation axis
        if(p.getRotationEnum() <= 3) {
            this.getTransforms().add(new Translate(0, gl));
        }

        if (p.getRotationEnum() == 3) {
            this.getTransforms().add(new Scale(-1, 1));
        }

        if(p.getRotationEnum() >= 3){
            this.getTransforms().add(new Translate(gl, 0));
        }


        // Rotate the structure
        p.rotate();
    }

    public void adjustColor(){
        if (colorBlind){
            this.setFill(Glob.FPieceCBColor);
        }
        else {
            if (placed)
                this.setFill(Glob.FPiecePlacedColor);
            else
                this.setFill(Glob.FPieceDisplacedColor);
        }
    }
}
