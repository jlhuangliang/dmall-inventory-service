
package com.dmall.inventory.model;

public class Inventory {

  private String inventoryId;

  private String name;

  private Integer amount;

  public Inventory() {
    super();

  }

  public Inventory(String inventoryId, String name, Integer amount) {
    super();
    this.inventoryId = inventoryId;
    this.name = name;
    this.amount = amount;
  }

  public String getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(String inventoryId) {
    this.inventoryId = inventoryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
}



