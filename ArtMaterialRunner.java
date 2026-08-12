class ArtMaterialRunner {

    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial("Camlin", "Water Color", "Multi Color", "Non-Toxic",
        "Medium", "Painting", 12, 250.0, 180, true);
        a1.getArtMaterialDetails();
        System.out.println("---------------------------");


        ArtMaterial a2 = new ArtMaterial("Faber-Castell", "Color Pencil", "Multi Color", "Wood",
        "Large", "Drawing", 24, 300.0, 350, false);
        a2.getArtMaterialDetails();
        System.out.println("---------------------------");


        ArtMaterial a3 = new ArtMaterial("Brustro", "Acrylic Paint", "Multi Color", "Acrylic",
        "Small", "Canvas Painting", 10, 400.0, 500, true);
        a3.getArtMaterialDetails();
    }
}