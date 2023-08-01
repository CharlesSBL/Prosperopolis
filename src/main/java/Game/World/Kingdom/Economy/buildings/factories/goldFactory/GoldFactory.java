package Game.World.Kingdom.Economy.buildings.factories.goldFactory;

import Game.World.Kingdom.Economy.buildings.banks.goldBank.GoldBank;
import Game.World.Kingdom.Economy.buildings.factories.Factories;
import Game.World.Kingdom.Economy.kingdomResources.gold.Gold;
import Game.World.environment.resources.minerals.goldOre.GoldOre;

import java.util.ArrayList;

public class GoldFactory extends Factories {
    // zarys fabryki

    // << co musi robic >>
    //  1. przemieniac zloze zlota (gold ore) w zloto
    //      + transport musi zabierac to zloto i pchac w bank
    //      + tym zlotem mozna pozniej placic za armie i budowle i research
    //  2. kosztowac surowce i miec czas bodowy
    //  3. miec ilosc ludzi ktora bedzie zatrudniona

    // << << wymagania:
    //  1. wolni ludzie
    //  2. surowce na budowe
    //  3. zloza ktore zostaly transportowane -> do krolestwa -> a pozniej do fabryki
    //

    // budowa
    // bedzie mial czy sostojanija, zbudowane, w czasie, i nie zbudowane
    // w faktories bedzie funkcja ktora bedzie budowac za surowce

    // dobywac bedzie co godzine
    // bedzie dzien rozbity na 24 kroki
    // mozna ilesc poczekac i tyle razy ma byc iteracja zrobiona
    // po wszystkim pracujacym objektom

    ArrayList<Integer> GoldStorage;
    ArrayList<Integer> GoldOreStorage;

    String factoryName;

    public GoldFactory() {
        this.GoldStorage = new ArrayList<>();
        this.GoldOreStorage = new ArrayList<>();
//        this.factoryName = "factory_" + Factories.factoriesIndex;
    }

    public void convertGoldOre(){
        if(!this.GoldOreStorage.isEmpty()){
            int index = this.GoldOreStorage.size() - 1;

            this.GoldStorage.add(10);

            this.GoldOreStorage.remove(index);
        }else{
            System.out.println("Gold Ore Storage is empty in factory!!!");
        }
    }
    public void sendGold(){

    }

    public void convertGoldOre(GoldOre goldOre){
        // musi byc podzielony na kawalki maksymalnie np po 10 sztuk zlota
//        GoldBank.addToGold(
//                GoldBank.goldOre.numberOf
//        ) ;
    }
}
