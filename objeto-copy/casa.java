
public class casa
{
   private String color;
   private int numPisos;
   private String material;
   private int numVentanas; 
   

   
    public casa(String color, int numPisos,String material, int numVentanas)
    {
        this.color = color;
        this.numPisos = numPisos;
        this.material = material;
        this.numVentanas = numVentanas;
    }

    
    public casa()
    {
        color = "ocre";
        numPisos = 2;
        material = "concreto";
        numVentanas = 5;

    }
    
    public String presentar()
    {
        String presentacion; 
        presentacion = "Esta casa es de color " + color + " y está construida con " + material; 
        return presentacion; 
    }   
     
    public String contar (){
        String contador;
        contador = "Esta casa tiene "+ numVentanas + " ventanas. Y tiene " + numPisos + " pisos";
        return contador; 
        } 
        
        
        
    
    public void setColor(String color)
    {
        this.color = color;
    }
     public String getColor(){
        return color; 
    }
    
    public void setNumPisos(int numPisos)
    {
        this.numPisos = numPisos;
    }
      public int getNumPisos(){
        return numPisos; 
    }
    
    public void setMaterial(String material)
    {
        this.material = material;
    }
     public String getMaterial(){
        return material; 
    }
    
    
    public void setNumVentanas(int numVentanas)
    {
        this.numVentanas = numVentanas;
    }
      public int getNumVentanas(){
        return numVentanas; 
    }
    
    

    
}
