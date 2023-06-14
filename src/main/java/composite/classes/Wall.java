package composite.classes;

import composite.interfaces.Block;
import composite.interfaces.Structure;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure
{
    private List<Block> blocks;

    public Wall(List<Block> blocks)
    {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color)
    {
        Optional<Block> foundBlock = blocks.stream()
                .filter(block -> color.equals(block.getColor()))
                .findAny();

        return foundBlock;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material)
    {
        List<Block> foundBlocks = blocks.stream()
                .filter(block -> material.equals(block.getMaterial()))
                .collect(Collectors.toList());

        return foundBlocks;
    }

    @Override
    public int count()
    {
        return this.blocks.size();
    }
}
