import blocks.CeramicBlock;
import blocks.ClayBlock;
import blocks.ConcreteBlock;
import composite.classes.Wall;
import composite.interfaces.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall_Test
{
    private static Wall testWall;

    @BeforeAll
    public static void initTheWall()
    {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new CeramicBlock("Black", "Ceramic"));
        blocks.add(new CeramicBlock("White", "Ceramic"));
        blocks.add(new ClayBlock("Pink", "Clay"));
        blocks.add(new ConcreteBlock("Gray", "Concrete"));
        blocks.add(new ConcreteBlock("Blue", "Concrete"));
        blocks.add(new ConcreteBlock("Yellow", "Concrete"));

        testWall = new Wall(blocks);
    }

    @Test
    public void FindBlockByColor_Test()
    {
        Optional<Block> testBlock1 = testWall.findBlockByColor("Blue");
        Optional<Block> testBlock2 = testWall.findBlockByColor("Red");

        Assertions.assertTrue(testBlock1.isPresent());
        Assertions.assertFalse(testBlock2.isPresent());
    }

    @Test
    public void FindBlocksByMaterial_Test()
    {
        List<Block> foundBlocksTest1 = testWall.findBlocksByMaterial("Ceramic");
        List<Block> foundBlocksTest2 = testWall.findBlocksByMaterial("Clay");
        List<Block> foundBlocksTest3 = testWall.findBlocksByMaterial("Concrete");
        List<Block> foundBlocksTest4 = testWall.findBlocksByMaterial("Wood");

        Assertions.assertEquals(foundBlocksTest1.size(), 2);
        Assertions.assertEquals(foundBlocksTest2.size(), 1);
        Assertions.assertEquals(foundBlocksTest3.size(), 3);
        Assertions.assertEquals(foundBlocksTest4.size(), 0);
    }

    @Test
    public void Count_Test()
    {
        int countTest = testWall.count();

        Assertions.assertEquals(countTest, 6);
    }
}
