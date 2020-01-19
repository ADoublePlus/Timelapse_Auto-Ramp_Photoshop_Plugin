import java.util.ArrayList;

/*
    This class inherits Change to store data when a temperature (color) change is detected between images.
    This class adds temperature data to the Change class.
 */
public class Temperature_Change extends Change {
    private int tempChange;

    // Initializes change data
    public Temperature_Change(ArrayList<Image> imgs, int sln, int pln) {
        super(imgs, sln, pln);

        increments = tempChange / totalImages;
    }

    // Gets temperature change data
    public int getTemperatureChange() {
        return tempChange;
    }

    // Sets temperature change
    public void setTemperatureChange(int tc) {
        tempChange = tc;
        increments = tempChange / totalImages;
    }
}