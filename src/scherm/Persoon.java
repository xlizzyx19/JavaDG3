package scherm;

public class Persoon {

    private String voornaam;
    private String achternaam;


    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public void setVoornaam(String voornaam ) {
        this.voornaam = voornaam;
    }

    public String getVoornaam(){
        return voornaam;
    }

    public void setAchternaam(String achternaam ){
        this.achternaam = achternaam;
    }

    public String getAchternaam(){
        return achternaam;
    }

}
