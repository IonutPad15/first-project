public class Masina {
    private String _Tip = "";
    private String _Culoare = "";
    private double _Viteza = 0.0;
    public void setTip(String tip) {
        _Tip = tip;
    }
    public void setCuloare(String culoare) {
        _Culoare = culoare;
    }
    public void setViteza(double viteza) {
        _Viteza = viteza;
    }
    public String getTip(){
        return _Tip;
    }
    public String getCuloare(){
        return _Culoare;
    }
    public double getViteza(){
        return _Viteza;
    }
    public String toString(){
        return "Tip: " + _Tip + "\nCuloare: " + _Culoare +"\nViteza: " + _Viteza;
    }
}
