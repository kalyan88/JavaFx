package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InventoryData {
  
  private final StringProperty partId;
  
  private final StringProperty partName;
  
  private final StringProperty inventLevel;
  
  private final StringProperty price;

  public InventoryData(String partId, String partName, String inventLevel, String price) {
    this.partId = new SimpleStringProperty(partId);
    this.partName = new SimpleStringProperty(partName);
    this.inventLevel = new SimpleStringProperty(inventLevel);
    this.price = new SimpleStringProperty(price);
  }

  public final StringProperty partIdProperty() {
    return this.partId;
  }
  

  public final String getPartId() {
    return this.partIdProperty().get();
  }
  

  public final void setPartId(final String partId) {
    this.partIdProperty().set(partId);
  }
  

  public final StringProperty partNameProperty() {
    return this.partName;
  }
  

  public final String getPartName() {
    return this.partNameProperty().get();
  }
  

  public final void setPartName(final String partName) {
    this.partNameProperty().set(partName);
  }
  

  public final StringProperty inventLevelProperty() {
    return this.inventLevel;
  }
  

  public final String getInventLevel() {
    return this.inventLevelProperty().get();
  }
  

  public final void setInventLevel(final String inventLevel) {
    this.inventLevelProperty().set(inventLevel);
  }
  

  public final StringProperty priceProperty() {
    return this.price;
  }
  

  public final String getPrice() {
    return this.priceProperty().get();
  }
  

  public final void setPrice(final String price) {
    this.priceProperty().set(price);
  }

}
