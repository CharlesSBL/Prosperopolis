package Game.World.Kingdom.Economy.buildings.factories.goldFactory;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoldFactoryTest {
    private GoldFactory goldFactory;

    @Before
    public void setUp() {
        goldFactory = new GoldFactory();
    }

    @Test
    public void testConvertGoldOre() {
        // Test when there is GoldOre in the storage
        goldFactory.GoldOreStorage.add(1);
        goldFactory.convertGoldOre();
        assertEquals(1, goldFactory.GoldStorage.size());
        assertEquals(0, goldFactory.GoldOreStorage.size());

        // Test when GoldOreStorage is empty
        goldFactory.GoldOreStorage.clear();
        goldFactory.convertGoldOre();
        assertEquals(0, goldFactory.GoldStorage.size());
        // You may also check if the proper message is printed on the console
    }

    @Test
    public void testSendGold() {
        // TODO: Write test cases for the sendGold() method if required
    }

    // You can write more test methods to cover other functionalities of the GoldFactory class
}

