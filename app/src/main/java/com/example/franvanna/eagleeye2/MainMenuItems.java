package com.example.franvanna.eagleeye2;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Franvanna on 3/8/2018.
 */

public class MainMenuItems {

    public static List<MenuItem> getMainMenuItems(Resources res)

    {

        /*

        Intent intent = null;

        int id = view.getId();
        switch (id){

            case R.id.mainMenuCands:
                intent = new Intent(this, ActivityCandidates.class);
                break;

            case R.id.mainMenuVoteSimulation:
                intent = new Intent(this, ActivityVoteSimulation.class);
                break;



            case R.id.mainMenuListElec:
                intent = new Intent(this, ActivityListElectorral.class);
                break;

            case R.id.mainMenuResults:
                intent = new Intent(this, ActivityResults.class);
                break;

            case R.id.mainMenuBuroVote:
                intent = new Intent(this, ActivityBureauVote.class);
                break;



        }




        if(null != intent) {

            startActivity(intent);

        }

         */


        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(R.drawable.sim, res.getString(R.string.menu_vote_sim),R.id.mainMenuVoteSimulation ));
        menuItems.add(new MenuItem(R.drawable.le, res.getString(R.string.menu_list_elec),R.id.mainMenuListElec ));
        menuItems.add(new MenuItem(R.drawable.bv, res.getString(R.string.menu_buro_vote) ,R.id.mainMenuBuroVote));
        menuItems.add(new MenuItem(R.drawable.cands, res.getString(R.string.menu_cands),R.id.mainMenuCands ));
        menuItems.add(new MenuItem(R.drawable.res, res.getString(R.string.menu_results) ,R.id.mainMenuResults));
        menuItems.add(new MenuItem(R.drawable.sim, res.getString(R.string.menu_faq),-1 ));





        return menuItems;
    }
}
