import java.util.ArrayList;

/*
    This class inherits Change to store data of images when an exposure change is detected between images.
    This class adds exposure data to the Change class.
 */
public class Exposure_Change extends Change {
    private double expoChange;

    // Initializes change data
    public Exposure_Change(ArrayList<Image> imgs, int sln, int pln) {
        super(imgs, sln, pln);

        increments = expoChange / totalImages;
    }

    // Gets exposure change data
    public double getExpoChange() {
        return expoChange;
    }

    // Sets the exposure change data
    public void setExpoChange(double ec) {
        expoChange = ec;
        increments = expoChange / totalImages;
    }

    // Sets increments across all images in change
    public void setIncrements() {
        increments = expoChange / totalImages;
    }
}