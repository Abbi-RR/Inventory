public class DVD extends Product {
    int length;
    String ratio;
    String studio;

   
    public int getLength() {
        return this.length;
    }

   
    public void setLength(int length) {
        this.length = length;
    }

    
    public String getRatio() {
        return this.ratio;
    }

    
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    
    public String getStudio() {
        return this.studio;
    }

   
    public void setStudio(String studio) {
        this.studio = studio;
    }

    
    public DVD() {
        super();
        length = 0;
        ratio = "";
        studio = "";
    }

    
    public DVD(int length, String ratio, String studio, int number, String name, int quantity, double price) {
        super(number, name, quantity, price);  
        this.length = length;
        this.ratio = ratio;
        this.studio = studio;
    }
}
