package com.example.vernon.gameapp.Factories;

import com.example.vernon.gameapp.Domain.GameRatings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameRatingsTest {

    private GameRatingsFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GameRatings gt = factory.GameRatingsFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getPrice(),"480");
        Assert.assertEquals(gt.getRating(),8);
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameRatings gt = factory.GameRatingsFactory("Games of Wars");

        // Updated Description follows

        GameRatings updateGameTitles = new GameRatings.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
