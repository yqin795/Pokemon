package nz.ac.auckland.se281;

import java.util.List;

/** This class is the main entry point. */
public class MapEngine {

  public MapEngine() {
    loadMap(); // keep this method invocation
  }

  /** Invoked one time only when constructing the MapEngine class. */
  private void loadMap() {

    List<String> countries = Utils.readCountries();
    List<String> adjacencies = Utils.readAdjacencies();
    // add code here to create your data structures
  }

  /** This method is invoked when the user runs the command info-country. */
  public void showInfoCountry() {}

  /** This method is invoked when the user runs the command info-continent. */
  public void showInfoContinent() {}

  /** This method is invoked when the user runs the command route. */
  public void showRoute() {}
}
