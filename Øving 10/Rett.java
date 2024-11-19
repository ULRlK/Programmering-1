/**
 * En klasse som representerer en rett.
 * Oppskrift er i en string
 * og alle metodenavn er på engelsk
 */

public class Rett {
  private String name;
  private String recipe;
  private String type;
  private double price;

  public Rett(String name, String recipe, String type, int price) {
    this.name = name;
    this.recipe = recipe;
    this.type = type;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public String getRecipe() {
    return this.recipe;
  }

  public String getType() {
    return this.type;
  }

  public double getPrice() {
    return this.price;
  }
}
