/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	// Test du constructeur par défaut
        Orange orange1 = new Orange();
        System.out.println("Orange par défaut : " + orange1.toString());

        // Test du constructeur avec des valeurs personnalisées
        Orange orange2 = new Orange(0.75, "Maroc");
        System.out.println("Orange personnalisée : " + orange2.toString());

        // Test de la méthode setPrix
        orange1.setPrix(0.6);
        System.out.println("Nouveau prix pour orange1 : " + orange1.getPrix());

        // Test de la méthode setOrigine
        orange2.setOrigine("Italie");
        System.out.println("Nouvelle origine pour orange2 : " + orange2.getOrigine());

        // Test de la méthode equals
        Orange orange3 = new Orange(0.5, "Espagne");
        System.out.println("Comparaison orange1 et orange3 : " + orange1.equals(orange3));
        System.out.println("Comparaison orange2 et orange3 : " + orange2.equals(orange3));

        // Test de la méthode isSeedless
        System.out.println("Orange1 sans pépins : " + orange1.isSeedless());
        System.out.println("Orange2 sans pépins : " + orange2.isSeedless());
   }
}

