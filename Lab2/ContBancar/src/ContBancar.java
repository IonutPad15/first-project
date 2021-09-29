public class ContBancar {
    private double _sold = 0.0;
    public ContBancar (double sold){
        _sold = sold;
    }
    public void depozitareSuma(double suma){
        _sold += suma;
    }
    public boolean retragereSuma(double suma){
        double verif = _sold - suma;
        if(verif >= 0)
        {
            _sold -= suma;
            return true;
        }
        return false;
    }
    public double interogareSold()
    {
        return _sold;
    }
}
