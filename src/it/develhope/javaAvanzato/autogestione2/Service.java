package it.develhope.javaAvanzato.autogestione2;

public class Service {
    Database database = new Database();
    public void getAllSuperHost(){
        for ( Host proprietario : database.proprietaris ) {
            if (proprietario.getNumPrenotazioni() >= 100){
                database.superHost.add(proprietario);
            }
        }
    }
    public void stampaCaseHost(Host proprietario){
        for ( Abitazione casa : database.abitaziones ) {
            if (casa.proprietario.getCodiceHost() == proprietario.getCodiceHost()){
                casa.printDetailsHouse();
            }
        }
    }


}
