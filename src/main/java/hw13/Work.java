package hw13;

public class Work {
    public static void main(String[] args) {
        Shampoo acure = new Shampoo("Acure", "cetyl alcohol, laureth-5, lecithin, PEG-4 dilaurate, stearic acid, stearyl alcohol, " +
            "carboxylic acid, lactic acid, urea, sodium lactate, propylene glycol, glycerin, or polyvinylpyrrolidone", 7);
        acure.madeWhere();
        acure.store();
        acure.ingredients();

        System.out.println();
        String ing = "Citrus Aurantium Dulcis (Orange) Fruit Water, Glycerin, Iron Oxides, Microcrystalline Cellulose, Glyceryl Stearate SE, Beeswax, Jojoba Esters, " +
                "Copernicia Cerifera (Carnauba) Wax, Tapioca Starch, Oryza Sativa (Rice) Extract, Stearic Acid, Glycine Soja (Soybean) Oil, " +
                "Olea Europaea (Olive) Leaf Extract, Aloe Barbadensis Leaf Extract, Cucumis Sativus (Cucumber) Fruit Extract, Cellulose Gum, " +
                "Glycerin, Magnesium Aluminum Silicate, Glyceryl Caprylate, Leuconostoc/Radish Root Ferment Filtrate May Contain: " +
                "Titanium Dioxide </br></br> Ingredients from Organic Farming";
        Mascara ysl = new Mascara("Very black", "Volume", "YSL", 28, ing);
        ysl.madeWhere();
        ysl.store();
        ysl.ingredients();
    }
}
