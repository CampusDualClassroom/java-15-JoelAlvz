package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity,  Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        StringBuilder texto = new StringBuilder();
        texto.append("Localizacion: ").append(getLocation()).append("\n");
        texto.append("Fecha caducidad: ").append(dateFormat.format(getExpirationDate())).append("\n");
        return texto.toString();
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
