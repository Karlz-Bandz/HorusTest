import blocks.CeramicBlock;
import blocks.ClayBlock;
import blocks.ConcreteBlock;
import composite.classes.Wall;
import composite.interfaces.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new CeramicBlock("Black", "Ceramic"));
        blocks.add(new CeramicBlock("White", "Ceramic"));
        blocks.add(new ClayBlock("Pink", "Clay"));
        blocks.add(new ConcreteBlock("Gray", "Concrete"));
        blocks.add(new ConcreteBlock("Blue", "Concrete"));
        blocks.add(new ConcreteBlock("Yellow", "Concrete"));

        Wall wall = new Wall(blocks);

        Optional<Block> foundBlockByColor = wall.findBlockByColor("Blue");
        System.out.println("Color blue is present: " + foundBlockByColor.isPresent());

        List<Block> foundBlocksByMaterial = wall.findBlocksByMaterial("Concrete");
        for(Block c: foundBlocksByMaterial){
            System.out.println(c.getColor());
        }

        System.out.println(wall.count());
    }
}
