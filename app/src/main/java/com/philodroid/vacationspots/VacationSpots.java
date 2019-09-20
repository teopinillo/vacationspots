package com.philodroid.vacationspots;

import java.util.ArrayList;

public class VacationSpots {

    private ArrayList<Destination_Bean> destinations;

    VacationSpots(){
        destinations = new ArrayList<>();
        destinations.add ( new Destination_Bean(R.drawable.albayzin,"Albayzin"));
        destinations.add ( new Destination_Bean(R.drawable.alcaiceria,"Alcaiceria"));
        destinations.add ( new Destination_Bean(R.drawable.alhambra,"Alhambra"));
        destinations.add ( new Destination_Bean(R.drawable.carreradeldarro,"Carrera del Darro"));
        destinations.add ( new Destination_Bean(R.drawable.corraldelcarbon,"Corral del Carbon"));
        destinations.add ( new Destination_Bean(R.drawable.generalife,"Generalife"));
        destinations.add ( new Destination_Bean(R.drawable.sierranevada,"Sierra Nevada"));
        destinations.add ( new Destination_Bean(R.drawable.granadacharterhouse,"Granada Charterhouse"));
        destinations.add ( new Destination_Bean(R.drawable.plazadesannicolas,"Plaza de San Nicolas"));
        destinations.add ( new Destination_Bean(R.drawable.royalchapel,"Royal Chapel"));
        destinations.add ( new Destination_Bean(R.drawable.sacromonte,"Sacromonte"));
        destinations.add ( new Destination_Bean(R.drawable.tapas,"Tapas"));
        destinations.add ( new Destination_Bean(R.drawable.thebannuelo,"The Bañuelo"));
        destinations.add ( new Destination_Bean(R.drawable.sciencepark,"Science Park"));
        destinations.add ( new Destination_Bean(R.drawable.granadacathedral,"Granada Chathedral"));
    }

    public ArrayList<Destination_Bean> getDestinations (){
        return destinations;
    }

    public void addDestination (int img, String placeName){

        destinations.add( new Destination_Bean(img,placeName));
    }
}
